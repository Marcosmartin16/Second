package com.first.second;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

import java.lang.invoke.ConstantCallSite;

public class Main extends AppCompatActivity {

    private WebView mivisorweb;
    private SwipeRefreshLayout swipeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mycontext = (WebView) findViewById(R.id.visitaweb);
        registerForContextMenu(mycontext);

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

            /*Toast toast0 = Toast.makeText(Main.this, "Los sinson", Toast.LENGTH_SHORT);
            toast0.show();*/

            //Toast con imagen
            LayoutInflater myInflater = getLayoutInflater();
            View myLayout = myInflater.inflate(R.layout.toast_custom,null);
            Toast mytoast = new Toast(getApplicationContext());
            mytoast.setGravity(Gravity.BOTTOM,0,0);
            mytoast.setDuration(Toast.LENGTH_SHORT);
            mytoast.setView(myLayout);
            mytoast.show();

            mivisorweb.reload();

            swipeLayout.setRefreshing(false);
        }
    };

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                    /*Toast toast = Toast.makeText(this, "Item copied",
                            Toast.LENGTH_LONG);
                    toast.show();*/

                final ConstraintLayout mLayout =  findViewById(R.id.myMainConstraint);

                Snackbar snackbar = Snackbar
                        .make(mLayout, "Item copied", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snackbar1 = Snackbar.make(mLayout, "Item not copied", Snackbar.LENGTH_SHORT);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.search) {
            Toast toast = Toast.makeText(this, "Searching", Toast.LENGTH_SHORT);
            toast.show();

        }
        if (id == R.id.heart) {
            Toast toast = Toast.makeText(this, "Fav", Toast.LENGTH_SHORT);
            toast.show();

        }
        if (id == R.id.item1) {
            showAlertDialogButtonClicked(Main.this);
        }
        if (id == R.id.item2) {
            Intent intent = new Intent(Main.this, Bab.class);

            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void showAlertDialogButtonClicked(Main view){
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);

        /*builder.setTitle("Wait a minute!");
        builder.setMessage("Who are you?");
        builder.setIcon(R.drawable.ic_gnome);*/

        builder.setView(getLayoutInflater().inflate(R.layout.toast_custom, null));

        builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setNeutralButton("A", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}