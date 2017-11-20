package com.example.wangweijun.dagger2_test;

import dagger.Component;

/**
 * Created by wangweijun on 2017/11/20.
 */
@PerActivity
@Component(modules = SecondModule.class, dependencies = BaseComponent.class)
public interface SecondComponent {

    void inject(SecondActivity secondActivity);
}
