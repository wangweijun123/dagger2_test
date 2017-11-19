package com.example.wangweijun.dagger2_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Inject
    Cloth cloth;


    @Inject
    Shoe shoe;

    @Inject
    Clothes clothes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.tv);

        MainComponent build = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        build.inject(this);

        tv.setText("我现在有" + cloth + ", "+shoe + ", "+clothes);

    }
}
