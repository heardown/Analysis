package com.sayweee.track;

import android.app.Application;

import com.sayweee.track.core.IPlatform;
import com.sayweee.track.core.PlatformConfig;
import com.sayweee.track.core.TrackManagerIml;
import com.sayweee.track.interceptor.Interceptor;
import com.sayweee.track.model.Target;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/7/17.
 * Desc:
 */
public abstract class TrackManager {

    /**
     * 获取manager实例
     *
     * @return
     */
    public static TrackManager get() {
        return TrackManagerIml.sInstance;
    }

    /**
     * 初始化各track平台
     *
     * @param application
     * @param config
     */
    public abstract void init(Application application, TrackConfig config);

    /**
     * 更新设置 根据平台标识码判断当前设置的平台
     * @param config
     */
    public abstract void updateConfig(PlatformConfig config);

    /**
     * 关联用户id
     * @param userId
     */
    public abstract void setUserId(String userId);

    /**
     * 上报事件 默认对事件针对平台进行转换 默认不转换
     *
     * @param eventName
     */
    public abstract void track(String eventName);

    /**
     * 上报事件
     *
     * @param eventName
     * @param convert
     */
    public abstract void track(String eventName, boolean convert);

    /**
     * 上报事件且带参数 默认不转换
     *
     * @param eventName
     * @param params
     */
    public abstract void track(String eventName, Map<String, Object> params);

    /**
     * 上报事件带参数
     *
     * @param eventName
     * @param params
     * @param convert
     */
    public abstract void track(String eventName, Map<String, Object> params, boolean convert);

    /**
     * 上报事件参数
     *
     * @param eventName
     * @param params
     * @param type
     */
    public abstract void track(@Target.EventType int type, String eventName, Map<String, Object> params);

    /**
     * 上报事件参数
     * @param type
     * @param eventName
     * @param params
     * @param convert
     */
    public abstract void track(@Target.EventType int type, String eventName, Map<String, Object> params, boolean convert);

    /**
     * 设置扩展事件映射
     * @param map
     */
    public abstract void addExtendMappingEvent(Map<String, String> map);

    /**
     * 获取已设置的扩展事件映射
     * @return
     */
    public abstract Map<String, String> getExtendMappingEvent();

    /**
     * 上报事件 默认对事件针对平台进行转换
     *
     * @param track
     * @param json
     */
    public abstract void trackByJson(String track, String json);

    /**
     * 上报事件
     *
     * @param eventName
     * @param json
     * @param convert
     */
    public abstract void trackByJson(String eventName, String json, boolean convert);

    /**
     * 添加事件拦截器
     *
     * @param interceptor
     */
    public abstract void addInterceptor(Interceptor interceptor);

    /**
     * 移除事件拦截器
     *
     * @param interceptor
     */
    public abstract void removeInterceptor(Interceptor interceptor);

    /**
     * 清空主动设置的拦截器
     */
    public abstract void clearInterceptor();

    /**
     * 获取当前的平台
     * @param platformCode
     * @return
     */
    public abstract IPlatform getPlatform(int platformCode);
}
