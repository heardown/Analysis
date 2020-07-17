package com.sayweee.track.platform;

import android.content.Context;
import android.os.Bundle;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.sayweee.track.IPlatform;
import com.sayweee.track.convert.IConverter;
import com.sayweee.track.utils.Utils;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public class FackbookPlatform implements IPlatform {

    private Context context;
    private static FackbookPlatform platform = new FackbookPlatform();

    public static FackbookPlatform get() {
        return platform;
    }

    public void setTrackOptions(boolean isLimit) {
        if (isLimit) { //为带有地理位置的用户启用 LDU
            FacebookSdk.setDataProcessingOptions(new String[]{"LDU"}, 0, 0);
        } else { //不启用 LDU 模式
            FacebookSdk.setDataProcessingOptions(new String[]{});
        }
    }

    @Override
    public void attach(Context context) {
        this.context = context;
    }

    @Override
    public void enable(boolean enable) {

    }

    @Override
    public void logConfig(String logFileName, boolean logEnable) {

    }


    @Override
    public void convert(IConverter convert) {

    }

    @Override
    public void startTrack() {

    }

    @Override
    public void endTrack() {

    }

    @Override
    public void setUserId(String userId) {
    }

    @Override
    public void track(String eventName) {
        execTrack(eventName, null);
    }

    @Override
    public void track(String eventName, Map<String, Object> params) {
        execTrack(eventName, Utils.convertBundle(params));
    }

    @Override
    public void trackByJson(String eventName, String json) {
        execTrack(eventName, Utils.convertBundle(json));
    }

    private void execTrack(String eventName, Bundle bundle) {
        AppEventsLogger.newLogger(context).logEvent(eventName, bundle);
    }

}
