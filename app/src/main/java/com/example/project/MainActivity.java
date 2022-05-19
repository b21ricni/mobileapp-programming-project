package com.example.project;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    RecyclerView recyclerView;

    private final String Tag = "==>";
    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new JsonTask(this).execute(JSON_URL);

        recyclerView =findViewById(R.id.recyclerview);
        recyclerView.setAdapter(new PlantAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    @Override
    public void onPostExecute(String json) {
        Log.d("==>", json);
        Gson gson = new Gson();
        Type type = new TypeToken<List<Plants>>() {}.getType();
        List<Plants> listOfMountains = gson.fromJson(json, type);

    }
}
