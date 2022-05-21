package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class PlantAdapter extends RecyclerView.Adapter<PlantViewHolder> {

    List<String> plants = Arrays.asList("Aloe Vera", "Dracaena","Succulents","Milk Tree Cactus","Snake plant" );

    @NonNull
    @Override
    public PlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_plant, parent, false);
        return new PlantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlantViewHolder holder, int position) {
        holder.name.setText(plants.get(position));
    }

    @Override
    public int getItemCount() {
        return plants.size();
    }
}