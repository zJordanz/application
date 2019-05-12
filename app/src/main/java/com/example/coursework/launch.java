package com.example.coursework;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class launch extends AppCompatActivity {
private WebView webView;

//sets activity as a web view
    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
     //enables java script
        webSettings.setJavaScriptEnabled(true);
        //clears cache,history and cookies
        webView.clearHistory();
        webView.clearCache(true);
        webView.clearFormData();
        android.webkit.CookieManager.getInstance().removeAllCookie();
        //sets client in the chrome format
        webView.setWebChromeClient(new WebChromeClient());
        //loads the url of the log in page
        webView.loadUrl("https://login.microsoftonline.com/common/oauth2/authorize?client_id=4345a7b9-9a63-4910-a426-35363201d503&response_mode=form_post&response_type=code+id_token&scope=openid+profile&state=OpenIdConnect.AuthenticationProperties%3dYM4dO6iCh75NJ_N-kobmYTOXzYtX0ItntgNZzrz1jfZ_-R84e_hmo5aBVZO6bdrRZytmcs4pPzkaC9tPqlOud5MTsISUz5SfDjP5EEBQD0tfhZIKHba7BDx0NNIL42C8&nonce=636899286572079405.NTkwMjQwOTEtNmJmMC00YThiLWI4NmQtODgxNGU2ODc0OGYzOGU2M2U2OGUtY2UzMi00YTZhLTgzOTUtZDUwNGEwZmY4MGEz&redirect_uri=https%3a%2f%2fwww.office.com%2f&ui_locales=en-US&mkt=en-US&client-request-id=b5c23195-e37e-4134-ad4e-223851847af8&sso_reload=true");
        //sets the web view as the loaded url
        webView.setWebViewClient(new WebViewClient(){
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                //When the webview gets to a certain url ie the page after the login it will direct the user to the first screen
                if (webView.getUrl().equals("https://login.microsoftonline.com/common/login")) {
                    webView.stopLoading();
                    Intent intent = new Intent(launch.this, Courses.class);
                    startActivity(intent);
                    finish();
                }
            }
            /**public void onPageFinished(WebView view, String url){
                if(webView.getUrl().equals("https://login.microsoftonline.com/common/login")){
                    webView.stopLoading();
                    Intent intent = new Intent(launch.this, test1.class);
                    startActivity(intent);
                    finish();
                }
            }**/
        });




        //CookieManager.getInstance().setAcceptCookie(false);
        webView.getSettings().setAppCacheEnabled(false);
        webView.clearHistory();
        webView.clearCache(true);
        webView.clearFormData();
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setSaveFormData(false);

    }

}
