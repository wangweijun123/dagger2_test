package com.example.wangweijun.dagger2_test;

/**
 * Created by wangweijun on 2017/11/19.
 */

public class Clothes {

    private Cloth cloth;

    public Clothes(Cloth cloth) {
        this.cloth = cloth;
    }

    public Cloth getCloth() {
        return cloth;
    }
}
