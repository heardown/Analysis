package com.sayweee.crashreport.demo;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.sayweee.track.TrackConfig;
import com.sayweee.track.TrackManager;
import com.sayweee.track.callback.InterceptorCallback;
import com.sayweee.track.core.IPlatform;
import com.sayweee.track.interceptor.Interceptor;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.crash1:

                break;
            case R.id.track:

                break;
        }
    }


    /**
     * 初始化
     */
    private void init() {
        TrackConfig config = new TrackConfig.Builder().appsFlyer(new TrackConfig.AppsFlyerConfig(""))
                .build();
        TrackManager.get().init(getApplication(), config);


    }

    private void updateConfig() {
        TrackConfig.AppsFlyerConfig config = new TrackConfig.AppsFlyerConfig();
        config.setEnable(false);
        TrackManager.get().updateConfig(config);
    }

    private void track(String eventName) {
        TrackManager.get().track(eventName);
    }

    private void trackWithConvert(String eventName, Map<String, Object> params) {
        TrackManager.get().track(eventName, params, true);
    }
}
