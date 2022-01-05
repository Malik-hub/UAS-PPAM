package com.pam.firebaselogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int id = getIntent().getIntExtra("id",-1);

        ArrayList<Food> list = FoodData.getData(getApplicationContext());
        Food food = list.get(id);

        if (food!= null){
            TextView titletv = findViewById(R.id.detailtitle);
            TextView hargatv = findViewById(R.id.detailharga);
            TextView deskripsitv = findViewById(R.id.detaildeskripsi);
            ImageView image = findViewById(R.id.detailfoto);

            image.setImageDrawable(food.image);
            titletv.setText(food.title);
            hargatv.setText(String.valueOf(food.harga));
            deskripsitv.setText(food.deskripsi);

        }

    }
}