package com.sky.imgurexercise;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by laithskystore on 12/02/16.
 */
public class OurViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView;

    public OurViewHolder(View itemView) {
        super(itemView);
        //imageView = itemView.findViewById(R.id.imageView);
        textView =(TextView) itemView.findViewById(R.id.titleView);
    }

    public void bindView(String title, String imageUrl){
        textView.setText(title);

    }


}
