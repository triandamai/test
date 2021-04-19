package com.trian.test_app;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        MyApp.context = getApplicationContext();
    }
    public static Context getContext() {
        return MyApp.context;
    }

}
