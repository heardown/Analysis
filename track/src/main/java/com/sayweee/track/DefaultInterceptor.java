package com.sayweee.track;

import com.sayweee.track.callback.InterceptorCallback;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public class DefaultInterceptor implements Interceptor {

    @Override
    public void process(IPlatform platform, String eventName, Map<String, Object> params, InterceptorCallback callback) {
        if(true) {
            callback.onContinue(eventName, params);
        }else{
            callback.onInterrupt(platform, eventName, params);
        }
    }
}
