package com.example.android.movie;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by josun on 2016-05-05.
 */
public class MovieDownFragment extends Fragment {

    public MovieDownFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        //    GridView gridView = (GridView) rootView.findViewByID(R.id.gridview_movies);

        return rootView;
    }
}