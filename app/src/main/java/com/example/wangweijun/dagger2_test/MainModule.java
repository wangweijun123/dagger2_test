package com.example.wangweijun.dagger2_test;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wangweijun on 2017/11/19.
 *
 * 两种方式提供依赖
 * 1, 使用Inject注解类的构造方法
 * 2, 在module提供Provides,返回类的实例
 */
@Module
public class MainModule {

    @Provides
    public Cloth getCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Provides
    public Clothes getClothes(Cloth cloth){
        return new Clothes(cloth);
    }

}
