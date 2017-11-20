package com.example.wangweijun.dagger2_test;

import dagger.Component;

/**
 * Created by wangweijun on 2017/11/19.
 *
 *
 */

//@Singleton
@PerActivity // 与@Singleton 等价
@Component(modules = MainModule.class, dependencies = BaseComponent.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

}
