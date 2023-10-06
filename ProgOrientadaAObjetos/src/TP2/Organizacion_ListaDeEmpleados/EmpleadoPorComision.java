package TP2.Organizacion_ListaDeEmpleados;

import java.time.LocalDate;

public class EmpleadoPorComision extends Empleado{
    private double montoVentas;
    private double porcentaje;
    public EmpleadoPorComision(String nombre, String apellido, int telefono, int cuit, LocalDate cumpleanos){
        super(nombre,apellido,telefono,cuit,cumpleanos);
        this.montoVentas=0;
        this.porcentaje=0.10;
    }
    public void vender(double monto){
        this.montoVentas+=monto;
    }

    @Override
    public double calcularSueldo() {
        if(esMesDeCumpleanos()){
            return 2000+(montoVentas*porcentaje)+(montoVentas*0.5);
        }
        return montoVentas*porcentaje;
    }
}
