package com.example.wangweijun.dagger2_test.custom;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.wangweijun.dagger2_test.R;
import com.example.wangweijun.dagger2_test.custom.Model.Cup;

import javax.inject.Inject;

/**
 * Created by wangweijun1 on 2017/11/28.
 */

public class MyBaseActivity extends Activity{
    @Inject
    Cup cup;

    @Inject
    Cup cup2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        MyBaseComponent customComponent = DaggerCustomComponent.builder().customModule(new MyBaseModule()).build();
//        customComponent.inject(this);

       CustomComponet customComponet = DaggerCustomComponet.builder()
                .myBaseComponent(
                        DaggerMyBaseComponent.builder()
                                .myBaseModule(new MyBaseModule()).build())
                .customModule(new CustomModule()).build();

        customComponet.inject(this);

        setContentView(R.layout.activity_custom);

        Log.i("wang", "cup:"+cup);
        Log.i("wang", "cup2:"+cup2);
    }
}
