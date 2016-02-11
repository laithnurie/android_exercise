package com.sky.imgurexercise;

import android.app.Application;
import android.content.Context;

public class ImgurApp extends Application {

    private static Context mAppContext;


    public ImgurApp() {
        super();
    }

    public void onCreate() {
        super.onCreate();
        this.setAppContext(getApplicationContext());
    }


    public static Context getAppContext() {
        return mAppContext;
    }

    private void setAppContext(Context appContext) {
        mAppContext = appContext;
    }

}

