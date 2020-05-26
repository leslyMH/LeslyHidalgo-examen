package com.example.leslyhidalgo_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    Bundle usuarioRecibir;
    EditText usuarioR, montoI, mensual, nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        usuarioR = findViewById(R.id.etConectado);
        usuarioRecibir = getIntent().getExtras();
        String RecibirDato = usuarioRecibir.getString("usuario");
        usuarioR.setText(RecibirDato);

        montoI = findViewById(R.id.etMonto);
        mensual = findViewById(R.id.etMensual);
        nombre = findViewById(R.id.etNombre);

    }
    public void Calcular(View v){
        double montoInicial, resultado, recargo, subtotal, pago;
        montoInicial = Double.parseDouble(montoI.getText().toString());
        resultado = 1800 - montoInicial;
        recargo = resultado * 0.05;
        subtotal = resultado + recargo;
        pago = subtotal / 3;

        mensual.setText(Double.toString(pago));
    }

    public void Guardar(View v){

        Intent intentEnvio = new Intent (getApplicationContext(), Encuesta.class);
        intentEnvio.putExtra("nombre", nombre.getText().toString());
        intentEnvio.putExtra("usuario", usuarioR.getText().toString());
        intentEnvio.putExtra("cuota", mensual.getText().toString());
        startActivity(intentEnvio);

        Toast.makeText(getApplicationContext(), "Elemento guardado con éxito", Toast.LENGTH_LONG).show();

    }
}
