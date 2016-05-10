package com.example.android.movie;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
//            MovieDownFragment movieDownFragment = new MovieDownFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new MovieDownFragment())
                    .commit();
        }
    }
}