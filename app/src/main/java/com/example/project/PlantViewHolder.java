package com.example.project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlantViewHolder extends RecyclerView.ViewHolder {

    public TextView name;
    public TextView location;
    public TextView ID;
    public TextView cost;


    public PlantViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.namepr);
        name = itemView.findViewById(R.id.locationpr);
        name = itemView.findViewById(R.id.IDpr);
        name = itemView.findViewById(R.id.costpr);
    }
}