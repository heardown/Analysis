package com.sayweee.track.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import com.sayweee.track.TrackConfig;
import com.sayweee.track.TrackManager;
import com.sayweee.track.interceptor.DefaultInterceptor;
import com.sayweee.track.interceptor.Interceptor;
import com.sayweee.track.platform.AppsFlayerPlatform;
import com.sayweee.track.platform.FackbookPlatform;
import com.sayweee.track.platform.GooglePlatform;
import com.sayweee.track.platform.IPlatform;
import com.sayweee.track.platform.WeeePlatform;
import com.sayweee.track.utils.Utils;

import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public class TrackManagerIml extends TrackManager {

    private Context context;
    private InterceptorService service;

    private ActivityLifecycleImpl lifecycleIml;

    public static TrackManagerIml sInstance = new TrackManagerIml();

    private List<IPlatform> platforms = new ArrayList<>();

    protected TrackManagerIml(){
        service = new InterceptorServiceIml();
        addInterceptor(new DefaultInterceptor());
    }

    @Override
    public void init(Application application, TrackConfig config) {
        context = application;
        create(config);
//        lifecycleIml = new ActivityLifecycleImpl();
//        application.registerActivityLifecycleCallbacks(lifecycleIml);
    }

    @Override
    public void track(String eventName) {
        track(eventName, true);
    }

    @Override
    public void track(String eventName, boolean convert) {
        track(eventName, null, convert);
    }


    @Override
    public void track(String eventName, final Map<String, Object> params) {
      track(eventName, params, true);
    }

    @Override
    public void track(String eventName, Map<String, Object> params, boolean convert) {
        processInterceptor(eventName, params, convert);
    }


    @Override
    public void trackByJson(String eventName, String json) {
        trackByJson(eventName, json, true);
    }

    @Override
    public void trackByJson(String eventName, String json, boolean convert) {
        track(eventName, Utils.convertMap(json), convert);
    }


    @Override
    public void addInterceptor(Interceptor interceptor) {
        service.addInterceptor(interceptor);
    }

    @Override
    public void removeInterceptor(Interceptor interceptor){
       service.removeInterceptor(interceptor);
    }

    @Override
    public void clearInterceptor() {
        service.clearInterceptor();
    }

    private void create(TrackConfig config) {
        if(config != null) {
            if(config.getAppsFlyerConfig() != null) {
                platforms.add(AppsFlayerPlatform.get().attach(context).init(config.getAppsFlyerConfig()));
            }
            if(config.getFacebookConfig() != null) {
                platforms.add(FackbookPlatform.get().attach(context).init(config.getFacebookConfig()));
            }
            if(config.getAppsFlyerConfig() != null) {
                platforms.add(GooglePlatform.get().attach(context).init(config.getGoogleConfig()));
            }
            if(config.getAppsFlyerConfig() != null) {
                platforms.add(WeeePlatform.get().attach(context).init(config.getWeeeConfig()));
            }
        }
    }


    private void processInterceptor(final String eventName, final Map<String, Object> params, boolean convert){
        for(IPlatform platform : platforms) {
            service.doInterceptions(platform, eventName, params, convert);
        }
    }

    private class ActivityLifecycleImpl implements Application.ActivityLifecycleCallbacks{
        final LinkedList<WeakReference<Activity>> mActivityList = new LinkedList<>();

        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            setTopActivity(activity);
        }

        @Override
        public void onActivityStarted(Activity activity) {
            setTopActivity(activity);
        }

        @Override
        public void onActivityResumed(Activity activity) {
            setTopActivity(activity);
        }

        @Override
        public void onActivityPaused(Activity activity) {

        }

        @Override
        public void onActivityStopped(Activity activity) {

        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

        }

        @Override
        public void onActivityDestroyed(Activity activity) {
            WeakReference<Activity> activityWeakReference = find(activity);
            if (activityWeakReference != null) {
                mActivityList.remove(activityWeakReference);
            }
        }

        WeakReference<Activity> find(Activity activity) {
            Activity weakAct;
            for (WeakReference<Activity> activityWeakReference : mActivityList) {
                weakAct = activityWeakReference.get();
                if (weakAct != null && weakAct.equals(activity)) {
                    return activityWeakReference;
                }
            }
            return null;
        }

        private void setTopActivity(final Activity activity) {
            WeakReference<Activity> activityWeakReference = find(activity);
            if (activityWeakReference == null) {
                mActivityList.addLast(new WeakReference<>(activity));
            } else {
                mActivityList.remove(activityWeakReference);
                mActivityList.addLast(activityWeakReference);
            }
        }

        Activity getTopActivity() {
            if (!mActivityList.isEmpty()) {
                WeakReference<Activity> last = mActivityList.getLast();
                if (last != null && last.get() != null) {
                    return last.get();
                }
            }
            // using reflect to get top activity
            try {
                @SuppressLint("PrivateApi")
                Class<?> activityThreadClass = Class.forName("android.app.ActivityThread");
                Object activityThread = activityThreadClass.getMethod("currentActivityThread").invoke(null);
                Field activitiesField = activityThreadClass.getDeclaredField("mActivityList");
                activitiesField.setAccessible(true);
                Map activities = (Map) activitiesField.get(activityThread);
                if (activities == null) return null;
                for (Object activityRecord : activities.values()) {
                    Class activityRecordClass = activityRecord.getClass();
                    Field pausedField = activityRecordClass.getDeclaredField("paused");
                    pausedField.setAccessible(true);
                    if (!pausedField.getBoolean(activityRecord)) {
                        Field activityField = activityRecordClass.getDeclaredField("activity");
                        activityField.setAccessible(true);
                        Activity activity = (Activity) activityField.get(activityRecord);
                        setTopActivity(activity);
                        return activity;
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}
