package com.example.wangweijun.dagger2_test;

import android.app.Application;

/**
 * Created by wangweijun on 2017/11/20.
 */

public class MyApp extends Application{

    private  BaseComponent baseComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        baseComponent = DaggerBaseComponent.builder().baseModule(new BaseModule()).build();
    }

    public BaseComponent getBaseComponent() {
        return baseComponent;
    }
}
