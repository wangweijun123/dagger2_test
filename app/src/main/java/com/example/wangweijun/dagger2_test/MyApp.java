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
        // 同一个组件实例(也就是说的是同一个作用域)，才有单例这一说,还有单例实现(1, module类中的provide方法上，同时和component接口名上定义同一个名字)
        baseComponent = DaggerBaseComponent.builder().baseModule(new BaseModule()).build();
    }

    public BaseComponent getBaseComponent() {
        return baseComponent;
    }
}
