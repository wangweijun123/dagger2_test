package com.example.wangweijun.dagger2_test;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by wangweijun on 2017/11/20.
 */

public class SecondActivity extends Activity{

    @Inject
    ClothHandler clothHandler;

    @Inject
    Wood wood;
    @Inject
    Desk desk;

    @Inject
    Water water;

    @Inject
    Water water2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        SecondComponent secondComponent = DaggerSecondComponent.builder()
                .baseComponent(((MyApp)getApplication()).getBaseComponent())
                .secondModule(new SecondModule()).build();
        secondComponent.inject(this);


        Log.i("wang", "clothHandler:"+clothHandler);
        Log.i("wang", "wood:"+wood);

        Log.i("wang", "desk:"+desk + ", desk.wood:"+desk.wood);

        Log.i("wang", "water:"+water);

        Log.i("wang", "water2:"+water2);

    }
}
