package com.shivank.gdsubway_gla.shop_categories;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.shivank.gdsubway_gla.R;

import java.util.ArrayList;

 public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

     public String[] items;
     public String[] prices;

    public MyAdapter(String[] data, String[] data1) {
        items = data;
        prices = data1;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_tayles_north_street, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String item = items[position];
        holder.textView.setText(item);
        String price = prices[position];
        holder.textView2.setText(price);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textView, textView2;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txt1);
            textView2 = itemView.findViewById(R.id.txt2);
        }
    }
}

/*
public class CustomSpinnerAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] items, prices;

    public CustomSpinnerAdapter(Context context, String[] items, String[] prices) {
        super(context, 0, items);
        this.context = context;
        this.items = items;
        this.prices = prices;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    private View getCustomView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.food_tayles_north_street, parent, false);
        }

        TextView txt2 = view.findViewById(R.id.txt1);
        TextView textView = view.findViewById(R.id.txt2);

        // Set the data for each item in the Spinner

        String item = items[position];
        txt2.setText(item);
        textView.setText(prices[position]);

        //imageView.setImageResource(R.drawable.image_placeholder);

        return view;
    }

}
*/
