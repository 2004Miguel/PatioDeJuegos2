package com.miguel.patiodejuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Nombre, Apellido;
    Button Registrar;

    String name, surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre=findViewById(R.id.nombre);
        Apellido=findViewById(R.id.apellido);

        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name=Nombre.getText().toString();
                surname=Apellido.getText().toString();

                Intent enivar_datos=new Intent(MainActivity.this, resultado.class);
                enivar_datos.putExtra("nombre", name);
                enivar_datos.putExtra("apellido", surname);

                startActivity(enivar_datos);


            }
        });


    }

}