package com.sayweee.track.platform.ga;

import android.app.Activity;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sayweee.track.core.IPlatform;
import com.sayweee.track.core.PlatformConfig;
import com.sayweee.track.core.TrackManagerIml;
import com.sayweee.track.model.Target;
import com.sayweee.track.platform.BasePlatform;
import com.sayweee.track.utils.Utils;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public class GooglePlatform extends BasePlatform {

    public static GooglePlatform get() {
        return Builder.platform;
    }

    private static class Builder {
        private final static GooglePlatform platform = new GooglePlatform();
    }

    private GooglePlatform() {
        this.converter = new GoogleConverter();
    }

    @Override
    public IPlatform init(PlatformConfig config) {
        super.init(config);
        FirebaseAnalytics.getInstance(context);
        return this;
    }

    @Override
    public void startTrack() {
        FirebaseAnalytics.getInstance(context).setAnalyticsCollectionEnabled(true);
    }

    @Override
    public void endTrack() {
        FirebaseAnalytics.getInstance(context).setAnalyticsCollectionEnabled(false);
    }

    @Override
    public void setUserId(String userId) {
        super.setUserId(userId);
        FirebaseAnalytics.getInstance(context).setUserId(userId);
    }

    @Override
    public int platformCode() {
        return Target.PLATFORM_GA;
    }

    @Override
    public void track(int type, String eventName, Map<String, Object> params) {
        if(type == Target.TYPE_PV) {
            Activity activity = TrackManagerIml.sInstance.getTopActivity();
            if(activity != null){
                log(activity.getClass().getName(), eventName);
                FirebaseAnalytics.getInstance(context).setCurrentScreen(activity, eventName, null);
            }
            return;
        }
        execTrack(eventName, Utils.convertBundle(params));
    }

    private void execTrack(String eventName, Bundle bundle) {
        if (enable) {
            log(eventName, bundle);
            FirebaseAnalytics.getInstance(context).logEvent(eventName, bundle);
        }
    }
}
