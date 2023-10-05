package TP2.AcademiaDanza;

import TP1.ListaPilaCola.Lista;

import java.util.Objects;

public class Comision {

    private String nombreComision;
    private String dias;
    private String nivel;
    private Danza danza;
    private Profesor profesor;
    private Lista <Alumno> alumnos;
    public Comision (String nombreComision, String dias, String nivel, Danza danza, Profesor profesor){
        this.nombreComision = nombreComision;
        this.dias = dias;
        this.nivel = nivel;
        this.danza = danza;
        this.profesor = profesor;
    }

    public String getComision(){
        return nombreComision;
    }
    public Profesor getProfesor() {
        return profesor;
    }

    public Danza getDanza() {
        return danza;
    }
    public void agregarAlumno (String nombre, int dni, String mail,int telefono){
        alumnos.agregar(new Alumno(nombre, dni, mail, telefono));
    }

    public void eliminarAlumno (String nombre, int dni){
        for (int i=0; i < alumnos.tamano(); i++){
            if (Objects.equals(alumnos.recuperar(i).getNombre(), nombre) && alumnos.recuperar(i).getDni() == dni){
                alumnos.eliminar(i);
            }
        }
    }
    public void pagarProfesor(){
        for(int i=0;i< alumnos.tamano();i++){
            profesor.pagar(10.0);
        }
    }
    public Lista<Alumno> getAlumnos (){
        return alumnos;
    }



}
