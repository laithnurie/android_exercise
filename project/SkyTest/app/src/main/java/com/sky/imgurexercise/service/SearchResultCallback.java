package com.sky.imgurexercise.service;

import org.json.JSONObject;

public interface SearchResultCallback {
    void onSuccess(JSONObject searchResponse);
    void onFailure();
}
