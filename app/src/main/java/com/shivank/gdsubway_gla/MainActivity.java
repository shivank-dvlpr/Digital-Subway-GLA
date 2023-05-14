package com.shivank.gdsubway_gla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;
import com.shivank.gdsubway_gla.shop_categories.CraveIt;
import com.shivank.gdsubway_gla.shop_categories.TheFoodTales;
import com.shivank.gdsubway_gla.shop_categories.The_South_Indian_delight;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgInfo, craveIt1, craveIt2;
    LinearLayout foodTalesLayout, southIndianDelight, craveIt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        craveIt1 = findViewById(R.id.craveIt1);
        craveIt2 = findViewById(R.id.craveIt2);

        Glide.with(this)
                .load(R.drawable.cr)
                .centerCrop()
                .into(craveIt1);

        Glide.with(this)
                .load(R.drawable.gd)
                .centerCrop()
                .into(craveIt2);


        imgInfo = findViewById(R.id.imgInfo);
        imgInfo.setOnClickListener(this);
        imgInfo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Snackbar.make(view,  "Developed by Shivank Yadav", Snackbar.LENGTH_LONG).show();
                return true;
            }
        });

        foodTalesLayout = findViewById(R.id.foodTalesLayout);
        foodTalesLayout.setOnClickListener(this);

        southIndianDelight = findViewById(R.id.southIndiaDelight);
        southIndianDelight.setOnClickListener(this);

        craveIt = findViewById(R.id.craveIt);
        craveIt.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.imgInfo:
                startActivity(new Intent(MainActivity.this, InfoClass.class));
                break;

            case R.id.foodTalesLayout:
                startActivity(new Intent(this, TheFoodTales.class));
                break;

            case R.id.southIndiaDelight:
                startActivity(new Intent(this, The_South_Indian_delight.class));
                break;

            case R.id.craveIt:
                startActivity(new Intent(this, CraveIt.class));
                break;


        }

    }
}