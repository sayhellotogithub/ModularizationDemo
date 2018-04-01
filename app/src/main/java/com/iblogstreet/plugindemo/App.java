package com.iblogstreet.plugindemo;

import android.app.Application;

import com.iblogstreet.core.IBRouter;

/**
 * Created by armyone on 2018/4/1.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        IBRouter.init(this);
    }
}
