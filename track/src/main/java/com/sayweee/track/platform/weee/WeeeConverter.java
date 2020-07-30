package com.sayweee.track.platform.weee;

import com.sayweee.track.convert.IConverter;
import com.sayweee.track.platform.BaseConverter;

import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public class WeeeConverter extends BaseConverter {

    String lastPageKey = null;
    @Override
    public String convertEvent(String eventName) {
        String target = super.convertEvent(eventName);
        lastPageKey = target;


        return target;
    }

}
