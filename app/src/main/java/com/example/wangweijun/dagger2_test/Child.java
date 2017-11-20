package com.example.wangweijun.dagger2_test;

/**
 * Created by wangweijun on 2017/11/20.
 */

public class Child {

    public Father father;

    public Child(Father father) {
        this.father = father;
    }

    public Father getFather() {
        return father;
    }
}
