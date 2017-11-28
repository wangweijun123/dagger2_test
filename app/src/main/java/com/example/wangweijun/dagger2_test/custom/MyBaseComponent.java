package com.example.wangweijun.dagger2_test.custom;

import com.example.wangweijun.dagger2_test.custom.Model.Cup;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by wangweijun1 on 2017/11/28.
 * Module类中provide定义的方法上的scope(或者model中的构造函数定义的scope)
 * 与 component上的scope要一致，也就是说只要定义了在任何地方scope，组件上
 * 一定要一致
 */

@Singleton
@Component(modules = MyBaseModule.class)
public interface MyBaseComponent {
       Cup getCup();// 被依赖组件(父组件)一定要告诉依赖组件自己能生成什么样的对象,而不能从module上来
}
