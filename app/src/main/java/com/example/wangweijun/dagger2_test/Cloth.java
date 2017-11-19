package com.example.wangweijun.dagger2_test;

import javax.inject.Inject;

/**
 * Created by wangweijun on 2017/11/19.
 */

public class Cloth {
    private String color;
    @Inject
    public Cloth() {
        color = "卡灰色";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "布料";
    }
}
