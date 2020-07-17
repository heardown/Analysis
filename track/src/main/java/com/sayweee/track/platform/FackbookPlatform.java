package com.sayweee.track.platform;

import android.content.Context;
import android.os.Bundle;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.sayweee.track.convert.FacebookConverter;
import com.sayweee.track.convert.IConverter;
import com.sayweee.track.model.EventModel;
import com.sayweee.track.core.PlatformConfig;
import com.sayweee.track.TrackConfig;
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
    private boolean enable;
    private String logFileName;
    private boolean logEnable;
    private IConverter converter;


    public static FackbookPlatform get() {
        return Builder.platform;
    }

    private static class Builder{
        private static FackbookPlatform platform = new FackbookPlatform();
    }

    public void setTrackOptions(boolean isLimit) {
        if (isLimit) { //为带有地理位置的用户启用 LDU
            FacebookSdk.setDataProcessingOptions(new String[]{"LDU"}, 0, 0);
        } else { //不启用 LDU 模式
            FacebookSdk.setDataProcessingOptions(new String[]{});
        }
    }

    public IPlatform init(PlatformConfig config) {

        return this;
    }

    @Override
    public IPlatform attach(Context context) {
        this.context = context;
        this.converter = new FacebookConverter();
        return this;
    }

    @Override
    public IPlatform enable(boolean enable) {
        this.enable = enable;
        return this;
    }

    @Override
    public IPlatform logConfig(String logFileName, boolean logEnable) {
        this.logFileName = logFileName;
        this.logEnable = logEnable;
        return this;
    }

    @Override
    public IPlatform customConverter(IConverter converter) {
        return this;
    }

    @Override
    public EventModel convert(String eventName, Map<String, Object> params) {
        return new EventModel(this, converter.convertEvent(eventName), converter.convertParameter(params));
    }

    @Override
    public EventModel convert(String eventName, String json) {
        return convert(eventName, Utils.convertMap(json));
    }

    @Override
    public int platformCode() {
        return 0;
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
