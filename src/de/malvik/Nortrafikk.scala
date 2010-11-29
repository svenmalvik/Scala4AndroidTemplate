package de.malvik;

import android.app.Activity
import android.os.Bundle
import android.webkit.{WebViewClient, WebView}

class Nortrafikk extends Activity {
    override def onCreate(savedInstanceState:Bundle) : Unit = {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        
        var params = new Array[String](3)
        params(0) = "p0"
        params(1) = "p1"
        params(2) = "p2"
        Trafikanten.execute("p1")
        
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