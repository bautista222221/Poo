package TP2.Organizacion_ListaDeEmpleados;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private int telefono;
    private int cuit;
    public Empleado(String nombre,String apellido,int telefono,int cuit){
        this.apellido=apellido;
        this.cuit=cuit;
        this.nombre=nombre;
        this.telefono=telefono;
    }
    public abstract double calcularSueldo();

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
}
