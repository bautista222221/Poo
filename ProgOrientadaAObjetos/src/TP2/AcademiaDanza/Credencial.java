package TP2.AcademiaDanza;

public class Credencial {
    private String nombre;
    private int dni;
    private Alumno alumno;
    public Credencial(String nombre,int dni,Alumno alumno){
        this.nombre=nombre;
        this.dni=dni;
        this.alumno=alumno;
    }
}
