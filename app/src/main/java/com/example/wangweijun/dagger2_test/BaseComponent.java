package com.example.wangweijun.dagger2_test;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wangweijun on 2017/11/20.
 */
@Singleton
@Component(modules = BaseModule.class)

/**
 * 它的作用就是告诉依赖于BaseComponent的Component,BaseComponent能为你们
 * 提供ClothHandler对象,如果没有这个方法,BaseComponent就不能提供ClothHandler对象
 * (这个提供规则和上面的依赖规则相同,可以实现单例).既然有了BaseComponent,那我们就可在
 * 其它Component中依赖它了.我们删除MainModule和SecondModule中的getClothHandler方法:
 */
public interface BaseComponent {

    //这个是为第二个Activity准备的,也就是dependencies依赖声明的方式
    // 告诉依赖组件，我能提供ClothHandler实例，而且是单例的
    ClothHandler getClothHandler();


    //@Subcomponent使用的声明方式,声明一个返回值为子组件的方法,
    // 子组件需要什么Module,就在方法参数中添加什么,暴露子组件接口
    // 返回组件的一定是subcomponent子组件定义
    SubMainComponent getSubMainComponent(MainModule module);
}
