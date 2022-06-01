package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private ArrayList<Plants> plantList;
    private RecyclerView recyclerView;
    private Button aboutButton;
    private PlantAdapter adapter;

    private final String Tag = "==>";
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=b21ricni";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new JsonTask(this).execute(JSON_URL);


        adapter = new PlantAdapter();
        plantList = new ArrayList<Plants>();
        recyclerView =findViewById(R.id.recyclerview);
        recyclerView.setAdapter(new PlantAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        new JsonTask(this).execute(JSON_URL);

        aboutButton = findViewById(R.id.aboutbutton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "clicked about button");
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onPostExecute(String json) {
        Log.d("==>", json);
        Gson gson = new Gson();
        Type type = new TypeToken<List<Plants>>() {}.getType();
        List<Plants> listOfPlants = gson.fromJson(json, type);
        Log.d("==>","Plants amount: "+listOfPlants.size());
        Log.d("==>","Element 0 "+listOfPlants.get(0).toString());
        adapter.setplantsList(listOfPlants);
        adapter.notifyDataSetChanged();
    }
}
