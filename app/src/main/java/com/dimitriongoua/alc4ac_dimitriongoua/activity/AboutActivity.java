package com.dimitriongoua.alc4ac_dimitriongoua.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.dimitriongoua.alc4ac_dimitriongoua.R;
import com.dimitriongoua.alc4ac_dimitriongoua.component.Browser;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("About ALC");
        }

        String url = "https://andela.com/alc/";

        WebView page = findViewById(R.id.wv_aboutalc);
        WebSettings settings = page.getSettings();
        settings.setJavaScriptEnabled(true);
        page.setWebViewClient(new Browser(url));
        page.loadUrl(url);

    }
}
