package com.sayweee.track.core;

import com.sayweee.track.callback.InterceptorCallback;
import com.sayweee.track.interceptor.Interceptor;
import com.sayweee.track.platform.IPlatform;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public class InterceptorServiceIml implements InterceptorService {

    final List<Interceptor> interceptors = new ArrayList<>();
    final Executor executor;

    public InterceptorServiceIml() {
         executor = Executors.newSingleThreadExecutor();
    }

    public void addInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
    }

    public void removeInterceptor(Interceptor interceptor){
        if(interceptors.contains(interceptor)) {
            interceptors.remove(interceptor);
        }
    }

    @Override
    public void clearInterceptor() {
        interceptors.clear();
    }

    @Override
    public void doInterceptions(final IPlatform platform, final String eventName, final Map<String, Object> params, final boolean convert) {
        if(interceptors != null && interceptors.size() > 0) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    exec(0,  platform, eventName, params, convert);
                }
            });
        }
    }


    private void exec(final int index, final IPlatform platform, String eventName, Map<String, Object> params, boolean convert){
        if(index < interceptors.size()) {
            Interceptor interceptor = interceptors.get(index);

            interceptor.process(platform, eventName, params, convert, new InterceptorCallback() {
                @Override
                public void onContinue(String eventName, Map<String, Object> params, boolean convert) {
                    exec(index + 1, platform,  eventName, params, convert);
                }


                @Override
                public void onInterrupt(IPlatform platform, String eventName, Object params) {

                }
            });
        }
    }

}
