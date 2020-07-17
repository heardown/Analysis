package com.sayweee.track.core;

import com.sayweee.track.interceptor.Interceptor;
import com.sayweee.track.platform.IPlatform;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public interface InterceptorService {

    void addInterceptor(Interceptor interceptor);

    void removeInterceptor(Interceptor interceptor);

    void clearInterceptor();

    /**
     * 把事件分发到拦截器
     * @param platform
     * @param eventName
     * @param params
     * @param convert
     */
    void doInterceptions(IPlatform platform, String eventName, Map<String, Object> params, boolean convert);

}
