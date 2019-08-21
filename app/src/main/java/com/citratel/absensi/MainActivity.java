package com.citratel.absensi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {
    WebView webviewku;
    WebSettings websettingku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webviewku = (WebView)findViewById(R.id.WebView1);

        websettingku = webviewku.getSettings();
        webviewku.setWebViewClient(new WebViewClient());
        webviewku.loadUrl("http://159.65.133.24/web/login");
    }
}
