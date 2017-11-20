package com.example.wangweijun.dagger2_test;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wangweijun on 2017/11/20.
 */
@Singleton
@Component(modules = BaseModule.class)
public interface BaseComponent {
    ClothHandler getClothHandler();

}
