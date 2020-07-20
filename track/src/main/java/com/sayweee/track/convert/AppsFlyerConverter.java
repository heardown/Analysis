package com.sayweee.track.convert;


import com.sayweee.track.model.AppsFlyerEvent;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public class AppsFlyerConverter implements IConverter {

    AppsFlyerEvent appsFlyerEvent;
    public AppsFlyerConverter() {
        appsFlyerEvent = new AppsFlyerEvent();
    }

    @Override
    public String convertEvent(String eventName) {
        return appsFlyerEvent.mapping(eventName);
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
