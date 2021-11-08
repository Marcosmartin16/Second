package com.first.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ImageView mHipman = findViewById(R.id.veigar2);

        Glide.with(this)
                .load(R.drawable.veigar2)
                    .transition(DrawableTransitionOptions.withCrossFade(500))
                .into(mHipman);
    }
}