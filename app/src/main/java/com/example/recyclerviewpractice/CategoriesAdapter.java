package com.example.recyclerviewpractice;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpractice.databinding.RecyclerItemCategoriesBinding;

public class CategoriesAdapter {
    RecyclerItemCategoriesBinding binding;


    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
