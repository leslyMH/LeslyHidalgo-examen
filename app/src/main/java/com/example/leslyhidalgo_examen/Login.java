package com.example.leslyhidalgo_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText etUser, etPass;
    Button btnAcep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        etUser = (EditText) findViewById(R.id.etUsuario);
        etPass = (EditText) findViewById(R.id.etContraseña);
        btnAcep = (Button) findViewById(R.id.btnIngresar);

        btnAcep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario = etUser.getText().toString();
                String contraseña = etPass.getText().toString();

                if(usuario.equals("estudiante2020") && contraseña.equals("uisrael2020")){

                    Intent intentEnvio = new Intent (getApplicationContext(),Registro.class);
                    intentEnvio.putExtra("usuario", etUser.getText().toString());
                    startActivity(intentEnvio);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

