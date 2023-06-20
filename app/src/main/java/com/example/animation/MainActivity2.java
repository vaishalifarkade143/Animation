package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView myimg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myimg2=(ImageView) findViewById(R.id.myimg2);
        //Animation animation = AnimationUtils.loadAnimation(MainActivity2.this,R.anim.blink);
        //Animation animation = AnimationUtils.loadAnimation(MainActivity2.this,R.anim.zoomin);
       // Animation animation = AnimationUtils.loadAnimation(MainActivity2.this,R.anim.rotate);
        //Animation animation = AnimationUtils.loadAnimation(MainActivity2.this,R.anim.rigthtoright);
        Animation animation = AnimationUtils.loadAnimation(MainActivity2.this,R.anim.mix);


        myimg2.startAnimation(animation);
    }
}