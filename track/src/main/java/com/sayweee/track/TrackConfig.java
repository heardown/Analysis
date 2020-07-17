package com.sayweee.track;

import android.content.Context;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public class TrackConfig {
    private Context context;
    private String logFileName;
    private boolean logEnable;
    private String packageName;

    //appsFlyer
    private String appsFlyerKey;
    private boolean appsFlyerEnable;
    private String appsFlyerLogFileName;
    private boolean appsFlyerLogEnable;

    //facebook
    private boolean  facebookEnable;
    private String facebookLogFileName;
    private boolean facebookLogEnable;

    //google firebase
    private boolean googleEnable;
    private String googleLogFileName;
    private boolean googleLogEnable;

    public TrackConfig(Builder builder) {
        this.context = builder.context;
        this.logFileName = builder.logFileName;
        this.logEnable = builder.logEnable;
        this.packageName = builder.packageName;

        this.appsFlyerKey = builder.appsFlyerKey;
        this.appsFlyerEnable = builder.appsFlyerEnable;
        this.appsFlyerLogFileName = builder.appsFlyerLogFileName;
        this.appsFlyerLogEnable = builder.appsFlyerLogEnable;

        this.facebookEnable = builder.facebookEnable;
        this.facebookLogFileName = builder.facebookLogFileName;
        this.facebookLogEnable = builder.facebookLogEnable;

        this.googleEnable = builder.googleEnable;
        this.googleLogFileName = builder.googleLogFileName;
        this.googleLogEnable = builder.googleLogEnable;
    }

    public static class Builder {
        private Context context;
        private String logFileName;
        private boolean logEnable;
        private String packageName;

        //appsFlyer
        private String appsFlyerKey;
        private boolean appsFlyerEnable;
        private String appsFlyerLogFileName;
        private boolean appsFlyerLogEnable;

        //facebook
        private boolean  facebookEnable;
        private String facebookLogFileName;
        private boolean facebookLogEnable;

        //google firebase
        private boolean googleEnable;
        private String googleLogFileName;
        private boolean googleLogEnable;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder appsFlyer(String appsFlyerKey, boolean appsFlyerEnable) {
            this.appsFlyerKey = appsFlyerKey;
            this.appsFlyerEnable = appsFlyerEnable;
            return this;
        }

        public Builder setAppsFlyerExtra(String logFileName, boolean logEnable) {
            this.appsFlyerLogFileName = logFileName;
            this.appsFlyerLogEnable = logEnable;
            return this;
        }

        public Builder facebook(boolean facebookEnable) {
            this.facebookEnable = facebookEnable;
            return this;
        }

        public Builder setFacebookExtra(String logFileName, boolean logEnable) {
            this.facebookLogFileName = logFileName;
            this.facebookLogEnable = logEnable;
            return this;
        }

        public Builder setGoogleExtra(String logFileName, boolean logEnable) {
            this.googleLogFileName = logFileName;
            this.googleLogEnable = logEnable;
            return this;
        }

        public Builder google(boolean googleEnable) {
            this.googleEnable = googleEnable;
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
}
