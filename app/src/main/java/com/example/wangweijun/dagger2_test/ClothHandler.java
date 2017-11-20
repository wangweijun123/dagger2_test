package com.example.wangweijun.dagger2_test;

/**
 * Created by wangweijun on 2017/11/20.
 */

public class ClothHandler {

    public Clothes handle(Cloth cloth){
        return new Clothes(cloth);
    }

}
