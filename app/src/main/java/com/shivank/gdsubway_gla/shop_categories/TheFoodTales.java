package com.shivank.gdsubway_gla.shop_categories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import com.shivank.gdsubway_gla.R;

import java.util.ArrayList;
import java.util.List;

public class TheFoodTales extends AppCompatActivity {

    private final String[] items = {"Chhole Bhature", "Panner Chhole Bhature", "Pav-Bhaji", "Cheese Pav-Bhaji", "Amul Butter Pav-Bhaji", "Pav-Nutri"
            , "Chhole Kulche", "Paneer Chhole Kulche", "Nutri Kulcha"};
    private final String[] prices = {"85 Rs.", "99 Rs.", "65 Rs.", "79 Rs.", "79 Rs.", "79 Rs.", "65 Rs.", "79 Rs.", "89 Rs."};

    private final String[] pateezItems = {
            "Ragda Masala Pateez",
            "Chilly cheese Pateez",
            "Corn 'n' Cheese Pateez",
            "Barbeque Paneer Pateez",
            "Peppy Paneer Pateez",
            "Russian Masala Pateez",
            "Pizza Pateez"};

    private final String[] pateezPrices = {
              "35 Rs."
            , "39 Rs."
            , "39 Rs."
            , "49 Rs."
            , "49 Rs."
            , "55 RS."
            , "59 Rs."};

    List<String> aa11 = new ArrayList<>();

    Spinner spinner;
    RecyclerView listView, listViewPateez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_food_tales);
        getSupportActionBar().setTitle("The Food Tales by HEU");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //spinner = findViewById(R.id.spinner);
        listView = findViewById(R.id.lisViewNorth);
        listViewPateez = findViewById(R.id.lisViewPateez);

        MyAdapter myAdapter = new MyAdapter(items, prices);
        listView.setAdapter(myAdapter);
        listView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter myAdapter1 = new MyAdapter(pateezItems, pateezPrices);
        listViewPateez.setAdapter(myAdapter1);
        listViewPateez.setLayoutManager(new LinearLayoutManager(this));

       // ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,items);
        //listView.setAdapter(adapter1);


       /* ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,prices);
        listViewPateez.setAdapter(adapter2);*/

        /*CustomSpinnerAdapter adapter = new CustomSpinnerAdapter(this, items, prices);
        listView.setAdapter(adapter);

        CustomSpinnerAdapter adapter1 = new CustomSpinnerAdapter(this, items, prices);
        listViewPateez.setAdapter(adapter1);*/

       // ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
       // adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);


    }
}