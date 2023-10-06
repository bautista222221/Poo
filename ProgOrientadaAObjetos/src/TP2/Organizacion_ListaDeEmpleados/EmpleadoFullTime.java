package TP2.Organizacion_ListaDeEmpleados;

import java.time.LocalDate;
import java.time.Month;

public class EmpleadoFullTime extends Empleado{
    public double sueldo;
    public EmpleadoFullTime(String nombre, String apellido, int telefono, int cuit, double sueldo, LocalDate cumpleanos){
        super(nombre,apellido,telefono,cuit,cumpleanos);
        this.sueldo=sueldo;
    }

    @Override
    public double calcularSueldo() {
        if(esMesDeCumpleanos()){
            return 3000+sueldo;
        }
        return sueldo;
    }
}
