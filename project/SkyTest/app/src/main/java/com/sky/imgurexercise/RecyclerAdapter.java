package com.sky.imgurexercise;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by laithskystore on 12/02/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<OurViewHolder> {

    private final ArrayList<MainActivity.SearchModel> searchData;

    public RecyclerAdapter(ArrayList<MainActivity.SearchModel> allData){
searchData = allData;
    }


    @Override
    public OurViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.individual_views, parent);
        return new OurViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(OurViewHolder holder, int position) {
        MainActivity.SearchModel searchModel = searchData.get(position);
        holder.bindView(searchModel.title, searchModel.link);
    }

    @Override
    public int getItemCount() {
        return searchData.size();
    }
}
