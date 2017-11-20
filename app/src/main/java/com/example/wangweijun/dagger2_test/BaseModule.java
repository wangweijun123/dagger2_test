package com.example.wangweijun.dagger2_test;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wangweijun on 2017/11/20.
 */
@Module
public class BaseModule {
    @Singleton
    @Provides
    public ClothHandler createClothHandler() {
        return  new ClothHandler();
    }
}
