package com.sayweee.track.platform;

import android.content.Context;

import com.sayweee.track.convert.IConverter;
import com.sayweee.track.convert.WeeeConverter;
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
public class WeeePlatform implements IPlatform {

    private IConverter converter;

    public static WeeePlatform get(){
        return Builder.platform;
    }

    private static class Builder{
        final static WeeePlatform platform = new WeeePlatform();
    }

    public IPlatform init(PlatformConfig config) {
        return this;
    }

    @Override
    public IPlatform attach(Context context) {
        this.converter = new WeeeConverter();
        return this;
    }

    @Override
    public IPlatform enable(boolean enable) {
        return this;
    }

    @Override
    public IPlatform logConfig(String logFileName, boolean logEnable) {
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

    }

    @Override
    public void track(String eventName) {
        track(eventName, null);
    }

    @Override
    public void track(String eventName, Map<String, Object> params) {
        execTrack(eventName, params);
    }

    @Override
    public void trackByJson(String eventName, String json) {
        track(eventName, Utils.convertMap(json));
    }

    private void execTrack(String eventName, Map<String, Object> params){

    }
}
