package com.sayweee.track.platform.af;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerTrackingRequestListener;
import com.sayweee.track.TrackConfig;
import com.sayweee.track.core.PlatformConfig;
import com.sayweee.track.model.Target;
import com.sayweee.track.core.IPlatform;
import com.sayweee.track.platform.BasePlatform;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public class AppsFlayerPlatform extends BasePlatform {
    protected AppsFlyerConversionListener listener;

    public static AppsFlayerPlatform get() {
        return Builder.platform;
    }

    private static class Builder {
        private static AppsFlayerPlatform platform = new AppsFlayerPlatform();
    }

    private AppsFlayerPlatform() {
        this.converter = new AppsFlyerConverter();
    }

    @Override
    public IPlatform init(PlatformConfig config) {
        super.init(config);
        if (config instanceof TrackConfig.AppsFlyerConfig) {
            TrackConfig.AppsFlyerConfig current = (TrackConfig.AppsFlyerConfig) config;
            init(current.appsFlyerKey);
            listener = current.listener;
        }
        return this;
    }

    @Override
    public int platformCode() {
        return Target.PLATFORM_AF;
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
        super.setUserId(userId);
        AppsFlyerLib.getInstance().setCustomerUserId(userId);
    }


    @Override
    public void track(int type, String eventName, Map<String, Object> params) {
        if (type == Target.TYPE_PV) { //pv事件处理
            params = new HashMap<>();
            params.put("page", eventName);
            execTrack("pv", params);
            return;
        }
        execTrack(eventName, params);
    }


    private void execTrack(final String eventName, final Map<String, Object> params) {
        if (enable) {
            log(eventName, params);
            AppsFlyerLib.getInstance().trackEvent(context,
                    eventName,
                    params,
                    new AppsFlyerTrackingRequestListener() {
                        @Override
                        public void onTrackingRequestSuccess() {
                        }

                        @Override
                        public void onTrackingRequestFailure(String s) {
                            log("onTrackingRequestFailure", eventName, params, s);
                        }
                    });
        }

    }


    private void init(String key) {
        AppsFlyerLib.getInstance().init(key, new AppsFlyerConversionListener() {

            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                log("onConversionDataSuccess", map);
                if(listener != null) {
                    listener.onConversionDataSuccess(map);
                }
            }

            @Override
            public void onConversionDataFail(String s) {
                log("onConversionDataFail", s);
                if(listener != null) {
                    listener.onConversionDataFail(s);
                }
            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {
                log("onAppOpenAttribution", map);
                if(listener != null) {
                    listener.onAppOpenAttribution(map);
                }
            }

            @Override
            public void onAttributionFailure(String s) {
                log("onAttributionFailure", s);
                if(listener != null) {
                    listener.onAttributionFailure(s);
                }
            }
        }, context);
        startTrack();
    }
}
