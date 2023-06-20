package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Bouncing extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bouncing);
        img=(ImageView) findViewById(R.id.img);

        Animation animation = AnimationUtils.loadAnimation(Bouncing.this,R.anim.bounce);

        img.startAnimation(animation);
    }
}