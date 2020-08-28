package com.example.views;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.views.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Google Pixel");
        }
    }
}