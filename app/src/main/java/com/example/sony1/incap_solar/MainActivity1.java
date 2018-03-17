package com.example.sony1.incap_solar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    Button iniciar;
    TextView registrar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        iniciar =(Button)findViewById(R.id.iniciar);

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent iniciar = new Intent(MainActivity1.this, MainActivity2.class);
                startActivity(iniciar);
            }
        });

        registrar = (TextView)findViewById(R.id.registrar);

        registrar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent registrar = new Intent (MainActivity1.this, MainActivity3.class);
                startActivity(registrar);
            }
        });
    }
}
