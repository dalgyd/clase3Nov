package com.example.clase3nov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.clase3nov.persistencia.DBHelper;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //la declaramos de forma global
    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn); //este es para el boton de login

        // loginbtn = findViewById(R.id.loginbtn); para el boton con la base de datos

        /* codigo del boton ante la base de datos
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(MainActivity.this); //en main activity va el nombre del archivo sobre el q se esta trabajando
                SQLiteDatabase db = dbHelper.getWritableDatabase(); //en el get se determina si va a crear o leerla, en este caso la crea
                //validacion
                if (db != null) {
                    Toast.makeText(MainActivity.this, "BASE DE DATOS CREADA", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "ERROR AL CREAR BASE DE DATOS", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }*/


        //Codigo del boton tipo login
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Usuario correcto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Usuario no registrado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void regis (View m){
        // Instanciamos nuestro objeto "cambiar"
        Intent cambiar = new Intent(MainActivity.this, Registro.class);
        startActivity(cambiar);
    }



}