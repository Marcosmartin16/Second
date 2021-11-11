package com.first.second;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;


/**
 * @author marcosmartin16
 */


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ImageView gnomo = findViewById(R.id.gnome);
        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        gnomo.startAnimation(rotate);

        ImageView fireball = findViewById(R.id.fireball);
        Animation translate = AnimationUtils.loadAnimation(this, R.anim.translation);
        fireball.startAnimation(translate);

        //Glide for loading girl
        ImageView mGirl = findViewById(R.id.girl);

        Glide.with(this)
               //.load("https://images.unsplash.com/photo-1634829276578-05c2bde8b0a5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80")
                .load(R.drawable.girl)
                    .transition(DrawableTransitionOptions.withCrossFade(500))
                    //.placeholder(new ColorDrawable(this.getResources().getColor(R.color.amarillo_box)))



                .into(mGirl);
    }

    public void openMain(View v){
        Intent intent = new Intent(Login.this, Main.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void openRegister(View v){
        Intent intent = new Intent(Login.this, Register.class);

        startActivity(intent);
    }

}