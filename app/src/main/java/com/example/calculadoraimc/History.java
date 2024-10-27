package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }
    @SuppressLint("NotConstructor")
    public void Calculator(View view){
        Intent calculator=new Intent(this, Calculator.class);
        startActivity(calculator);
    }
}