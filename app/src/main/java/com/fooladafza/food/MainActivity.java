package com.fooladafza.food;
import android.app.Activity; import android.os.Bundle; import android.webkit.*; import android.graphics.Color;
public class MainActivity extends Activity {
 private static final String APP_URL="https://https://fooladafzafood.freedev.app/"; private WebView webView;
 @Override public void onCreate(Bundle b){super.onCreate(b); webView=new WebView(this); webView.setBackgroundColor(Color.WHITE); webView.getSettings().setJavaScriptEnabled(true); webView.getSettings().setDomStorageEnabled(true); webView.setWebViewClient(new WebViewClient()); setContentView(webView); webView.loadUrl(APP_URL);}
 @Override public void onBackPressed(){if(webView.canGoBack()) webView.goBack(); else super.onBackPressed();}
}
