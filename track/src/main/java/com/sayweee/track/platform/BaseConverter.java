package com.sayweee.track.platform;

import com.sayweee.track.TrackManager;
import com.sayweee.track.convert.IConvert;
import com.sayweee.track.convert.IConverter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/7/23.
 * Desc:
 */
public class BaseConverter implements IConverter {

    protected IConvert iEventConvert;
    protected IConvert iParameterConvert;

    @Override
    public String convertEvent(String eventName) {
        String target = filterExtendEvent(eventName);
        if(target == null && iEventConvert != null) {
            target = iEventConvert.mapping(eventName);
        }
        if(target == null) {
            target = eventName;
        }
        return target;
    }

    @Override
    public Map<String, Object> convertParameter(Map<String, Object> params) {
        if(params != null && params.size() > 0) {
            Map<String, Object> holder = new HashMap<>();
            Iterator<Map.Entry<String, Object>> iterator = params.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Object> entry = iterator.next();
                String key = entry.getKey();
                String target = convertParameter(key);
                holder.put(target, entry.getValue());
            }
            return holder;
        }
        return params;
    }

    @Override
    public String convertParameter(String parameter) {
        String target = null;
        if(iParameterConvert != null) {
            target = iParameterConvert.mapping(parameter);
        }
        if(target == null) {
            target = parameter;
        }
        return target;
    }

    /**
     * 过滤主动设置的转换事件
     * @param eventName
     * @return
     */
    protected String filterExtendEvent(String eventName) {
        Map<String, String> params = TrackManager.get().getExtendMappingEvent();
        if(params != null && params.containsKey(eventName)) {
            return params.get(eventName);
        }
        return null;
    }

//    protected abstract IConvert getEventConvert();
//
//    protected abstract IConvert getiParameterConvertConvert();

}
