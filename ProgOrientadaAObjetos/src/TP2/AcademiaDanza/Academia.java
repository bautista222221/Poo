package TP2.AcademiaDanza;

import TP1.ListaPilaCola.Lista;

public class Academia {
    private Lista <Alumnos> alumnos;
    private String nombre;
    public Academia(String nombre){
        this.nombre = nombre;
        this.alumnos = new Lista<Alumnos>();
    }

    public void agregarAlumno (String nombre, int dni, int telefono, String mail){
        alumnos.agregar(new Alumnos(nombre, dni, telefono, mail));
    }

    public void eliminarAlumno (String nombre, int dni){
        for (int i=0; i < alumnos.tamano(); i++){
            if (alumnos.recuperar(i).getNombre() == nombre && alumnos.recuperar(i).getDni == dni){
                alumnos.eliminar(i);
            }
        }
    }

    public Lista <Alumnos> getAlumnos (){
        return alumnos;
    }


}