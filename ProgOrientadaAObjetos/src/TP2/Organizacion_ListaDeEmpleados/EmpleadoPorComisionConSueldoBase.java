package TP2.Organizacion_ListaDeEmpleados;

import java.time.LocalDate;

public class EmpleadoPorComisionConSueldoBase extends Empleado{
    private double montoVentas;
    private double porcentaje;
    private double sueldoBase;
    public EmpleadoPorComisionConSueldoBase(String nombre, String apellido, int telefono, int cuit, double sueldoBase, LocalDate cumpleanos){
        super(nombre,apellido,telefono,cuit,cumpleanos);
        this.montoVentas=0;
        this.porcentaje=0.10;
        this.sueldoBase=sueldoBase;
    }
    public void vender(double monto){
        this.montoVentas+=monto;
    }
    @Override
    public double calcularSueldo() {
        if(esMesDeCumpleanos()){
            return 2000+sueldoBase+(montoVentas*porcentaje)+(montoVentas*0.5);
        }
        return sueldoBase+(montoVentas*porcentaje);
    }
}
