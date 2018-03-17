package com.example.sony1.incap_solar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

 EditText nombre,apellido,contraseña,correo;
 Button btn_registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nombre= (EditText) findViewById(R.id.nombre);
        apellido= (EditText) findViewById(R.id.apellido);
        contraseña= (EditText) findViewById(R.id.password);
        correo= (EditText) findViewById(R.id.correo);

        btn_registrar= (Button) findViewById(R.id.insertar);


        btn_registrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
