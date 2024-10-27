package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }
    @SuppressLint("NotConstructor")
    public void History(View view){
        Intent history=new Intent(this, History.class);
        startActivity(history);
    }
    @SuppressLint("NotConstructor")
    public void Login2(View view){
        Intent login2=new Intent(this, MainActivity.class);
        startActivity(login2);
    }
}