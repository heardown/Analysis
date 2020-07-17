package com.sayweee.track.platform;


import android.content.Context;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerTrackingRequestListener;
import com.sayweee.logger.LogAdapter;
import com.sayweee.logger.Logger;
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
    private AppsFlyerEventConvert converter;
    private static AppsFlayerPlatform platform = new AppsFlayerPlatform();
    private LogAdapter adapter;
    public static AppsFlayerPlatform get() {
        return platform;
    }

    @Override
    public void attach(Context context) {
        this.context = context;
        this.adapter = TrackLogAdapter.getInstance();
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
    public void convert(IConverter convert) {
//        convert.convert(this, );
    }

    @Override
    public void startTrack() {

    }

    @Override
    public void endTrack() {

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
        setUserId(userId);
        AppsFlyerLib.getInstance().startTracking(context);
    }
}
