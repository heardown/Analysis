package com.sayweee.track.platform;


import android.content.Context;
import android.text.TextUtils;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerTrackingRequestListener;
import com.sayweee.logger.LogAdapter;
import com.sayweee.logger.Logger;
import com.sayweee.track.EventModel;
import com.sayweee.track.Interceptor;
import com.sayweee.track.IPlatform;
import com.sayweee.track.TrackManager;
import com.sayweee.track.callback.InterceptorCallback;
import com.sayweee.track.convert.IConverter;
import com.sayweee.track.log.TrackLogAdapter;
import com.sayweee.track.utils.Utils;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public class AppsFlayerPlatform implements IPlatform {

    private Context context;
    private boolean enable;
    private String logFileName;
    private boolean logEnable;
    private LogAdapter adapter = TrackLogAdapter.getInstance();
    private IConverter converter = new AppsFlyerConverter();

    public AppsFlayerPlatform(Context context, String appId) {
        init(appId, null);
    }

    @Override
    public void attach(Context context) {
        this.context = context;
    }

    @Override
    public void enable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public void logConfig(String logFileName, boolean logEnable) {
        this.logFileName = logFileName;
        this.logEnable = logEnable;
    }

    @Override
    public EventModel convert(String eventName, Map<String, Object> params) {
        return new EventModel(this, converter.convertEvent(eventName), converter.convertParameter(params));
    }

    @Override
    public int platformCode() {
        return 0;
    }

    @Override
    public void startTrack() {
        AppsFlyerLib.getInstance().startTracking(context);
    }

    @Override
    public void endTrack() {
        AppsFlyerLib.getInstance().stopTracking(true, context);
    }

    @Override
    public void setUserId(String userId) {
        AppsFlyerLib.getInstance().setCustomerUserId(userId);
    }

    @Override
    public void track(String eventName) {
        track(eventName, null);
    }

    @Override
    public void track(String eventName, Map<String, Object> params) {
        execTrack(eventName, params);
    }

    @Override
    public void trackByJson(String eventName, String jsonStr) {
        track(eventName, Utils.convertMap(jsonStr));
    }

    private void execTrack(final String eventName, final Map<String, Object> params) {
        if(enable) {
            AppsFlyerLib.getInstance().trackEvent(context,
                    eventName,
                    params,
                    new AppsFlyerTrackingRequestListener() {
                        @Override
                        public void onTrackingRequestSuccess() {
                            Logger.adapter(adapter).f(logFileName).enable(logEnable).json("onTrackingRequestSuccess", eventName, params);
                        }

                        @Override
                        public void onTrackingRequestFailure(String s) {
                            Logger.adapter(adapter).f(logFileName).enable(logEnable).json("onTrackingRequestSuccess", eventName, params);
                        }
                    });
        }
    }


    void init(String key, String userId) {
        AppsFlyerLib.getInstance().init(key, new AppsFlyerConversionListener() {

            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                Logger.adapter(adapter).f(logFileName).enable(logEnable).json("onConversionDataSuccess", map);
            }

            @Override
            public void onConversionDataFail(String s) {
                Logger.adapter(adapter).f(logFileName).enable(logEnable).json("onConversionDataFail", s);
            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {
                Logger.adapter(adapter).f(logFileName).enable(logEnable).json("onAppOpenAttribution", map);
            }

            @Override
            public void onAttributionFailure(String s) {
                Logger.adapter(adapter).f(logFileName).enable(logEnable).json("onAttributionFailure", s);
            }
        }, context);
        if(TextUtils.isEmpty(userId)) {
            setUserId(userId);
        }
        startTrack();
    }
}
