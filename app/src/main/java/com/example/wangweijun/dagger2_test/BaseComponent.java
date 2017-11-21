package com.example.wangweijun.dagger2_test;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wangweijun on 2017/11/20.
 */
@Singleton
@Component(modules = BaseModule.class)
public interface BaseComponent {

    //这个是为第二个Activity准备的,也就是dependencies依赖声明的方式
    ClothHandler getClothHandler();


    //@Subcomponent使用的声明方式,声明一个返回值为子组件的方法,子组件需要什么Module,就在方法参数中添加什么
    SubMainComponent getSubMainComponent(MainModule module);
}
