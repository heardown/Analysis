package com.sayweee.crashreport;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import com.tencent.bugly.crashreport.CrashReport;

public class ProcessCrashOwner {

    public final static String KEY_NAM = "report_key_bugly";
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
            String key = appInfo.metaData.getString(KEY_NAM);
            init(key, false);   //d10f9c1212
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void init(String key, boolean debug) {
        CrashReport.initCrashReport(context, key, debug);
    }


}
