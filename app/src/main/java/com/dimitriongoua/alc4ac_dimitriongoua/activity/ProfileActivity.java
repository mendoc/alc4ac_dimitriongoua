package com.dimitriongoua.alc4ac_dimitriongoua.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dimitriongoua.alc4ac_dimitriongoua.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("My Profile");
        }

    }
}
