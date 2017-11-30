package com.example.wangweijun.dagger2_test.custom;

import com.example.wangweijun.dagger2_test.PerActivity;

import dagger.Component;

/**
 * Created by wangweijun1 on 2017/11/28.
 */
@PerActivity
@Component(modules = CustomModule.class, dependencies = MyBaseComponent.class)
public interface CustomComponet {
    void inject(MyBaseActivity customActivity);
}
