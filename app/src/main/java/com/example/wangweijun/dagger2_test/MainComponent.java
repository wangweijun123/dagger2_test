package com.example.wangweijun.dagger2_test;

import dagger.Component;

/**
 * Created by wangweijun on 2017/11/19.
 */

@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

}
