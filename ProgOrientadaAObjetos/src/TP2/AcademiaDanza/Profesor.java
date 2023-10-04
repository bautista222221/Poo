package TP2.AcademiaDanza;

public class Profesor {

    private String nombre;
    private int dni;
    private double sueldo;
    public Profesor (String nombre, int dni, double sueldo){
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = 0;
    }
    public void pagar (double sueldo){
        this.sueldo += sueldo;
    }
}
