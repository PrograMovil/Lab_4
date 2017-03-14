package com.laboratorio_4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import LogicaNegocio.Carrera;
import LogicaNegocio.Ciclo;
import LogicaNegocio.Curso;
import LogicaNegocio.Estudiante;
import LogicaNegocio.Nota;
import LogicaNegocio.Usuario;

/**
 * Created by SheshoVega on 13/03/2017.
 */

public class Controlador implements Serializable{
    Usuario currentUser;
    Carrera currentCarrera;
    ArrayList<Ciclo> currentCiclos;
    Estudiante currentEstudiante;
    int currentNumExpe;
    ArrayList<Curso> currentCursos;
    String currentEstadoEst;

    public Controlador() {
        initEstudiante();
        this.currentNumExpe = 1234;
        this.currentEstadoEst = "Activo";
        currentCursos=new ArrayList<>();
        currentCiclos=new ArrayList<>();
        initCiclos();
        initCursos();
    }

    public void acceder(String username, String password){
        currentUser = new Usuario(username,password);
    }

    private void initEstudiante(){
        currentCarrera = new Carrera("IF0123","Informatica y Computacion","INGENIERIA EN SISTEMAS DE INFORMACIÓN ");
        currentEstudiante = new Estudiante("Juanito Perez","12345678","87654321","juanito@gmail.com","Heredia, Lagunilla.","12-02-1999",currentCarrera, 730);
    }

    private void initCiclos(){
        Ciclo c1 = new Ciclo(2014, 1);
        Ciclo c2 = new Ciclo(2014, 2);
        Ciclo c3 = new Ciclo(2015, 1);
//        Ciclo c4 = new Ciclo(2015, 2);
//        Ciclo c5 = new Ciclo(2016, 1);
//        Ciclo c6 = new Ciclo(2016, 2);

        currentCiclos.add(c1);
        currentCiclos.add(c2);
        currentCiclos.add(c3);
//        currentCiclos.add(c4);
//        currentCiclos.add(c5);
//        currentCiclos.add(c6);
    }

    private void initCursos(){
        Curso c1 = new Curso("EIF200","Fundamentos de Informática",3,3,this.currentCiclos.get(0),this.currentCarrera,"Primer");
        c1.setNota(90);
        Curso c2 = new Curso("MAT030","Matemática para Informática",4,4,this.currentCiclos.get(0),this.currentCarrera,"Primer");
        c2.setNota(80);
        Curso c3 = new Curso("EIF201","Programación I",4,4,this.currentCiclos.get(1),this.currentCarrera,"Segundo");
        c3.setNota(85);
        Curso c4 = new Curso("MAT002","Cálculo I",4,4,this.currentCiclos.get(1),this.currentCarrera,"Segundo");
        c4.setNota(75);
        Curso c5 = new Curso("EIF204","Programación II",4,4,this.currentCiclos.get(2),this.currentCarrera,"Tercer");
        c5.setNota(90);
        Curso c6 = new Curso("MAT005","Álgebra Lineal",4,4,this.currentCiclos.get(2),this.currentCarrera,"Tercer");
        c6.setNota(80);

        currentCursos.add(c1);
        currentCursos.add(c2);
        currentCursos.add(c3);
        currentCursos.add(c4);
        currentCursos.add(c5);
        currentCursos.add(c6);

    }
    public float ponderado(ArrayList<Curso> cursos){
        float sumCredC1 = 0;
        float sumCredC2 = 0;
        float sumCredC3 = 0;
        sumCredC1 = ((cursos.get(0).getNota() * cursos.get(0).getCreditos()) + (cursos.get(1).getNota() * cursos.get(1).getCreditos()))/(cursos.get(0).getCreditos()+cursos.get(1).getCreditos());
        sumCredC2 = ((cursos.get(2).getNota() * cursos.get(2).getCreditos()) + (cursos.get(3).getNota() * cursos.get(3).getCreditos()))/(cursos.get(2).getCreditos()+cursos.get(3).getCreditos());
        sumCredC3 = ((cursos.get(4).getNota() * cursos.get(4).getCreditos()) + (cursos.get(5).getNota() * cursos.get(5).getCreditos()))/(cursos.get(4).getCreditos()+cursos.get(5).getCreditos());

        return sumCredC1 + sumCredC2 + sumCredC3 / 3;
    }
}
