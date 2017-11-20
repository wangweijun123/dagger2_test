package com.example.wangweijun.dagger2_test;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wangweijun on 2017/11/19.
 *
 *
 */

@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

}
