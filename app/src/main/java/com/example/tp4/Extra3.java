package com.example.tp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Extra3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra3);

        WebView browser = (WebView) findViewById(R.id.webView3);
        browser.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        // Cargamos la web
        browser.loadUrl("https://www.infobae.com/tendencias/nutriglam/2017/07/30/16-consejos-para-mantener-una-vida-saludable/");
    }
}
