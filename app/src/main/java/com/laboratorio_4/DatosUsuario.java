package com.laboratorio_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DatosUsuario extends AppCompatActivity {
    Controlador controlador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_usuario);
        controlador = (Controlador) getIntent().getSerializableExtra("controlador");
        cargarDatosUsuario();
    }

    public void cargarDatosUsuario(){
        TextView nombre = (TextView) findViewById(R.id.nombre);
        TextView cedula = (TextView) findViewById(R.id.cedula);
        TextView carrera = (TextView) findViewById(R.id.carrera);
        TextView direccion = (TextView) findViewById(R.id.direccion);
        TextView fechaNac = (TextView) findViewById(R.id.fechaNac);
        TextView notaAdmi = (TextView) findViewById(R.id.notaAdmi);

        nombre.setText(controlador.currentEstudiante.getNombre());
        cedula.setText(controlador.currentEstudiante.getCedula());
        carrera.setText(controlador.currentCarrera.getTitulo());
        direccion.setText(controlador.currentEstudiante.getDireccion());
        fechaNac.setText(controlador.currentEstudiante.getFechaNac());
        notaAdmi.setText(controlador.currentEstudiante.getNotaAdmi());
    }
}
