package com.sayweee.track.platform;

import android.content.Context;

import com.sayweee.track.Interceptor;
import com.sayweee.track.IPlatform;
import com.sayweee.track.convert.IConverter;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public class WeeePlatform implements IPlatform {

    @Override
    public void attach(Context context) {

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

    }

    @Override
    public void track(String eventName, Map<String, Object> params) {

    }

    @Override
    public void trackByJson(String eventName, String json) {

    }
}
