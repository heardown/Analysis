package com.sayweee.track.interceptor;

import com.sayweee.track.platform.IPlatform;
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
    public void process(IPlatform platform, String eventName, Map<String, Object> params, boolean convert, InterceptorCallback callback) {
        if(convert) {
            platform.convert(eventName, params).track();
        }else{
            platform.track(eventName, params);
        }
    }


    @Override
    public int getPriority() {
        return 0;
    }
}
