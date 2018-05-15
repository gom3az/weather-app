package com.example.mg.masterdetail;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class WeatherApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
    }
}
