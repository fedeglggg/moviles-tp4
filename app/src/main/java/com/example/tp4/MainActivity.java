package com.example.tp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // creo el boton y agreo un onclick -> crea un intent y pasa a ejectuar la actividad siguiente
        Button alimentosButton;
        alimentosButton = (Button) findViewById(R.id.alimentosButton);
        alimentosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(),Alimentos.class);
                startActivity(intent);
            }
        });

        //piramide
        Button piramideButton;
        piramideButton = (Button) findViewById(R.id.piramideButton);
        piramideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(),Piramide.class);
                startActivity(intent);
            }
        });

        //informacion extra
        Button informacionExtraButton;
        piramideButton = (Button) findViewById(R.id.informacionExtraButton);
        piramideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(),InformacionExtra.class);
                startActivity(intent);
            }
        });




    }
}
