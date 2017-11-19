package com.example.wangweijun.dagger2_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;


public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Inject
    @Named("red")
    Cloth redCloth;

    @Inject
    @Named("blue")
    Cloth blueCloth;


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

//        tv.setText("我现在有" + cloth + ", "+shoe + ", "+clothes);
        tv.setText(redCloth + ", " + blueCloth);
    }
}
