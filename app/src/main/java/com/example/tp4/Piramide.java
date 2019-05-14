package com.example.tp4;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Piramide extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout; // para el snackbar

    // Array of strings...
    ListView listaAlimentosView;

    String listaAlimentos[] = {
            "Milanesas de Carne",
            "Milanesas de Pollo",
            "Ensalada de Frutas"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piramide);


        TextView buttonViewSnack = (TextView) findViewById(R.id.buttonViewSnack);
        buttonViewSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.piramide);
                String message = "Snackbar message";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }

        });

        // lista de alimentos
        listaAlimentosView = (ListView)findViewById(R.id.listAlimentoPiramide);
        // mEdit.setKeyListener(null) sacaria la edicion de los textview
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_nodo_lista, R.id.editText2, listaAlimentos);
        listaAlimentosView.setAdapter(arrayAdapter);

    }

    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }
}
