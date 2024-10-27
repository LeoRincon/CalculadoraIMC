package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("NotConstructor")
    public void Login(View view){
        Intent login=new Intent(this, RegisterUser.class);
        startActivity(login);
    }
    @SuppressLint("NotConstructor")
    public void Calculator(View view){
        Intent calculator=new Intent(this, Calculator.class);
        startActivity(calculator);
    }
    @SuppressLint("NotConstructor")
    public void Register(View view){
        Intent register=new Intent(this, RegisterUser.class);
        startActivity(register);
    }
    @SuppressLint("NotConstructor")
    public void History(View view){
        Intent history=new Intent(this, History.class);
        startActivity(history);
    }
}