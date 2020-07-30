package com.sayweee.track.core;


import com.sayweee.track.model.Target;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:    track的具体操作
 */
public interface ITrack {
    /**
     * 开始事件上报
     */
    void startTrack();

    /**
     * 结束事件上报
     */
    void endTrack();

    /**
     * 关联当前的用户ID
     *
     * @param userId
     */
    void setUserId(String userId);

    /**
     * 上报事件
     *
     * @param eventName
     */
    void track(String eventName);

    /**
     * 带参数上报事件
     *
     * @param eventName
     * @param params
     */
    void track(String eventName, Map<String, Object> params);

    /**
     * 埋点
     * @param eventName
     * @param params
     * @param type          埋点类型
     */
    void track(@Target.EventType int type, String eventName, Map<String, Object> params);

    /**
     * 上报事件，json字符串自动转换成对应平台参数
     *
     * @param eventName
     * @param json
     */
    void trackByJson(String eventName, String json);


}
