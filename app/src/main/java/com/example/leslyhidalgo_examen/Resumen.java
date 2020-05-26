package com.example.leslyhidalgo_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    Bundle infoRecibir, datoRecibir;
    EditText deportes, idioma, respEscrita;
    EditText usuario, nombre, cuota;
    String deport, idiom, respuestaE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resumen);

        respEscrita = findViewById(R.id.et4);
        deportes = findViewById(R.id.et5);
        idioma =findViewById(R.id.et6);

        infoRecibir = getIntent().getExtras();
        respuestaE = infoRecibir.getString("respEscrita");
        deport = infoRecibir.getString("deportes");
        idiom = infoRecibir.getString("idioma");

        respEscrita.setText(respuestaE);
        deportes.setText(deport);
        idioma.setText(idiom);

        ///////////////////////////


    }
}













