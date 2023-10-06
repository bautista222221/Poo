package TP2.RentaAutomoviles;

public class Presupuesto {
    private Vehiculo vehiculo;
    private int dias;

    public Presupuesto(Vehiculo vehiculo, int dias) {
        this.vehiculo = vehiculo;
        this.dias = dias;
    }

    public double calcularCosto() {
        return vehiculo.calcularCostoAlquiler(dias);
    }

    public Alquiler generarAlquiler(Cliente cliente) {
        return new Alquiler(vehiculo, cliente, dias, calcularCosto());
    }
}

