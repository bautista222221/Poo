package TP2.Organizacion_ListaDeEmpleados;

public class EmpleadoPorComision extends Empleado{
    private double montoVentas;
    private double porcentaje;
    public EmpleadoPorComision(String nombre,String apellido,int telefono,int cuit){
        super(nombre,apellido,telefono,cuit);
        this.montoVentas=0;
        this.porcentaje=0.10;
    }
    public void vender(double monto){
        this.montoVentas+=monto;
    }

    @Override
    public double calcularSueldo() {
        return montoVentas*porcentaje;
    }
}
