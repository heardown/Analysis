package com.sayweee.track.platform.fb;

import android.os.Bundle;
import android.util.ArrayMap;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.sayweee.track.core.PlatformConfig;
import com.sayweee.track.model.Target;
import com.sayweee.track.core.IPlatform;
import com.sayweee.track.platform.BasePlatform;
import com.sayweee.track.utils.Utils;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public class FackbookPlatform extends BasePlatform {

    private AppEventsLogger logger;

    public static FackbookPlatform get() {
        return Builder.platform;
    }

    private static class Builder{
        private static FackbookPlatform platform = new FackbookPlatform();
    }

    private FackbookPlatform() {
        this.converter = new FacebookConverter();
    }

    @Override
    public IPlatform init(PlatformConfig config) {
        super.init(config);
        this.logger = AppEventsLogger.newLogger(context);
        return this;
    }

    @Override
    public int platformCode() {
        return Target.PLATFORM_FB;
    }

    @Override
    public void startTrack() {
        FacebookSdk.setAutoLogAppEventsEnabled(false);
    }

    @Override
    public void endTrack() {
        FacebookSdk.setAutoLogAppEventsEnabled(true);
    }

    @Override
    public void setUserId(String userId) {
        super.setUserId(userId);
        AppEventsLogger.setUserID(userId);
    }

    @Override
    public void track(int type, String eventName, Map<String, Object> params) {
        if(type == Target.TYPE_PV) {
            Bundle bundle = new Bundle();
            bundle.putString("page", eventName);
            execTrack("pv", bundle);
            return;
        }
        execTrack(eventName, Utils.convertBundle(params));
    }

    private void execTrack(String eventName, Bundle bundle) {
        if(isEnable() && logger != null) {
            log(eventName, bundle);
            logger.logEvent(eventName, bundle);
        }
    }

    /**
     * ldu设置
     * @param isLimit
     */
    public void setTrackOptions(boolean isLimit) {
        log("facebook ldu: " + isLimit);
        if (isLimit) { //为带有地理位置的用户启用 LDU
            FacebookSdk.setDataProcessingOptions(new String[]{"LDU"}, 0, 0);
        } else { //不启用 LDU 模式
            FacebookSdk.setDataProcessingOptions(new String[]{});
        }
    }

}
