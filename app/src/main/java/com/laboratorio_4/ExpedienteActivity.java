package com.laboratorio_4;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import LogicaNegocio.Ciclo;
import LogicaNegocio.Usuario;

public class ExpedienteActivity extends AppCompatActivity {

    public Controlador controlador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expediente);
        controlador = (Controlador) getIntent().getSerializableExtra("controlador");
        cargarTablas();

        System.out.println(controlador.currentUser.getId());
    }


    public void cargarTablas(){
        TextView carrera=(TextView) findViewById(R.id.carrera);
        carrera.setText(controlador.currentCarrera.getNombre());
        TextView codCarrera=(TextView) findViewById(R.id.codigoCarrera);
        codCarrera.setText(controlador.currentCarrera.getCodigo());


        TextView ciclo1=(TextView) findViewById(R.id.ciclo1);
        ciclo1.setText(controlador.currentCiclos.get(0).getNumero()+" - "+controlador.currentCiclos.get(0).getAnio());
        TextView ciclo2=(TextView) findViewById(R.id.ciclo2);
        ciclo2.setText(controlador.currentCiclos.get(0).getNumero()+" - "+controlador.currentCiclos.get(0).getAnio());
        TextView ciclo3=(TextView) findViewById(R.id.ciclo3);
        ciclo3.setText(controlador.currentCiclos.get(1).getNumero()+" - "+controlador.currentCiclos.get(1).getAnio());
        TextView ciclo4=(TextView) findViewById(R.id.ciclo4);
        ciclo4.setText(controlador.currentCiclos.get(1).getNumero()+" - "+controlador.currentCiclos.get(1).getAnio());
        TextView ciclo5=(TextView) findViewById(R.id.ciclo5);
        ciclo5.setText(controlador.currentCiclos.get(2).getNumero()+" - "+controlador.currentCiclos.get(2).getAnio());
        TextView ciclo6=(TextView) findViewById(R.id.ciclo6);
        ciclo6.setText(controlador.currentCiclos.get(2).getNumero()+" - "+controlador.currentCiclos.get(2).getAnio());

        TextView grupo1=(TextView) findViewById(R.id.grupo1);
        grupo1.setText("3");
        TextView grupo2=(TextView) findViewById(R.id.grupo2);
        grupo2.setText("7");
        TextView grupo3=(TextView) findViewById(R.id.grupo3);
        grupo3.setText("1");
        TextView grupo4=(TextView) findViewById(R.id.grupo4);
        grupo4.setText("3");
        TextView grupo5=(TextView) findViewById(R.id.grupo5);
        grupo5.setText("2");
        TextView grupo6=(TextView) findViewById(R.id.grupo6);
        grupo6.setText("1");



        TextView materia1=(TextView) findViewById(R.id.materia1);
        materia1.setText(controlador.currentCursos.get(0).getNombre());
        TextView materia2=(TextView) findViewById(R.id.materia2);
        materia2.setText(controlador.currentCursos.get(1).getNombre());
        TextView materia3=(TextView) findViewById(R.id.materia3);
        materia3.setText(controlador.currentCursos.get(2).getNombre());
        TextView materia4=(TextView) findViewById(R.id.materia4);
        materia4.setText(controlador.currentCursos.get(3).getNombre());
        TextView materia5=(TextView) findViewById(R.id.materia5);
        materia5.setText(controlador.currentCursos.get(4).getNombre());
        TextView materia6=(TextView) findViewById(R.id.materia6);
        materia6.setText(controlador.currentCursos.get(5).getNombre());


        TextView calificacion1=(TextView) findViewById(R.id.calificacion1);
        calificacion1.setText(""+controlador.currentCursos.get(0).getNota());
        TextView calificacion2=(TextView) findViewById(R.id.calificacion2);
        calificacion2.setText(""+controlador.currentCursos.get(1).getNota());
        TextView calificacion3=(TextView) findViewById(R.id.calificacion3);
        calificacion3.setText(""+controlador.currentCursos.get(2).getNota());
        TextView calificacion4=(TextView) findViewById(R.id.calificacion4);
        calificacion4.setText(""+controlador.currentCursos.get(3).getNota());
        TextView calificacion5=(TextView) findViewById(R.id.calificacion5);
        calificacion5.setText(""+controlador.currentCursos.get(4).getNota());
        TextView calificacion6=(TextView) findViewById(R.id.calificacion6);
        calificacion6.setText(""+controlador.currentCursos.get(5).getNota());


        TextView estado=(TextView) findViewById(R.id.condicion1);
        estado.setText(controlador.currentEstadoEst);
        TextView ponderado=(TextView) findViewById(R.id.ponderado1);
        ponderado.setText("86.04");

        TextView notaAdmisi=(TextView) findViewById(R.id.NotaAmision);
        notaAdmisi.setText(""+controlador.currentEstudiante.getNotaAdmi());

        TextView numeroEx=(TextView) findViewById(R.id.NumExpediente);
        numeroEx.setText("156523");
        TextView condi=(TextView) findViewById(R.id.condicion1);
        condi.setText("Regular");



    }



}
