package com.example.tp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Alimentos extends AppCompatActivity {


    //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.ListView,R.id.textView,StringArray);

    // Array of strings...
    ListView listaAlimentosView;
    String listaAlimentos[] = {"Milanesas de Carne", "Milanesas de Pollo", "Ensalada de Frutas"};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_alimentos);
        listaAlimentosView = (ListView)findViewById(R.id.listaDeAlimentosView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_alimentos, R.id.listaDeAlimentosView, listaAlimentos);
        listaAlimentosView.setAdapter(arrayAdapter);
    }
}

