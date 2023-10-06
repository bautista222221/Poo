package TP2.Organizacion_ListaDeEmpleados;

import java.time.LocalDate;

public class EmpleadoPorHora extends Empleado{
    private double sueldoPorHora;
    private double horasTrabajadas;
    public EmpleadoPorHora(String nombre, String apellido, int telefono, int cuit, double sueldoPorHora, LocalDate cumpleanos){
        super(nombre,apellido,telefono,cuit,cumpleanos);
        this.sueldoPorHora=sueldoPorHora;
        this.horasTrabajadas=0;
    }
    public void agregarHorasDeTrabajo(double horas){
        this.horasTrabajadas+=horas;
    }
    @Override
    public double calcularSueldo(){
        double sueldo=0;
        if(horasTrabajadas>40){
            sueldo+= sueldoPorHora*horasTrabajadas*1.20;
        }else{
            sueldo+=sueldoPorHora*horasTrabajadas;
        }
        if(esMesDeCumpleanos()){
            sueldo+=2000;
        }
        return sueldo;
    }
}
