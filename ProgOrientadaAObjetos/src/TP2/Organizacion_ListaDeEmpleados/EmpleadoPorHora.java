package TP2.Organizacion_ListaDeEmpleados;

public class EmpleadoPorHora extends Empleado{
    private double sueldoPorHora;
    private double horasTrabajadas;
    public EmpleadoPorHora(String nombre,String apellido,int telefono,int cuit,double sueldoPorHora){
        super(nombre,apellido,telefono,cuit);
        this.sueldoPorHora=sueldoPorHora;
        this.horasTrabajadas=0;
    }
    public void agregarHorasDeTrabajo(double horas){
        this.horasTrabajadas+=horas;
    }
    @Override
    public double calcularSueldo(){
        return sueldoPorHora*horasTrabajadas;
    }
}
