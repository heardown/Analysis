package com.sayweee.track;

import com.sayweee.track.convert.IConverter;
import com.sayweee.track.core.PlatformConfig;
import com.sayweee.track.platform.WeeePlatform;

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

        public TrackConfig build() {
            return new TrackConfig(this);
        }
    }

    public static class AppsFlyerConfig extends PlatformConfig{
        public String appsFlyerKey;

        public AppsFlyerConfig() {

        }

        public AppsFlyerConfig(String appsFlyerKey) {
            this.appsFlyerKey = appsFlyerKey;
        }

    }

    public static class GoogleConfig extends PlatformConfig{
        public GoogleConfig(){

        }

    }

    public static class FacebookConfig extends PlatformConfig{
        public FacebookConfig() {

        }
    }

    public static class WeeeConfig extends PlatformConfig{

        public WeeeConfig() {
        }
    }
}
