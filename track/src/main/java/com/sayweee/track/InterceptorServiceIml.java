package com.sayweee.track;

import com.sayweee.track.callback.InterceptorCallback;

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
    public void doInterceptions(final IPlatform platform, final String eventName, final Map<String, Object> params) {
        if(interceptors != null && interceptors.size() > 0) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    exec(0,  platform, eventName, params);
                }
            });

        }
    }

    private void exec(final int index, final IPlatform platform, String eventName, Map<String, Object> params){
        if(index < interceptors.size()) {
            Interceptor interceptor = interceptors.get(index);

            interceptor.process(platform, eventName, params, new InterceptorCallback() {
                @Override
                public void onContinue(String eventName, Map<String, Object> params) {
                    exec(index + 1, platform,  eventName, params);
                }

                @Override
                public void onInterrupt(IPlatform platform, String eventName, Map<String, Object> params) {

                }
            });
        }
    }
}
