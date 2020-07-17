package com.sayweee.track;

import com.sayweee.track.core.PlatformConfig;

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

        public Builder setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder appsFlyer(String appsFlyerKey, boolean appsFlyerEnable) {
            if(appsFlyerConfig == null) {
                appsFlyerConfig = new AppsFlyerConfig();
            }
            appsFlyerConfig.appsFlyerKey = appsFlyerKey;
            appsFlyerConfig.appsFlyerEnable = appsFlyerEnable;
            return this;
        }

        public Builder appsFlyer(AppsFlyerConfig appsFlyerConfig) {
            this.appsFlyerConfig = appsFlyerConfig;
            return this;
        }

        public Builder setAppsFlyerExtra(String logFileName, boolean logEnable) {
            if(appsFlyerConfig == null) {
                appsFlyerConfig = new AppsFlyerConfig();
            }
            appsFlyerConfig.appsFlyerLogFileName = logFileName;
            appsFlyerConfig.appsFlyerLogEnable = logEnable;
            return this;
        }

        public Builder facebook(boolean facebookEnable) {
            if(facebookConfig == null) {
                facebookConfig = new FacebookConfig();
            }
            facebookConfig.facebookEnable = facebookEnable;
            return this;
        }


        public Builder setFacebookExtra(String logFileName, boolean logEnable) {
            if(facebookConfig == null) {
                facebookConfig = new FacebookConfig();
            }
            facebookConfig.facebookLogFileName = logFileName;
            facebookConfig.facebookLogEnable = logEnable;
            return this;
        }

        public Builder setGoogleExtra(String logFileName, boolean logEnable) {
            if(googleConfig == null) {
                googleConfig = new GoogleConfig();
            }
            googleConfig.googleLogFileName = logFileName;
            googleConfig.googleLogEnable = logEnable;
            return this;
        }

        public Builder google(boolean googleEnable) {
            if(googleConfig == null) {
                googleConfig = new GoogleConfig();
            }
            googleConfig.googleEnable = googleEnable;
            return this;
        }

        public Builder setLogFileName(String logFileName) {
            this.logFileName = logFileName;
            return this;
        }

        public Builder setLogEnable(boolean enable){
            this.logEnable = enable;
            return this;
        }

        public TrackConfig build() {
            return new TrackConfig(this);
        }
    }

    public static class AppsFlyerConfig implements PlatformConfig{
        public String appsFlyerKey;
        public boolean appsFlyerEnable;
        public String appsFlyerLogFileName;
        public boolean appsFlyerLogEnable;

        public AppsFlyerConfig() {

        }

        public AppsFlyerConfig(String appsFlyerKey) {
            this.appsFlyerKey = appsFlyerKey;
        }

        public AppsFlyerConfig(String appsFlyerKey, boolean appsFlyerEnable) {
            this.appsFlyerKey = appsFlyerKey;
            this.appsFlyerEnable = appsFlyerEnable;
        }

        public AppsFlyerConfig(String appsFlyerKey, boolean appsFlyerEnable, String appsFlyerLogFileName, boolean appsFlyerLogEnable) {
            this.appsFlyerKey = appsFlyerKey;
            this.appsFlyerEnable = appsFlyerEnable;
            this.appsFlyerLogFileName = appsFlyerLogFileName;
            this.appsFlyerLogEnable = appsFlyerLogEnable;
        }
    }

    public static class GoogleConfig implements PlatformConfig{
        public boolean googleEnable;
        public String googleLogFileName;
        public boolean googleLogEnable;

        public GoogleConfig(){

        }

        public GoogleConfig(boolean googleEnable, String googleLogFileName, boolean googleLogEnable) {
            this.googleEnable = googleEnable;
            this.googleLogFileName = googleLogFileName;
            this.googleLogEnable = googleLogEnable;
        }
    }

    public static class FacebookConfig implements PlatformConfig{
        public boolean  facebookEnable;
        public String facebookLogFileName;
        public boolean facebookLogEnable;

        public FacebookConfig() {

        }

        public FacebookConfig(boolean facebookEnable, String facebookLogFileName, boolean facebookLogEnable) {
            this.facebookEnable = facebookEnable;
            this.facebookLogFileName = facebookLogFileName;
            this.facebookLogEnable = facebookLogEnable;
        }
    }

    public static class WeeeConfig implements PlatformConfig{

    }
}
