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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        SecondComponent secondComponent = DaggerSecondComponent.builder()
                .baseComponent(((MyApp)getApplication()).getBaseComponent())
                .secondModule(new SecondModule()).build();
        secondComponent.inject(this);


        Log.i("wang", "clothHandler:"+clothHandler);

    }
}
