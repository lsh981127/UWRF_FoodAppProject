package com.course.uwrf_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Fridge3RoomTemp extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fridgelayout3roomtemp);

        Button mainfoodsearch_btn = (Button) findViewById(R.id.foodsearchbtn1);
        Button mainfridge_btn = (Button) findViewById(R.id.fridgebtn1);
        Button mainhome_btn = (Button) findViewById(R.id.homebtn);

        Button fridge_btn = (Button) findViewById(R.id.fridgebtn);
        Button freezer_btn = (Button) findViewById(R.id.freezerbtn);
        Button roomtemp_btn = (Button) findViewById(R.id.roomtempbtn);

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

        fridge_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Fridge1.class);
                startActivity(intent);
            }
        });

        freezer_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Fridge2Freezer.class);
                startActivity(intent);
            }
        });

        roomtemp_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Fridge3RoomTemp.class);
                startActivity(intent);
            }
        });
    }
}
