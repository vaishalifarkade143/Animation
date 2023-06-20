package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageView myimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myimg=(ImageView) findViewById(R.id.myimg);
        Animation animation =AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadeout);
        // Animation animation =AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadein);
        myimg.startAnimation(animation);
        //image show once then gayab hogi this codwe is for permant fadeout
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               myimg.setVisibility(View.GONE);
            }
        },4000);
    }
}