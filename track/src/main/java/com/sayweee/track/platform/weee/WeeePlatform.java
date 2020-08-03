package com.sayweee.track.platform.weee;

import com.sayweee.track.model.Target;
import com.sayweee.track.platform.BasePlatform;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public class WeeePlatform extends BasePlatform {

    public static WeeePlatform get() {
        return Builder.platform;
    }

    private static class Builder {
        final static WeeePlatform platform = new WeeePlatform();
    }

    private WeeePlatform() {
        this.converter = new WeeeConverter();
    }

    @Override
    public int platformCode() {
        return Target.PLATFORM_WEEE;
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
    public void track(int type, String eventName, Map<String, Object> params) {
        log(eventName, params);
        execTrack(eventName, params);
    }


    private void execTrack(String eventName, Map<String, Object> params) {

    }
}
