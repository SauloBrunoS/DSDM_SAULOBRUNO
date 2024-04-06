package com.example.planetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_planets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Planeta> planetaList = new ArrayList<>();

        planetaList.add(new Planeta("Mercúrio", "0 luas", R.drawable.mercurio));
        planetaList.add(new Planeta("Vênus", "0 luas", R.drawable.venus));
        planetaList.add(new Planeta("Terra", "1 lua", R.drawable.terra));
        planetaList.add(new Planeta("Marte", "2 luas", R.drawable.marte));
        planetaList.add(new Planeta("Júpiter", "79 luas", R.drawable.jupiter));

        lv_planets = findViewById(R.id.lv_planets);

        PlanetaArrayListAdapter planetaArrayListAdapter = new PlanetaArrayListAdapter(this, planetaList);

        lv_planets.setAdapter(planetaArrayListAdapter);

        lv_planets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nomePlaneta = planetaList.get(position).getNomePlaneta();
                Intent intent = null;

                switch (nomePlaneta) {
                    case "Mercúrio":
                        intent = new Intent(MainActivity.this, Mercurio.class);
                        break;
                    case "Vênus":
                        intent = new Intent(MainActivity.this, Venus.class);
                        break;
                    case "Terra":
                        intent = new Intent(MainActivity.this, Terra.class);
                        break;
                    case "Marte":
                        intent = new Intent(MainActivity.this, Marte.class);
                        break;
                    case "Júpiter":
                        intent = new Intent(MainActivity.this, Jupiter.class);
                        break;
                }
                if (intent != null) {
                    startActivity(intent);
                }
            }
        });
    }
}