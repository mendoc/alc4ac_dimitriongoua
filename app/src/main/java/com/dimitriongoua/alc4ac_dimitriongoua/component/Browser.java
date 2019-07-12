package com.dimitriongoua.alc4ac_dimitriongoua.component;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Browser extends WebViewClient {

    private final String mUrl;

    public Browser(String url) {
        this.mUrl = url;
    }

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        handler.proceed();
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        view.loadUrl(mUrl);
        return true;
    }
}
