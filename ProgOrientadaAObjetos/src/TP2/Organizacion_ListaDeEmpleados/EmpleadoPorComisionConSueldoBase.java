package TP2.Organizacion_ListaDeEmpleados;

public class EmpleadoPorComisionConSueldoBase extends Empleado{
    private double montoVentas;
    private double porcentaje;
    private double sueldoBase;
    public EmpleadoPorComisionConSueldoBase(String nombre,String apellido,int telefono,int cuit,double sueldoBase){
        super(nombre,apellido,telefono,cuit);
        this.montoVentas=0;
        this.porcentaje=0.10;
        this.sueldoBase=sueldoBase;
    }
    public void vender(double monto){
        this.montoVentas+=monto;
    }
    @Override
    public double calcularSueldo() {
        return sueldoBase+(montoVentas*porcentaje);
    }
}
