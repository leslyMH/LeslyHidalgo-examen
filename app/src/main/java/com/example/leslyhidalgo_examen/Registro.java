package com.example.leslyhidalgo_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    Bundle datoRecibir;
    EditText recibir, montoI, mesual, nombre, usuarioC, mensual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        recibir = findViewById(R.id.etConectado);
        datoRecibir = getIntent().getExtras();
        String RecibirDato = datoRecibir.getString("usuario");
        recibir.setText(RecibirDato);

        montoI = findViewById(R.id.etMonto);
        mesual = findViewById(R.id.etMensual);
        nombre = findViewById(R.id.etNombre);

    }
    public void Calcular(View v){
        double montoInicial, resultado, recargo, subtotal, pago;
        montoInicial = Double.parseDouble(montoI.getText().toString());
        resultado = 1800 - montoInicial;
        recargo = resultado * 0.05;
        subtotal = resultado + recargo;
        pago = subtotal / 3;

        mesual.setText(Double.toString(pago));
    }

    public void Guardar(View v){

        Intent intentEnvio = new Intent (getApplicationContext(), Encuesta.class);
        intentEnvio.putExtra("nombreU", nombre.getText().toString());
        startActivity(intentEnvio);

        Toast.makeText(getApplicationContext(), "Elemento guardado con éxito", Toast.LENGTH_LONG).show();

    }
}
