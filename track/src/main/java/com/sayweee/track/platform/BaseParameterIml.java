package com.sayweee.track.platform;

import android.os.Build;

import androidx.annotation.CallSuper;

import com.sayweee.track.model.IEventParameter;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    2020/8/3.
 * Desc:
 */
public abstract class BaseParameterIml implements IEventParameter {

    protected Map<String, String> parameterMap;

    public BaseParameterIml(){
        buildMappingParameter();
    }

    @CallSuper
    @Override
    public void buildMappingParameter() {
        parameterMap = new HashMap<>();
    }

    @Override
    public void addMappingParameter(String key, String value) {
        if (key != null) {
            parameterMap.put(key, value);
        }
    }

    @Override
    public void replaceMappingParameter(String key, String value) {
        if (key != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                parameterMap.replace(key, value);
            } else {
                parameterMap.put(key, value);
            }
        }
    }

    @Override
    public void removeMappingParameter(String key) {
        if (key != null && parameterMap.containsKey(key)) {
            parameterMap.remove(key);
        }
    }

    @Override
    public String mapping(String key) {
        if (key != null && parameterMap.containsKey(key)) {
            return parameterMap.get(key);
        }
        return key;
    }
}
