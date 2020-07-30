package com.sayweee.track.platform;

import android.content.Context;

import androidx.annotation.CallSuper;

import com.sayweee.logger.Logger;
import com.sayweee.track.convert.IConverter;
import com.sayweee.track.core.IPlatform;
import com.sayweee.track.core.PlatformConfig;
import com.sayweee.track.model.EventModel;
import com.sayweee.track.model.Target;
import com.sayweee.track.utils.Utils;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/7/23.
 * Desc:
 */
public abstract class BasePlatform implements IPlatform {
    protected Context context;
    protected boolean enable;
    protected String logFileName;
    protected boolean logEnable;
    protected IConverter converter;

    protected BasePlatform(){
        converter = new BaseConverter();
    }

    @Override
    public IPlatform attach(Context context) {
        this.context = context;
        return this;
    }

    @CallSuper
    @Override
    public IPlatform init(PlatformConfig config) {
        enable(config.enable);
        logConfig(config.logFileName, config.logEnable);
        if (config.converter != null) {
            customConverter(config.converter);
        }
        return this;
    }

    @Override
    public IPlatform updateConfig(PlatformConfig config) {
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
        this.converter = converter;
        return this;
    }

    @Override
    public IConverter getConverter() {
        return converter;
    }

    @Override
    public void setUserId(String userId) {
        log("userId: " + userId);
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
    public void track(String eventName) {
        track(eventName, null);
    }

    @Override
    public void track(String eventName, Map<String, Object> params) {
        track(Target.TYPE_ACTION, eventName, params);
    }

    @Override
    public void trackByJson(String eventName, String json) {
        track(eventName, Utils.convertMap(json));
    }

    public void log(Object... args) {
        Logger.f(logFileName).enable(logEnable).json(getClass().getSimpleName(), args);
    }
}
