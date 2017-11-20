package com.example.wangweijun.dagger2_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;


public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Inject
//    @Named("red")
    @RedCloth
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

        tv = (TextView) findViewById(R.id.tv);

        MainComponent build = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        build.inject(this);

        Log.i("wang", "redCloth:" + redCloth + ", "+redCloth.getColor());
        Log.i("wang", "blueCloth:" + blueCloth + ", " + blueCloth.getColor());
        Log.i("wang", "shoe:" + shoe);
        Log.i("wang", "clothes:" + clothes + ", clothes.getCloth() : " + clothes.getCloth()
        +", "+clothes.getCloth().getColor());
    }
}
