package com.example.eunji.a2162300785;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by User on 2/28/2017.
 */

public class Tab2Fragment extends Fragment {
    private static final String TAG = "Tab2Fragment";



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2_fragment,container,false);
        WebView WebView01 = (WebView) view.findViewById(R.id.webView);
        WebView01.setWebViewClient(new WebViewClient());


        WebSettings webSettings = WebView01.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebView01.loadUrl("http://www.google.com");

        return view;
    }


}

