package com.example.android.movie;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by josun on 2016-05-05.
 */
public class MovieDownFragment extends Fragment {

    //private Context context;
   // ArrayAdapter<Image> mMovieAdapter;

    private ImageAdapter imageAdapter;
    private String posterUrl;

    public MovieDownFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ImageAdapter imageAdapter = new ImageAdapter(this);
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        GridView gridview = (GridView) rootView.findViewById(R.id.gridview_movies);
        gridview.setAdapter(imageAdapter);

        return rootView;
    }

/*    public class FetchMovieTask extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... params) {

        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            ImageAdapter = new ImageAdapter(getActivity(), s);
            ImageAdapter.notifyDataSetChanged();
        }
    }*/

}