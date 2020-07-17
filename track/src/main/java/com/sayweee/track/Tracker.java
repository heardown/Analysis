package com.sayweee.track;

import android.app.Application;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/7/17.
 * Desc:
 */
public abstract class Tracker  {

    abstract void init(Application application, TrackConfig config);

    abstract void track(String eventName);

    abstract void track(String eventName, Map<String, Object> params);

    abstract void trackByJson(String track, String json);

    abstract void addInterceptor(Interceptor interceptor);

    abstract void removeInterceptor(Interceptor interceptor);

    abstract void clearInterceptor();
}
