package com.example.wangweijun.dagger2_test;

import android.util.Log;

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
        Log.i("wang", "getRedCloth...");
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Provides
    @Named("blue")
    public Cloth getBlueCloth() {
        Log.i("wang", "getBlueCloth...");
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
        Log.i("wang", "getClothes...");
        return new Clothes(cloth);
    }

    /**
     * 生产一个child对象
     * @param father
     * @return
     */
    @Provides
    public Child createChild(Father father) {
        Log.i("wang", "createChild...");
        return  new Child(father);
    }

    /**
     * 生产father对象，工厂方法中有生成单例对象，组件也必须是单利
     * @return
     */
//    @Singleton
    @PerActivity
    @Provides
    public Father createFather() {
        Log.i("wang", "createFather...");
        return  new Father();
    }

}
