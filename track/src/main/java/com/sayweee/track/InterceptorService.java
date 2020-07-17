package com.sayweee.track;

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

    void doInterceptions(IPlatform platform, String eventName, Map<String, Object> params);
}
