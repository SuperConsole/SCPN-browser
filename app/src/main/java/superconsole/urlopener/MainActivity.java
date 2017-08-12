package superconsole.urlopener;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.KeyEvent;

public class MainActivity extends Activity {
    private String gotURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotURL ="http://www.google.com";
        WebView webPage = findViewById(R.id.browser);
        webPage.getSettings().setUseWideViewPort(true);
        webPage.getSettings().setJavaScriptEnabled(true);
        webPage.getSettings().setLoadWithOverviewMode(true);
        webPage.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
        webPage.setWebViewClient(new WebViewClient());
        webPage.loadUrl(gotURL);
    }
    public boolean onKeyDown(int key, KeyEvent e){
        WebView webPage = findViewById(R.id.browser);
        if(key == KeyEvent.KEYCODE_BACK && webPage.canGoBack()) {
            webPage.goBack();
            return true;
        }
        return super.onKeyDown(key, e);
    }
}