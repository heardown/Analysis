package com.sayweee.track.platform;

import android.content.Context;

import com.sayweee.track.convert.IConverter;
import com.sayweee.track.core.ITrack;
import com.sayweee.track.core.PlatformConfig;
import com.sayweee.track.model.EventModel;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:    platform basic function
 */
public interface IPlatform extends ITrack {

    /**
     * 依附当前的context
     * @param context
     * @return
     */
    IPlatform attach(Context context);

    /**
     * 初始化平台
     * @param config
     * @return
     */
    IPlatform init(PlatformConfig config);

    /**
     * 是否启动当前的平台
     * @param enable
     * @return
     */
    IPlatform enable(boolean enable);

    /**
     * 设置平台的日志参数
     * @param logFileName
     * @param logEnable
     * @return
     */
    IPlatform logConfig(String logFileName, boolean logEnable);

    /**
     * 设置自定义的事件转换器 默认无需设置 自带当前平台的标准事件转换
     * @param converter
     * @return
     */
    IPlatform customConverter(IConverter converter);

    /**
     * 把事件对应对应转换后生成对应的事件模型
     * @param eventName
     * @param params
     * @return
     */
    EventModel convert(String eventName, Map<String, Object> params);

    /**
     * 把事件对应对应转换后生成对应的事件模型
     * @param eventName
     * @param json
     * @return
     */
    EventModel convert(String eventName, String json);

    /**
     * 平台标识码
     * @return
     */
    int platformCode();
}
