package net.kaosfield.wv1;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

class MyWebViewClient extends WebChromeClient {

	public boolean shouldOverrideUrlLoading(WebView view, String url) {
		return false;
	}
}
