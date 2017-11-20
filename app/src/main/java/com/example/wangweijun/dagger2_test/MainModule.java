package com.example.wangweijun.dagger2_test;

import javax.inject.Named;

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
//    @Named("red")
    @RedCloth   //   @Named("red") 等价于 @RedCloth
    public Cloth getRedCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Provides
    @Named("blue")
    public Cloth getBlueCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }


//    @Provides
//    public Clothes getClothes(@Named("blue") Cloth cloth){
//        return new Clothes(cloth);
//    }

    @Provides
    public Clothes getClothes(@RedCloth Cloth cloth){
        return new Clothes(cloth);
    }

}
