package com.first.second;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomappbar.BottomAppBar;

public class Bab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab);

        BottomAppBar bottomAppBar = findViewById(R.id.bottom_app_bar);

        //click event fab
        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Bab.this,"Fab clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Bab.this, MainBM.class);

                startActivity(intent);
            }
        });

        //click event burger
        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Bab.this,"Menu clicked", Toast.LENGTH_SHORT).show();
            }
        });

        //click event botton bar menu item
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.heart:
                        Toast.makeText(Bab.this,"added to favourites", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.search:
                        Toast.makeText(Bab.this,"Beginning search", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }
}

