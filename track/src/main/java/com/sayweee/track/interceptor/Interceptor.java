package com.sayweee.track.interceptor;

import com.sayweee.track.core.IPlatform;
import com.sayweee.track.callback.InterceptorCallback;
import com.sayweee.track.model.Target;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public interface Interceptor {

    /**
     * 处理事件 注意处理事件时如无需拦截 请回掉给下个拦截器
     * @param platform
     * @param eventName
     * @param params
     * @param callback
     */
    void process(IPlatform platform, @Target.EventType int type, String eventName, Map<String, Object> params, boolean convert, InterceptorCallback callback);


    /**
     * 优先级  优先高优先处理  返回的数值越大，优先级越高
     * @return
     */
    int getPriority();
}
