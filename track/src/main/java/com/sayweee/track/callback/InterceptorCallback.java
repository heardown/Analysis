package com.sayweee.track.callback;

import com.sayweee.track.core.IPlatform;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public interface InterceptorCallback {

    /**
     * 继续处理
     * @param eventName
     * @param params
     */
    void onContinue(String eventName, Map<String, Object> params, boolean convert);

    /**
     * 拦截的回掉
     * @param platform
     * @param eventName
     * @param params
     */
    void onInterrupt(IPlatform platform, String eventName, Object params);
}
