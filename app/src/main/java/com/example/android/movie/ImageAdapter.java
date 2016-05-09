package com.example.android.movie;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by josun on 2016-05-08.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position){
        return 0;
    }
    final String BASE_URL = "http://image.tmdb.org/t/p/";
    final String SIZE = "w185/";
    final String API_KEY ="?api_key=";
    final String MY_API = "ff10e727a726c97c184d7ffd154b9cc0";
    final String posterURL = BASE_URL + SIZE + API_KEY + MY_API;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = (ImageView) convertView.findViewById(R.id.movie_poster_imageview);
        }
        else {
            imageView = (ImageView) convertView;
        }
        Picasso.with(mContext).load(posterURL).into(imageView);
        return imageView;
    }
}
