package com.miguel.patiodejuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    String nnombre, aapellido;
    TextView name, surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        name=findViewById(R.id.nombre_recibido);
        surname=findViewById(R.id.recapellido);

        Intent recibir_datos=getIntent();

        nnombre=recibir_datos.getStringExtra("nombre");
        aapellido=recibir_datos.getStringExtra("apellido");

        name.setText(nnombre);
        surname.setText(aapellido);
    }
}