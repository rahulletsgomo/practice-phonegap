package com.phonegap.practice1;

import com.phonegap.DroidGap;

import android.app.Activity;
import android.os.Bundle;

public class PracticephonegapActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}