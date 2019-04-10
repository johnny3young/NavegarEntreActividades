package com.example.practica_01_btn_con_txtview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button btnBack, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnBack = findViewById(R.id.btnBack);
        btnNext = findViewById(R.id.bntNext);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Intent myIntent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(myIntent);
            }
        });

    }

    // con un SWICTH también lo podemos hacer
    /*public void onClick (View view) {

        Intent miIntent = null;

        switch (view.getId()){
            case R.id.btnBack:
                miIntent=new Intent(SecondActivity.this,MainActivity.class);
                break;

            case R.id.bntNext:
                miIntent=new Intent(SecondActivity.this,ThirdActivity.class);
                break;
        }
        startActivity(myIntent);
    }*/
}
