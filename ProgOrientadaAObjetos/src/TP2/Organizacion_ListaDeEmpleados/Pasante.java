package TP2.Organizacion_ListaDeEmpleados;

import java.time.LocalDate;

public class Pasante extends Empleado{
    public Pasante(String nombre, String apellido, int telefono, int cuit, LocalDate cumpleanos){
        super(nombre,apellido,telefono,cuit,cumpleanos);
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }
}
