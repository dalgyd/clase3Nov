package com.example.clase3nov;

import android.content.Context;
import android.view.LayoutInflater;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mData;
    private LayoutInflater mInflater; //Inflater = Describe de que archivo proviene o que tipo de dato es
    private Context context; // Context nos indica de que clase estamos llamando al Adapter

    public ListAdapter(List<ListElement> itemList, Context context){
        this.mData = itemList;
        this.mInflater = LayoutInflater.from(context);
        this.context = context;

    }
}
