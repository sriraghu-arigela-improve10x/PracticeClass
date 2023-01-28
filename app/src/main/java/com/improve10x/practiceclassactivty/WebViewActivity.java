package com.improve10x.practiceclassactivty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.improve10x.practiceclassactivty.databinding.ActivityWebViewBinding;

public class WebViewActivity extends AppCompatActivity {

    private ActivityWebViewBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("webView");
        handleWebView();
    }

    private void handleWebView() {
        WebView myWebView = (WebView) binding.webView;
        myWebView.loadUrl("https://play.google.com/store/apps/details?id=com.google.android.apps.photos&hl=en_US&gl=US");
    }
}