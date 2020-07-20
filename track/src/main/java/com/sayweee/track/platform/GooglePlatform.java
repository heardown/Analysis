package com.sayweee.track.platform;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sayweee.track.convert.GoogleConverter;
import com.sayweee.track.convert.IConverter;
import com.sayweee.track.model.TrackEvent;
import com.sayweee.track.core.PlatformConfig;
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
    private boolean enable;
    private String logFileName;
    private boolean logEnable;
    private GoogleConverter converter;

    public static GooglePlatform get() {
        return Builder.platform;
    }

    private static class Builder{
        private final static GooglePlatform platform = new GooglePlatform();
    }

    public IPlatform init(PlatformConfig config) {

        return this;
    }

    @Override
    public IPlatform attach(Context context) {
        this.context = context;
        this.converter = new GoogleConverter();
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
    public TrackEvent convert(String eventName, Map<String, Object> params) {
        return new TrackEvent(this, converter.convertEvent(eventName), converter.convertParameter(params));
    }

    @Override
    public TrackEvent convert(String eventName, String json) {
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
