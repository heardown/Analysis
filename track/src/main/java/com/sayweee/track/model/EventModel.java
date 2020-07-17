package com.sayweee.track.model;

import com.sayweee.track.platform.IPlatform;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public class EventModel {
    IPlatform platform;
    public String eventName;
    public Map<String, Object> params;

    public EventModel(IPlatform platform, String eventName, Map<String, Object> params) {
        this.platform = platform;
        this.eventName = eventName;
        this.params = params;
    }

    public void track(){
        platform.track(eventName, params);
    }
}
