package com.example.wangweijun.dagger2_test;

import javax.inject.Inject;

/**
 * Created by wangweijun on 2017/11/27.
 *
 * 自定义的类class，需要注入的话直接在构造函数家inject
 */
@PerActivity
public class Water {

    @Inject
    public Water() {
    }

    public Water(String str) {
    }
}
