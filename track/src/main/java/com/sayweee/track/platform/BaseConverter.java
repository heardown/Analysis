package com.sayweee.track.platform;

import com.sayweee.track.TrackManager;
import com.sayweee.track.convert.IConvert;
import com.sayweee.track.convert.IConverter;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/7/23.
 * Desc:
 */
public class BaseConverter implements IConverter {

    protected IConvert iConvert;

    @Override
    public String convertEvent(String eventName) {
        String target = filterExtendEvent(eventName);
        if (target == null && iConvert != null) {
            target = iConvert.mapping(eventName);
        }
        if (target == null) {
            target = eventName;
        }
        return target;
    }

    @Override
    public Map<String, Object> convertParameter(Map<String, Object> params) {
        return params;
    }

    @Override
    public String convertParameter(String parameter) {
        return parameter;
    }

    /**
     * 过滤主动设置的转换事件
     * @param eventName
     * @return
     */
    private String filterExtendEvent(String eventName) {
        Map<String, String> params = TrackManager.get().getExtendMappingEvent();
        if(params != null && params.containsKey(eventName)) {
            return params.get(eventName);
        }
        return null;
    }

}
