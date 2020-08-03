package com.sayweee.track.platform.af;

import com.sayweee.track.platform.BaseConverter;



/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public class AppsFlyerConverter extends BaseConverter {

    public AppsFlyerConverter() {
        iEventConvert = new AppsFlyerEvent();
        iParameterConvert = new AppsFlyerParameter();
    }

}
