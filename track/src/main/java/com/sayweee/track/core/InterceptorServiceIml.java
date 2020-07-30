package com.sayweee.track.core;

import com.sayweee.logger.Logger;
import com.sayweee.track.callback.InterceptorCallback;
import com.sayweee.track.interceptor.Interceptor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:    拦截器事件分发实现
 */
public class InterceptorServiceIml implements InterceptorService {

    final List<Interceptor> interceptors = new ArrayList<>();
    final Executor executor;

    public InterceptorServiceIml() {
         executor = Executors.newSingleThreadExecutor();
    }

    public void addInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
        //排序 倒序
        Collections.sort(interceptors, new Comparator<Interceptor>() {
            @Override
            public int compare(Interceptor o1, Interceptor o2) {
                return o2.getPriority() - o1.getPriority();
            }
        });
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
    public void doInterceptions(final IPlatform platform, final int type, final String eventName, final Map<String, Object> params, final boolean convert) {
        if(interceptors != null && interceptors.size() > 0) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    exec(0,  platform, type, eventName, params, convert);
                }
            });
        }
    }


    private void exec(final int index, final IPlatform platform, final int type, String eventName, Map<String, Object> params, boolean convert){
        if(index < interceptors.size()) {
            Interceptor interceptor = interceptors.get(index);

            interceptor.process(platform, type, eventName, params, convert, new InterceptorCallback() {
                @Override
                public void onContinue(String eventName, Map<String, Object> params, boolean convert) {
                    exec(index + 1, platform, type, eventName, params, convert);
                }


                @Override
                public void onInterrupt(IPlatform platform, String eventName, Object params) {

                }
            });
        }
    }

}
