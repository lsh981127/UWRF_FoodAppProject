package com.course.uwrf_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class foodsearch1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodsearch1);   // foodsearch1 이라는 layout을 연결하는 거야

        Button mainfoodsearch_btn = (Button) findViewById(R.id.foodsearchbtn1);
        Button mainfridge_btn = (Button) findViewById(R.id.fridgebtn1);
        Button mainhome_btn = (Button) findViewById(R.id.homebtn);

        Button foodButton = (Button) findViewById(R.id.foodbtn);
        Button recentButton = (Button) findViewById(R.id.recentlybtn);
        Button mostButton = (Button) findViewById(R.id.mostbtn);

        foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), foodsearch1.class);
                startActivity(intent);
            }
        });

        recentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), foodsearchRecent2.class);
                startActivity(intent);
            }
        });

        mostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), foodsearchMost3.class);
                startActivity(intent);
            }
        });

        mainfoodsearch_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), foodsearch1.class);
                startActivity(intent);
            }
        });

        mainfridge_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Fridge1.class);
                startActivity(intent);
            }
        });

        mainhome_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



    }


}
