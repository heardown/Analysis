package com.sayweee.track.convert;

import com.sayweee.track.IPlatform;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public interface IConverter {

    /**
     * 转换事件名称
     * @param eventName
     * @return
     */
    String convertEvent(String eventName);

    /**
     * 转换事件参数
     * @param params
     * @return
     */
    Map<String, Object> convertParameter(Map<String, Object> params);

    /**
     * 转换事件参数
     * @param parameter
     * @return
     */
    String convertParameter(String parameter);
}
