package com.sayweee.crashreport.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.sayweee.track.TrackConfig;
import com.sayweee.track.TrackManager;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.crash1:

                break;
            case R.id.track:

                break;
        }
    }

    private void config() {
        TrackConfig config = new TrackConfig.Builder().appsFlyer(new TrackConfig.AppsFlyerConfig("", true))
                .facebook(new TrackConfig.FacebookConfig()).build();
        TrackManager.get().init(getApplication(), config);
    }

    private void track(String eventName) {
        TrackManager.get().track(eventName);
    }

    private void trackWithConvert(String eventName, Map<String, Object> params) {
        TrackManager.get().track(eventName, params, true);
    }
}
