package com.sky.imgurexercise.service;

import android.util.Log;

import com.android.volley.error.VolleyError;
import com.android.volley.request.JsonObjectRequest;
import com.android.volley.request.StringRequest;
import com.sky.imgurexercise.network.VolleyQueue;

import org.json.JSONObject;

import java.util.HashMap;


public class ImgurService {

    public static void getImage(String query, final SearchResultCallback callBack){

       String request =  "https://api.imgur.com/3/gallery/search/";

        JsonObjectRequest searchRequest = new JsonObjectRequest(request, null,
                new com.android.volley.Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callBack.onSuccess(response);
                    }
                },
                new com.android.volley.Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        Log.v("lnln", String.valueOf(volleyError.getMessage()));
                        callBack.onFailure();
                    }
                });

        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "Client-ID c9378391e3c8d3f");
        headers.put("client_secret", "943ff97763463c0ffb942c537bec8958964d09a5");
        searchRequest.setHeaders(headers);
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("q", query);
        searchRequest.setParams(params);

        VolleyQueue.getInstance().getRequestQueue().add(searchRequest);
    }
}
