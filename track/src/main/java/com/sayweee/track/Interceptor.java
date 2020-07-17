package com.sayweee.track;

import com.sayweee.track.callback.InterceptorCallback;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public interface Interceptor {

    void process(IPlatform platform, String eventName, Map<String, Object> params, InterceptorCallback callback);

}
