package com.sky.imgurexercise.network;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.sky.imgurexercise.ImgurApp;

public class VolleyQueue {
    private static VolleyQueue mInstance = null;
    private RequestQueue mRequestQueue;

    private VolleyQueue(){
        mRequestQueue = Volley.newRequestQueue(ImgurApp.getAppContext());
    }

    public static VolleyQueue getInstance(){
        if(mInstance == null){
            mInstance = new VolleyQueue();
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue(){
        return this.mRequestQueue;
    }
}
