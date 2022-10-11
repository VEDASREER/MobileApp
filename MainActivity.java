package com.example.foodwaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
RelativeLayout searchfood, updatefood, donatefood, mycart, myorder, createcity, createplace, myprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchfood = findViewById(R.id.searchfood);
        donatefood = findViewById(R.id.donatefood);
        updatefood = findViewById(R.id.updatefood);
        mycart = findViewById(R.id.mycart);
        createcity = findViewById(R.id.createcity);
        createplace = findViewById(R.id.createplace);
        myprofile = findViewById(R.id.myprofile);
        searchfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Searchfood.class);
                startActivity(intent);
            }
        });
        donatefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Donatefood.class);
                startActivity(intent);
            }
        });
        updatefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Updatefood.class);
                startActivity(intent);
            }
        });
        mycart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Mycart.class);
                startActivity(intent);
            }
        });
        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Myorder.class);
                startActivity(intent);
            }
        });
        createcity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Createcity.class);
                startActivity(intent);
            }
        });
        createplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Createplace.class);
                startActivity(intent);
            }
        });
        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Myprofile.class);
                startActivity(intent);
            }
        });

    }
}