package com.sayweee.track;

import com.appsflyer.AppsFlyerConversionListener;
import com.sayweee.track.core.PlatformConfig;
import com.sayweee.track.model.Target;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:    参数设置
 */
public class TrackConfig {
    private String logFileName;
    private boolean logEnable;
    private String packageName;

    //appsFlyer
    private PlatformConfig appsFlyerConfig;
    //facebook
    private PlatformConfig facebookConfig;
    //google firebase
    private PlatformConfig googleConfig;
    //weee
    private PlatformConfig weeeConfig;

    public TrackConfig(Builder builder) {
        this.logEnable = builder.logEnable;
        this.logFileName = builder.logFileName;
        this.packageName = builder.packageName;

        this.appsFlyerConfig = builder.appsFlyerConfig;
        this.googleConfig = builder.googleConfig;
        this.facebookConfig = builder.facebookConfig;
        this.weeeConfig = builder.weeeConfig;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public boolean isLogEnable() {
        return logEnable;
    }

    public String getPackageName() {
        return packageName;
    }

    public PlatformConfig getAppsFlyerConfig() {
        return appsFlyerConfig;
    }

    public PlatformConfig getFacebookConfig() {
        return facebookConfig;
    }

    public PlatformConfig getGoogleConfig() {
        return googleConfig;
    }

    public PlatformConfig getWeeeConfig() {
        return weeeConfig;
    }

    public static class Builder {
        private String logFileName;
        private boolean logEnable;
        private String packageName;

        //appsFlyer
        private AppsFlyerConfig appsFlyerConfig;
        //facebook
        private FacebookConfig facebookConfig;
        //google firebase
        private GoogleConfig googleConfig;
        //weee
        private WeeeConfig weeeConfig;

        public Builder() {
        }

        public Builder setLogFileName(String logFileName) {
            this.logFileName = logFileName;
            return this;
        }

        public Builder setLogEnable(boolean enable){
            this.logEnable = enable;
            return this;
        }

        public Builder setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder appsFlyer(AppsFlyerConfig appsFlyerConfig) {
            this.appsFlyerConfig = appsFlyerConfig;
            return this;
        }

        public Builder facebook(FacebookConfig facebookConfig) {
            this.facebookConfig = facebookConfig;
            return this;
        }

        public Builder google(GoogleConfig googleConfig) {
            this.googleConfig = googleConfig;
            return this;
        }

        public Builder weee(WeeeConfig weeeConfig) {
            this.weeeConfig = weeeConfig;
            return this;
        }

        public TrackConfig build() {
            return new TrackConfig(this);
        }
    }

    public static class AppsFlyerConfig extends PlatformConfig{
        public String appsFlyerKey;
        public AppsFlyerConversionListener listener;
        public AppsFlyerConfig() {
            this.logFileName = "track/af";
        }

        public AppsFlyerConfig(String appsFlyerKey) {
            this();
            this.appsFlyerKey = appsFlyerKey;
        }

        public AppsFlyerConfig setAppsFlyerConversionListener(AppsFlyerConversionListener listener) {
            this.listener = listener;
            return this;
        }

        @Override
        public int getPerformCode() {
            return Target.PLATFORM_AF;
        }

    }

    public static class GoogleConfig extends PlatformConfig{
        public GoogleConfig(){
            logFileName = "track/ga";
        }

        @Override
        public int getPerformCode() {
            return Target.PLATFORM_GA;
        }

    }

    public static class FacebookConfig extends PlatformConfig{
        public FacebookConfig() {
            logFileName = "track/fb";
        }

        @Override
        public int getPerformCode() {
            return Target.PLATFORM_FB;
        }
    }

    public static class WeeeConfig extends PlatformConfig{
        public String token;

        public WeeeConfig() {
            logFileName = "track/weee";
        }

        @Override
        public int getPerformCode() {
            return Target.PLATFORM_WEEE;
        }
    }
}
