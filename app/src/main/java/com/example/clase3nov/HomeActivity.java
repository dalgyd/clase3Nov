package com.example.clase3nov;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();//Oculta barra superior


    }
}