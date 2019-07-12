package com.dimitriongoua.alc4ac_dimitriongoua.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dimitriongoua.alc4ac_dimitriongoua.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO Extract string resource
        if (getSupportActionBar() != null) getSupportActionBar().setTitle("ALC 4 Phase 1");

        Button btn_about   = findViewById(R.id.btn_about);
        Button btn_profile = findViewById(R.id.btn_profile);

        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
            }
        });

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }
        });
    }
}
