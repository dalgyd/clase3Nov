package com.example.clase3nov;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    //ViewHolder = describe una vista de un elemento (card) y metadatos sobre su lugar en recycler view
    private List<ListElement> mData;
    private LayoutInflater mInflater; //Inflater = Describe de que archivo proviene o que tipo de dato es
    private Context context; // Context nos indica de que clase estamos llamando al Adapter

    public ListAdapter(List<ListElement> itemList, Context context){
        this.mData = itemList;
        this.mInflater = LayoutInflater.from(context);
        this.context = context;

    }



    @Override
    public int getItemCount(){

        return mData.size();
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    // final = tiene varios contextos:
            //1. modificador de no acceso aplicable a una variable, a un metodo o una clase
            //EX. No se pueden reasignar y debemos inicializarla
            //2. Es una referecia de un objeto
    // Segun la documentacion es buena practica representar ls variables finales en mayuscula

    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int POSITION){
        holder.bindData(mData.get(POSITION));
    }

    public void setItems(List<ListElement> items)
    {
        mData = items;
    }


    // ViewHolder = Describe una vista de un elemento(CARD)y matadatos sobre su lugar dentro de RecyclerView
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name, country, status;

        ViewHolder(View itemView){
            super(itemView); //Super = Se refiere a una variable local en un método.
            iconImage = itemView.findViewById(R.id.iconImageView);
            name = itemView.findViewById(R.id.nameTextView);
            country = itemView.findViewById(R.id.countryView);
            status = itemView.findViewById(R.id.statusTextView);
        }

        void bindData(final ListElement item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            // PorterDuff = Describe la forma de combinar imagenes
            // crearon un articulo seminal sobre "composicion de imagenes"
            name.setText(item.getName()); //Cambiamos el nombre
            country.setText(item.getCountry());
            status.setText(item.getStatus());
        }
    }
}
