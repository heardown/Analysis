package com.sayweee.track.utils;

import android.os.Bundle;

import androidx.collection.ArrayMap;

import org.json.JSONObject;

import java.util.Iterator;
import java.util.Map;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/15.
 * Desc:
 */
public class Utils {

    public static Bundle convertBundle(Map<String, Object> params) {
        Bundle bundle = null;
        if(params != null && params.size() > 0) {
            bundle = new Bundle();
            Iterator<Map.Entry<String, Object>> iterator = params.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Object> entry = iterator.next();
                String key = entry.getKey();
                Object value = entry.getValue();
                if(value == null) {
                    bundle.putString(key, null);
                } else if(value instanceof String) {
                    bundle.putString(key, (String) value);
                }else if(value instanceof Number) {
                    bundle.putString(key, String.valueOf(value));
                }else {
                    bundle.putString(key, value.toString());
                }
            }
        }
        return bundle;
    }

    public static Map<String, Object> convertMap(String json) {
        Map<String, Object> params = new ArrayMap<>();
        try {
            JSONObject jsonObject = new JSONObject(json);
            if (jsonObject != null) {
                Iterator<String> iterator = jsonObject.keys();
                while (iterator.hasNext()) {
                    String key = iterator.next();
                    params.put(key, jsonObject.getString(key));
                }
            }
        } catch (Exception e) {

        }
        return params;
    }

    public static Bundle convertBundle(String json) {
        Bundle bundle = null;
        try {
            JSONObject jsonObject = new JSONObject(json);
            if (jsonObject != null) {
                Iterator<String> iterator = jsonObject.keys();
                while (iterator.hasNext()) {
                    String key = iterator.next();
                    bundle.putString(key, jsonObject.getString(key));
                }
            }
        } catch (Exception e) {

        }
        return bundle;
    }
}
