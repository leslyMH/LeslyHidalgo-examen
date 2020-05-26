package com.example.leslyhidalgo_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    Bundle infoRecibir, datosRecibir;
    EditText deportes, idioma, respEscrita, nombre, usuario, cuota;
    String deport, idiom, respuestaE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resumen);

        usuario = findViewById(R.id.et1);
        nombre = findViewById(R.id.et2);
        cuota = findViewById(R.id.et3);

        respEscrita = findViewById(R.id.et4);
        deportes = findViewById(R.id.et5);
        idioma =findViewById(R.id.et6);

        datosRecibir = getIntent().getExtras();
        String recibirNombre = datosRecibir.getString("nombre");
        nombre.setText(recibirNombre);

        datosRecibir = getIntent().getExtras();
        String recibirUsuario = datosRecibir.getString("usuario");
        usuario.setText(recibirUsuario);

        datosRecibir = getIntent().getExtras();
        String recibirCuota = datosRecibir.getString("cuota");
        cuota.setText(recibirCuota);

        infoRecibir = getIntent().getExtras();
        respuestaE = infoRecibir.getString("respEscrita");
        deport = infoRecibir.getString("deportes");
        idiom = infoRecibir.getString("idioma");

        respEscrita.setText(respuestaE);
        deportes.setText(deport);
        idioma.setText(idiom);
    }
}













