package com.sayweee.track.core;


import com.sayweee.track.model.Target;
import com.sayweee.track.convert.IConverter;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/7/17.
 * Desc:    平台设置的基类
 */
public abstract class PlatformConfig {
    public boolean enable = true;
    public boolean logEnable = true;
    public String logFileName = "track/track";
    public String userId;
    public IConverter converter;

    public PlatformConfig setEnable(boolean enable) {
        this.enable = enable;
        return this;
    }

    public PlatformConfig setLogExtra(boolean logEnable, String logFileName) {
        this.logEnable = logEnable;
        this.logFileName = logFileName;
        return this;
    }

    public PlatformConfig setConverter(IConverter converter) {
        this.converter = converter;
        return this;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public abstract @Target.PlatformCode int getPerformCode();
}
