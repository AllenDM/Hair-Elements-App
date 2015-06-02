package com.example.hairelementsapp;
import com.parse.Parse;
import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "9cmeB1qKpGyu6jcAzgXXcWPv5MO61oOFCwkqfmLM", "6gqYPntbXtebyltzKex5GCkP5a01pNm91laCyZaH");
    }
}