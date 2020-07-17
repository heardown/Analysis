package com.sayweee.track;

import com.alibaba.android.arouter.thread.CancelableCountDownLatch;
import com.sayweee.track.callback.InterceptorCallback;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public class InterceptorServiceIml implements InterceptorService {

    final List<Interceptor> interceptors = new ArrayList<>();

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
    public void doInterceptions(IPlatform platform, String eventName, Map<String, Object> params) {
        if(interceptors != null && interceptors.size() > 0) {
            CancelableCountDownLatch counter = new CancelableCountDownLatch(interceptors.size());
            exec(0,  platform, counter, eventName, params);
        } else {
            platform.track(eventName, params);
        }
    }

    private void exec(final int index, final IPlatform platform, final CancelableCountDownLatch counter, String eventName, Map<String, Object> params){
        if(index < interceptors.size()) {
            Interceptor interceptor = interceptors.get(index);

            interceptor.process(platform, eventName, params, new InterceptorCallback() {
                @Override
                public void onContinue(String eventName, Map<String, Object> params) {
                    counter.countDown();
                    exec(index + 1, platform, counter,  eventName, params);
                }

                @Override
                public boolean onInterrupt(IPlatform platform, String eventName, Map<String, Object> params) {
                    counter.cancel();
                    return false;
                }
            });
        }
    }
}
