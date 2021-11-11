package com.first.second;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        openApp(true);


        ImageView gnomo = findViewById(R.id.gnome);
        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        gnomo.startAnimation(rotate);


        ImageView mMovil = findViewById(R.id.movil);

        Glide.with(this)
                //.load(R.drawable.movil);
                .load("https://images.unsplash.com/photo-1634403665481-74948d815f03?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=687&q=80")
                .into(mMovil);
    }

    public void openApp(boolean locationPermission){

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,Login.class);

                startActivity(intent);
            }
        }, 3000);
    }
}