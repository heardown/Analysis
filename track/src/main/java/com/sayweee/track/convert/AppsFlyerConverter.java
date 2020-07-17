package com.sayweee.track.convert;

import com.sayweee.track.convert.IConverter;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public class AppsFlyerConverter implements IConverter {

    @Override
    public String convertEvent(String eventName) {
        return eventName;
    }

    @Override
    public Map<String, Object> convertParameter(Map<String, Object> params) {
        return params;
    }

    @Override
    public String convertParameter(String parameter) {
        return parameter;
    }

}
