package com.shivank.gdsubway_gla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.shivank.gdsubway_gla.shop_categories.TheFoodTales;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgInfo;
    LinearLayout foodTalesLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        imgInfo = findViewById(R.id.imgInfo);
        imgInfo.setOnClickListener(this);

        foodTalesLayout = findViewById(R.id.foodTalesLayout);
        foodTalesLayout.setOnClickListener(this);

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
        }

    }
}