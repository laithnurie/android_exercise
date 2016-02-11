package com.sky.imgurexercise;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.sky.imgurexercise.service.ImgurService;
import com.sky.imgurexercise.service.SearchResultCallback;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements SearchResultCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

/**
 *  Exercise
 *  We created a service to fetch search results from Imgur, an image hosting website.
 *  Currently the service take a query string to return a json object of the related results.
 *
 *  You have absolute freedom to modify the service as you like, this exercise is to test how you
 *  consume an API and handle image loading.
 *
 *  Task 1:
 *  Create a recyclerview that show the images and some of their data.
 *
 *  Task 2:
 *  Update the code to be able to repopulate the list after search submission
 *
 *  Task 3:
 *  Detect the image type and show a different presentation of that result
 *
 *  Task 4:
 *  Having a lot of images in recyclerview can cause gittering while scrolling,
 *  address this problem, in anyway you like
 *
 *  Task 5:
 *  Implement a sorting functionality, by image type, or just anything
 *
 */
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImgurService.getImage("japan", MainActivity.this);
            }
        });
    }

    @Override
    public void onSuccess(JSONObject searchResponse) {
        Log.v("lnln", String.valueOf(searchResponse));
    }

    @Override
    public void onFailure() {

    }
}
