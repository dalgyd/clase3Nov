package com.example.clase3nov;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.clase3nov.persistencia.DBHelper;

public class Registro extends AppCompatActivity {

    Button btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(Registro.this); // Instancia de un objeto
                SQLiteDatabase db = dbHelper.getWritableDatabase(); //Crearla = Escribir
                // Validación
                if(db != null){
                    Toast.makeText(Registro.this, "BASE DE DATOS CREADA",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(Registro.this,"ERROR AL CREAR BASE DE DATOS", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}