package com.sayweee.track;

import android.content.Context;

import com.sayweee.track.convert.IConverter;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:    platform basic function
 */
public interface IPlatform extends ITrack{

    void attach(Context context);

    void enable(boolean enable);

    void logConfig(String logFileName, boolean logEnable);

    void convert(IConverter convert);
}
