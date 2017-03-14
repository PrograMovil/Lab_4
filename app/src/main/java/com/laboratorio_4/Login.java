package com.laboratorio_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;

import LogicaNegocio.Usuario;

public class Login extends AppCompatActivity {

    public Controlador controlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        controlador=new Controlador();
    }

    public void iniciarSesion(View v){


        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        Intent intent=new Intent(Login.this,ExpedienteActivity.class);
        controlador.acceder(username.getText().toString(),password.getText().toString());
        Usuario user = new Usuario(username.getText().toString(),password.getText().toString());
        intent.putExtra("controlador", controlador);

        Login.this.startActivity(intent);

    }

}
