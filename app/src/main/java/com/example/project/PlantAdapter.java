package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlantAdapter extends RecyclerView.Adapter<PlantViewHolder> {

    private List<Plants> plantsList = new ArrayList();

    @NonNull
    @Override
    public PlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlantViewHolder((LayoutInflater.from(parent.getContext()).inflate(R.layout.item_plant, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull PlantViewHolder holder, int position) {

        Plants plants = plantsList.get(position);

        holder.plantName.setText(plants.plantName);
        holder.cost.setText(String.valueOf(plants.getcost()));
        holder.location.setText(plants.location);
        holder.ID.setText(plants.getID());
    }

    @Override
    public int getItemCount() {

        return plantsList.size();
    }

    public void setplantsList(List<Plants> plantsList){
        this.plantsList = plantsList;
    }
}