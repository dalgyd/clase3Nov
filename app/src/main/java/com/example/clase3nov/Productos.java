package com.example.clase3nov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Productos extends AppCompatActivity {
    List<ListElement> elements; // NUEVO

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        init(); //Lo convertimos en metodo

    }

    public void init(){
        elements = new ArrayList<ListElement>(); // Instancia del objeto elements
        elements.add(new ListElement("#775447", "Producto 2", "Colombia", "Activo")); // Tarjeta 1
        elements.add(new ListElement("#607d8b", "Producto 3", "Colombia", "Activo")); // Tarjeta 2
        elements.add(new ListElement("#03a9f4", "Producto 4", "Colombia", "Activo")); // Tarjeta 3
        elements.add(new ListElement("#009688", "Producto 5", "Colombia", "Activo")); // Tarjeta 4


        // Declaramos el ListAdapter y recibe una lista y el contexto
        ListAdapter listAdapter = new ListAdapter(elements, this);
        //Declaramos el RecyclerView
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        //Movemos unos parametros en verdadero
        recyclerView.setHasFixedSize(true);
        //Listado lineal SetLayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));

        recyclerView.setAdapter(listAdapter);
    }

}