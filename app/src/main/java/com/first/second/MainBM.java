package com.first.second;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.first.second.ui.main.SectionsPagerAdapter;
import com.first.second.databinding.ActivityMainBmBinding;

public class MainBM extends AppCompatActivity {

    private ActivityMainBmBinding binding;
    private MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBmBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //el adaptador colaca las pages los fragments son las diferentes vistas
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

        BottomNavigationView mybottomNavView = findViewById(R.id.bottom_navigation);

        mybottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               switch ( item.getItemId()){
                   case R.id.heart:
                       item.setChecked(true);
                       Toast.makeText(MainBM.this, "Fav clicked", Toast.LENGTH_SHORT).show();
                       viewPager.setCurrentItem(0);
                       break;
                   case R.id.search:
                       item.setChecked(true);
                       Toast.makeText(MainBM.this, "languages", Toast.LENGTH_SHORT).show();
                       viewPager.setCurrentItem(1);
                       break;
                   case R.id.profile:
                       item.setChecked(true);
                       Toast.makeText(MainBM.this, "user clicked", Toast.LENGTH_SHORT).show();
                       viewPager.setCurrentItem(2);
                       break;
               }
               return false;
               }
       });


        //escuchador para las paginas del swipe
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(prevMenuItem != null)
                    prevMenuItem.setChecked(false);
                else
                    mybottomNavView.getMenu().getItem(0).setChecked(false);
                mybottomNavView.getMenu().getItem(position).setChecked(true);
                //removeBadge(mybottomNavView,mybottomNavView.getMenu().getItem(position).getItemId());
                prevMenuItem = mybottomNavView.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



       /*FloatingActionButton fab = binding.fab;

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
}