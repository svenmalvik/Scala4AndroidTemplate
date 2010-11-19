package de.malvik;

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Nortrafikk extends Activity {
    override def onCreate(savedInstanceState:Bundle) : Unit = {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        
        val web = findViewById(R.id.webView).asInstanceOf[WebView]
        web.loadUrl("http://m.trafikanten.no/")
        web.getSettings().setJavaScriptEnabled(true)
        web.getSettings().setJavaScriptCanOpenWindowsAutomatically(false)
        web.getSettings().setPluginsEnabled(false)
        web.getSettings().setSupportMultipleWindows(false)
        web.getSettings().setSupportZoom(false)
        web.setVerticalScrollBarEnabled(false)
        web.setHorizontalScrollBarEnabled(false)
        
        web.setWebViewClient(new WebViewClient {
        	override def shouldOverrideUrlLoading(view: WebView, url: String) = false
        });
    }
}