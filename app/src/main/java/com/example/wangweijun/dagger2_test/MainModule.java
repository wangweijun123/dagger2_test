package com.example.wangweijun.dagger2_test;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wangweijun on 2017/11/19.
 */
@Module
public class MainModule {

    @Provides
    public Cloth getCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

}
