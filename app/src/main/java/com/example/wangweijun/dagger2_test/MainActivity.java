package com.example.wangweijun.dagger2_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
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

    @Inject
    Father father;

    @Inject
    Child child;

    @Inject
    ClothHandler clothHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

//        MainComponent build = DaggerMainComponent.builder()
//                .baseComponent(((MyApp)getApplication()).getBaseComponent())
//                .mainModule(new MainModule()).build();
//        build.inject(this);

        MyApp application = (MyApp) getApplication();
        application.getBaseComponent().getSubMainComponent(new MainModule()).inject(this);

        Log.i("wang", "inject finised");

        Log.i("wang", "redCloth:" + redCloth + ", "+redCloth.getColor());
        Log.i("wang", "blueCloth:" + blueCloth + ", " + blueCloth.getColor());
        Log.i("wang", "shoe:" + shoe);
        Log.i("wang", "clothes:" + clothes + ", clothes.getCloth() : " + clothes.getCloth()
        +", "+clothes.getCloth().getColor());

        Log.i("wang", "####################");
        Log.i("wang", "father:"+father);
        Log.i("wang", "child.getFather():"+child.getFather());

        Log.i("wang", "####################");


        Log.i("wang", "clothHandler:"+clothHandler);


        Clothes clothes = clothHandler.handle(redCloth);

        Log.i("wang", "clothes:"+clothes);
    }

    public void startSecondActivity(View v) {
        startActivity(new Intent(getApplicationContext(), SecondActivity.class));
    }
}
