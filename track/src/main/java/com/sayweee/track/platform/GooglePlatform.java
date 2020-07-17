package com.sayweee.track.platform;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sayweee.track.Interceptor;
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
public class GooglePlatform implements IPlatform {

    private Context context;
    private static GooglePlatform platform = new GooglePlatform();

    public static GooglePlatform get() {
        return platform;
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
    public void intercept(Interceptor iInterceptor) {

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
        FirebaseAnalytics.getInstance(context).setUserId(userId);
    }

    @Override
    public void track(String eventName) {
        track(eventName, null);
    }

    @Override
    public void track(String eventName, Map<String, Object> params) {
        execTrack(eventName, Utils.convertBundle(params));
    }

    @Override
    public void trackByJson(String eventName, String json) {
        execTrack(eventName, Utils.convertBundle(json));
    }

    public void execTrack(String eventName, Bundle bundle) {
        FirebaseAnalytics.getInstance(context).logEvent(eventName, bundle);
    }
}
