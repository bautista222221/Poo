package TP2.Organizacion_ListaDeEmpleados;

public class Pasante extends Empleado{
    public Pasante(String nombre,String apellido,int telefono,int cuit){
        super(nombre,apellido,telefono,cuit);
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }
}
