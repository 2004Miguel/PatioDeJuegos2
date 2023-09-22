package com.miguel.patiodejuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    String nombre, apellido;
    TextView name, surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        name=findViewById(R.id.nombre_recibido);
        surname=findViewById(R.id.recapellido);

        Intent recibir_datos=getIntent();

        nombre=recibir_datos.getStringExtra("nombre_recibido");
        apellido=recibir_datos.getStringExtra("recapellido");

        name.setText(nombre);
        surname.setText(apellido);
    }
}