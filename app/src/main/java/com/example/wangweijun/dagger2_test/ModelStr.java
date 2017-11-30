package com.example.wangweijun.dagger2_test;


import javax.inject.Inject;

/**
 * Created by wangweijun on 2017/12/1.
 */

public class ModelStr {
    String str;// 如果够着函数有普通参数，还是使用component方式吧

    @Inject
    public ModelStr(){
    }

    @Override
    public String toString() {
        return "str:"+str;
    }
}
