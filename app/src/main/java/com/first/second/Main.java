package com.first.second;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.lang.invoke.ConstantCallSite;

public class Main extends AppCompatActivity {

    private WebView mivisorweb;
    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);

        mivisorweb = (WebView) findViewById(R.id.visitaweb);
        mivisorweb.getSettings().setBuiltInZoomControls(true);
        mivisorweb.loadUrl("https://www.thisfuckeduphomerdoesnotexist.com/");
    }

    protected SwipeRefreshLayout.OnRefreshListener
        mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            Toast toast0 = Toast.makeText(Main.this, "Los sinson", Toast.LENGTH_LONG);
            toast0.show();

            mivisorweb.reload();

            swipeLayout.setRefreshing(false);
        }
    };

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_context,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                    /*Toast toast = Toast.makeText(this, "Item copied",
                            Toast.LENGTH_LONG);
                    toast.show();*/

              final  ConstraintLayout mLayout =  findViewById(R.id.myMainConstraint);

                Snackbar snackbar = Snackbar
                        .make(mLayout, "aaaaaaaaaaaaaaaaaa", Snackbar.LENGTH_LONG)
                        .setAction("UNDu", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(mLayout, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", Snackbar.LENGTH_SHORT);
                                snackbar1.show();
                            }
                        });

                snackbar.show();


                return true;

            case R.id.item2:
                Toast toast2 =
                        Toast.makeText(this, "Item download", Toast.LENGTH_SHORT);
                toast2.show();
                return true;

            default:
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_bar,menu);
        return true;
    }
}