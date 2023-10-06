package TP2.Organizacion_ListaDeEmpleados;

import java.time.LocalDate;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private int telefono;
    private int cuit;
    private LocalDate cumpleanos;
    public Empleado(String nombre,String apellido,int telefono,int cuit,LocalDate cumpleanos){
        this.apellido=apellido;
        this.cuit=cuit;
        this.nombre=nombre;
        this.telefono=telefono;
        this.cumpleanos=cumpleanos;
    }
    public abstract double calcularSueldo();
    public boolean esMesDeCumpleanos(){
        return cumpleanos.getMonthValue()==LocalDate.now().getMonthValue();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCuit() {
        return cuit;
    }

    public LocalDate getCumpleanos() {
        return cumpleanos;
    }
}
