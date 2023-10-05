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
    private String salon;
    private int asistencias;
    public Comision (String nombreComision, String dias, String nivel, Danza danza, Profesor profesor,String salon){
        this.nombreComision = nombreComision;
        this.dias = dias;
        this.nivel = nivel;
        this.danza = danza;
        this.profesor = profesor;
        this.salon=salon;
        this.asistencias=0;
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
        profesor.pagar(asistencias*10);
    }
    public Lista<Alumno> getAlumnos (){
        return alumnos;
    }

    public void registrarAsistencia(Alumno alumno){
        for(int i=0;i< alumnos.tamano();i++){
            if(alumnos.recuperar(i).getNombre().equals(alumno.getNombre())&&alumnos.recuperar(i).getDni()==alumno.getDni()){
                asistencias++;
            }
        }
    }

    public int getSaldo() {
        return asistencias*10;
    }
}
