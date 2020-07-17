package com.sayweee.track.convert;

import com.sayweee.track.IPlatform;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public interface IConverter {

    void convert(IPlatform platform, String eventName, Map<String, Object> params);

}
