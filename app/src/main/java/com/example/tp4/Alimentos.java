package com.example.tp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Alimentos extends AppCompatActivity {

    // Array of strings...
    ListView listaAlimentosView;

    // \n hace un punto y aparte
    String listaAlimentos[] = {
            "Milanesas de Carne \n30 Calorias \n30 Proteinas \n30 Grasas \n30 carbohidratos",
            "Milanesas de Pollo \n20 Calorias \n20 Proteinas \n20 Grasas \n20 carbohidratos",
            "Ensalada de Frutas \n30 Calorias \n30 Proteinas \n30 Grasas \n30 carbohidratos"
    };

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentos);
        listaAlimentosView = (ListView)findViewById(R.id.listaDeAlimentosView);
        // mEdit.setKeyListener(null) sacaria la edicion de los textview
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_nodo_lista, R.id.editText2, listaAlimentos);
        listaAlimentosView.setAdapter(arrayAdapter);
    }

}

