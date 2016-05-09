package com.example.android.movie;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by josun on 2016-05-05.
 */
public class MovieDownFragment extends Fragment {

    //private Context context;
    // ArrayAdapter<Image> mMovieAdapter;

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

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        GridView gridview = (GridView) rootView.findViewById(R.id.gridview_movies);
        gridview.setAdapter(new ImageAdapter(getActivity()));
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

        public long getItemId(int position) {
            return 0;
        }

        final String BASE_URL = "https://image.tmdb.org/t/p/";
        final String SIZE = "w185/";
        final String API_KEY = "?api_key=";
        final String MY_API = "ff10e727a726c97c184d7ffd154b9cc0";
        final String posterURL = BASE_URL + SIZE + API_KEY + MY_API;

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;

            if (convertView == null) {
                imageView = (ImageView) convertView.findViewById(R.id.movie_poster_imageview);
            } else {
                imageView = (ImageView) convertView;
            }
            Picasso.with(mContext).load(posterURL).into(imageView);
            Log.v ("posterURL ", posterURL);
            return imageView;
        }
    }
}