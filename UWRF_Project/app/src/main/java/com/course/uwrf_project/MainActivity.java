package com.course.uwrf_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button mainfoodsearch_btn = (Button) findViewById(R.id.foodsearchbtn1);
        Button mainfridge_btn = (Button) findViewById(R.id.fridgebtn1);
        Button mainhome_btn = (Button) findViewById(R.id.homebtn);

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