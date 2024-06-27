package com.example.boe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.myWeb);
        webView.getSettings().setJavaScriptEnabled(true);

        // Set a WebViewClient to handle navigation within the WebView
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // Load the clicked URL within the WebView
                view.loadUrl(url);
                return true;
            }
        });

        // Load the initial URL
        webView.loadUrl("https://mikebabu254.github.io/invod-tech-website/");
    }

    // Handle back button press to navigate back in the WebView
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
