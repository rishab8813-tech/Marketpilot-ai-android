package com.marketpilot.demo;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
public class MainActivity extends Activity {
 private WebView web;
 @Override public void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState); web=new WebView(this); setContentView(web);
 WebSettings s=web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true);
 web.setWebChromeClient(new WebChromeClient()); web.setWebViewClient(new WebViewClient());
 web.loadUrl("file:///android_asset/index.html");
 }
 @Override public void onBackPressed(){ if(web.canGoBack()) web.goBack(); else super.onBackPressed(); }
}
