package com.bayu.webkit1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;
//    fungsi \n adalah sebagai garis baru(enter)
    String content="<h1>Selamat Datang di html dalam android</h1>\n" +
            "<h5> Kali ini kita membuat membuat program html</h5>\n" +
            "<span> Kita dapat menggunakan aplikasi ini dalam format format code html biasa\n" +
            "<marquee>-Bayu Priyambada</marquee>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.html);
        // displaying text in WebView
        webView.loadDataWithBaseURL(null, content, "text/html", "utf-8", null);
    }
}