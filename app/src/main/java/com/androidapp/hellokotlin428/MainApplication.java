package com.androidapp.hellokotlin428;

import android.app.Application;
import android.content.Context;

public class MainApplication extends Application {
    private static Context appContext; // applicationContext

    public static Context get_appContext(){
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }
}
