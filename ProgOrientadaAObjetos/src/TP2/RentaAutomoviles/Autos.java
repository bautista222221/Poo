package TP2.RentaAutomoviles;

public class Autos extends VIP{
    private double precio;
    public Autos(String patente, double precio) {
        super(patente);
        this.precio = precio;
    }
}
