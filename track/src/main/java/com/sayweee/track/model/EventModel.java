package com.sayweee.track.model;

import com.sayweee.track.core.IPlatform;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public class EventModel {
    IPlatform platform;
    public int type;
    public String eventName;
    public Map<String, Object> params;

    public EventModel(IPlatform platform, String eventName, Map<String, Object> params) {
        this.platform = platform;
        this.eventName = eventName;
        this.params = params;
    }

    public void track(){
        platform.track(type, eventName, params);
    }

    public EventModel withType(int type) {
        this.type = type;
        return this;
    }
}
