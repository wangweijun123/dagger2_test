package com.example.wangweijun.dagger2_test;

import dagger.Subcomponent;

/**
 * Created by wangweijun1 on 2017/11/21.
 */
@PerActivity // 与@Singleton 等价
@Subcomponent(modules = MainModule.class)
public interface SubMainComponent {

    void inject(MainActivity activity);
}
