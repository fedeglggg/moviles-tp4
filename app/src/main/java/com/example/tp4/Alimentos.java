package com.example.tp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Alimentos extends AppCompatActivity {



    // datos de los alimentos
    ListView mylist;
    String text[] = new String[]{"Manzana \n55 Calorias \n0.3 Proteinas \n0.3 Grasas \n11.5 carbohidratos",
            "Pan \n210 Calorias \n7,5 Proteinas \n1,3 Grasas \n52 carbohidratos",
            "Queso fresco \n250 Calorias \n17 Proteinas \n18,1 Grasas \n1,9 carbohidratos",
            "Tomate \n23 Calorias \n0,8 Proteinas \n0,2 Grasas \n3,5 carbohidratos"
    };

    // fotos de los alimentos
    int image[] = new int[]{
            R.drawable.manzana,
            R.drawable.pan,
            R.drawable.queso,
            R.drawable.tomate
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentos);

        // mando al adapter mis datos para que los muestre en el xml
        mylist = (ListView) findViewById(R.id.listaDeAlimentosView);
        AlimentosAdapter myadapter = new AlimentosAdapter(getApplicationContext(),image, text);
        mylist.setAdapter(myadapter);

    }
}

