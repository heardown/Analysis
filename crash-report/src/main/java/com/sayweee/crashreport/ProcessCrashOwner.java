package com.sayweee.crashreport;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

import com.tencent.bugly.crashreport.CrashReport;

public class ProcessCrashOwner {
    public final static String TAG = "ProcessCrashOwner";
    private final static String KEY_NAME = "REPORT_KEY_BUGLY";
    protected Context context;

    private static final ProcessCrashOwner sInstance = new ProcessCrashOwner();

    public static ProcessCrashOwner get() {
        return sInstance;
    }

    public static void init(Context context) {
        sInstance.attach(context);
    }

    void attach(Context context) {
        this.context = context;
        try {
            ApplicationInfo appInfo = context.getPackageManager().getApplicationInfo(context.getOpPackageName(), PackageManager.GET_META_DATA);
            if (appInfo != null && appInfo.metaData != null) {
                String key = appInfo.metaData.getString(KEY_NAME);
                if (!TextUtils.isEmpty(key)) {
                    init(key, false);   //d10f9c1212
                } else {
                    Log.e(TAG, "Please use metaData register key in manifest");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init(String key, boolean debug) {
        CrashReport.initCrashReport(context, key, debug);
    }

    /**
     * 上报异常
     *
     * @param throwable
     */
    public void postCatchedException(Throwable throwable) {
        if (throwable != null) {
            CrashReport.postCatchedException(throwable);
        }
    }


}
