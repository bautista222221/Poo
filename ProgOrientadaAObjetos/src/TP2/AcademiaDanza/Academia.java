package TP2.AcademiaDanza;

import TP1.ListaPilaCola.Lista;

import java.util.Objects;

public class Academia {
    private Lista <Alumno> alumnos;
    private String nombre;
    private Lista<Comision> comisiones;
    public Academia(String nombre){
        this.nombre = nombre;
        this.alumnos = new Lista<>();
        this.comisiones=new Lista<>();
    }

    public void agregarAlumno (String nombre, int dni, int telefono, String mail){
        alumnos.agregar(new Alumno(nombre, dni, mail, telefono));
    }

    public void eliminarAlumno (String nombre, int dni){
        for (int i=0; i < alumnos.tamano(); i++){
            if (Objects.equals(alumnos.recuperar(i).getNombre(), nombre) && alumnos.recuperar(i).getDni() == dni){
                alumnos.eliminar(i);
            }
        }
    }
    public Comision agregarComision(String ){

    }
    public void pagarProfesor(Comision comision){
        comision.pagarProfesor();
    }
    public Lista <Alumno> getAlumnos (){
        return alumnos;
    }


}