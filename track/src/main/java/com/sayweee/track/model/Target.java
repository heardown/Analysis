package com.sayweee.track.model;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/7/22.
 * Desc:
 */
public class Target {
    public static final int PLATFORM_AF = 100;  // appsflyer
    public static final int PLATFORM_FB = 101;  // facebook
    public static final int PLATFORM_GA = 102;  // google
    public static final int PLATFORM_WEEE = 103; // weee

    @IntDef({Target.PLATFORM_AF, Target.PLATFORM_FB, Target.PLATFORM_GA, Target.PLATFORM_WEEE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlatformCode {

    }

    public static final int TYPE_ACTION = 101;  // 普通埋点
    public static final int TYPE_PV = 102;      // pv埋点
    public static final int TYPE_EXTEND = 103;    //扩展埋点

    @IntDef({Target.TYPE_ACTION, Target.TYPE_PV, TYPE_EXTEND})
    @Retention(RetentionPolicy.SOURCE)
    public @interface EventType {

    }
}
