package com.sayweee.track.platform;

import android.os.Build;

import androidx.annotation.CallSuper;

import com.sayweee.track.model.IEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/8/3.
 * Desc:
 */
public abstract class BaseEventIml implements IEvent {

    protected Map<String, String> eventMap;

    public BaseEventIml() {
        buildMappingEvent();
    }

    @CallSuper
    @Override
    public void buildMappingEvent() {
        eventMap = new HashMap<>();
    }

    @Override
    public void addMappingEvent(String key, String value) {
        if (key != null) {
            eventMap.put(key, value);
        }
    }

    @Override
    public void replaceMappingEvent(String key, String value) {
        if (key != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                eventMap.replace(key, value);
            } else {
                eventMap.put(key, value);
            }
        }
    }

    @Override
    public void removeMappingEvent(String key) {
        if (key != null && eventMap.containsKey(key)) {
            eventMap.remove(key);
        }
    }

    @Override
    public String mapping(String key) {
        if (key != null && eventMap.containsKey(key)) {
            return eventMap.get(key);
        }
        return key;
    }
}
