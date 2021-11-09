package com.example.clase3nov.persistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NOMBRE = "scenario.db"; //se registra el nombre de la base de datos de acuerdo a la app
    private static final String TABLE_PRODUCTOS = "prductos"; //se registra el nombre de la tabla

    public DBHelper (@Nullable Context context){
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(" CREATE TABLE " + TABLE_PRODUCTOS + "(" +
                "idproducto INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "cedula FLOAT, " +
                "nombrep TEXT NOT NULL, " +
                "tipop TEXT NOT NULL, " +
                "imgpath TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL(" DROP TABLE " + TABLE_PRODUCTOS);// Consulta
        onCreate(sqLiteDatabase);

    }
}
