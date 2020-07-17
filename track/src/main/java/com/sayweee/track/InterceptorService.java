package com.sayweee.track;

import java.util.Map;

public interface InterceptorService {

    void addInterceptor(Interceptor interceptor);

    void removeInterceptor(Interceptor interceptor);

    void clearInterceptor();

    void doInterceptions(IPlatform platform, String eventName, Map<String, Object> params);
}
