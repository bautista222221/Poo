package TP2.RentaAutomoviles;

public class Alquiler {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int dias;
    private double costo;

    public Alquiler(Vehiculo vehiculo, Cliente cliente, int dias, double costo) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.dias = dias;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }
}

