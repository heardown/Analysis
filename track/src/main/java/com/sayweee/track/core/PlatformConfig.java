package com.sayweee.track.core;

import com.sayweee.track.convert.IConverter;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/7/17.
 * Desc:    平台设置的基类
 */
public class PlatformConfig {
    public boolean enable = true;
    public boolean logEnable = true;
    public String logFileName;
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
}
