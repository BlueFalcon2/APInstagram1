package com.mouctar.apinstagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("rSYRhD3NZiUJzfpxoJS8XO0MNaTWGMfFdv8Sy2nY")
                // if defined
                .clientKey("gWqKZyhsxN1PAocSKeBW9BltCtqv1oTPvPDbsJmU")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
