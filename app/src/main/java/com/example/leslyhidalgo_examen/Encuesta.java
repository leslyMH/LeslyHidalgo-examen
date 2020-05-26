package com.example.leslyhidalgo_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Encuesta extends AppCompatActivity {

    Bundle datoNombre;
    EditText nombre, respEscrita;
    EditText usuarioR, nombreR, cuotaR;
    CheckBox cb1, cb2, cb3;
    RadioButton rb1, rb2;
    StringBuffer deportes = new StringBuffer();
    StringBuffer idioma = new StringBuffer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encuesta);

        nombre = findViewById(R.id.etNombreU);
        datoNombre = getIntent().getExtras();
        String RecibirNombre = datoNombre.getString("nombreU");
        nombre.setText(RecibirNombre);

        respEscrita = findViewById(R.id.etRespuesta);

        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);

        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
    }

    public void respuestas(){

        if (cb1.isChecked() == true){
            deportes.append( " Rugby " );
        }

        if (cb2.isChecked() == true){
            deportes.append( " Baloncesto " );
        }

        if (cb3.isChecked() == true){
            deportes.append( " Natación " );
        }

        ///////////

        if (rb1.isChecked() == true){
            idioma.append(rb1.getText().toString()).append("  ");
        }
        if (rb2.isChecked() == true){
            idioma.append(rb2.getText().toString()).append("  ");
        }
    }

    public void enviarR (View v){
        respuestas();
        Intent intentEnvio= new Intent(Encuesta.this,Resumen.class);
        intentEnvio.putExtra("respEscrita",respEscrita.getText().toString());
        intentEnvio.putExtra("deportes",deportes.toString());
        intentEnvio.putExtra("idioma",idioma.toString());
        startActivity(intentEnvio);
    }
}
