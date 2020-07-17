package com.sayweee.track;


import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public interface ITrack {

    void startTrack();

    void endTrack();

    void setUserId(String userId);

    void track(String eventName);

    void track(String eventName, Map<String, Object> params);

    void trackByJson(String eventName, String json);
}
