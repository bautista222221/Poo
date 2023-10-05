package TP2.Organizacion_ListaDeEmpleados;

public class EmpleadoFullTime extends Empleado{
    public double sueldo;
    public EmpleadoFullTime(String nombre,String apellido, int telefono,int cuit,double sueldo){
        super(nombre,apellido,telefono,cuit);
        this.sueldo=sueldo;
    }

    @Override
    public double calcularSueldo() {
        return sueldo;
    }
}
