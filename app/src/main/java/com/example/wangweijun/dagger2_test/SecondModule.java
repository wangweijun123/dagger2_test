package com.example.wangweijun.dagger2_test;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wangweijun on 2017/11/20.
 */

@Module
public class SecondModule {

    @Provides
    public Wood createWood() {
        Wood wood = new Wood();
        wood.color = "黑色的";
        Log.i("wang", "createWood wood:"+wood);
        return wood;
    }

    @Provides
    public Desk createDesk(Wood wood) {
        Log.i("wang", "createDesk wood:"+wood);
        return new Desk(wood);
    }
}
