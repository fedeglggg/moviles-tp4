package com.example.tp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class InformacionExtra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_extra);

        //extra 1
        Button extra1Button;
        extra1Button = (Button) findViewById(R.id.button1);
        extra1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(),Extra1.class);
                startActivity(intent);
            }
        });

        //extra 2
        Button extra2Button;
        extra2Button = (Button) findViewById(R.id.button2);
        extra2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(),Extra2.class);
                startActivity(intent);
            }
        });

        //extra 3
        Button extra3Button;
        extra3Button = (Button) findViewById(R.id.button3);
        extra3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getApplicationContext(),Extra3.class);
                startActivity(intent);
            }
        });
    }
}
