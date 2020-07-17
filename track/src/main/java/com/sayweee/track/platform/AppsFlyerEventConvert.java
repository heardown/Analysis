package com.sayweee.track.platform;

import com.sayweee.track.IPlatform;
import com.sayweee.track.convert.IConverter;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public class AppsFlyerEventConvert implements IConverter {

    @Override
    public void convert(IPlatform platform, String eventName, Map<String, Object> params) {
        platform.track(eventName, params);
    }
}
