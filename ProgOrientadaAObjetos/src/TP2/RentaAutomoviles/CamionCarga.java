package TP2.RentaAutomoviles;

public class CamionCarga extends Vehiculos{
    private double precio;
    private double precioadicional;

    public CamionCarga(String patente, double precio, double precioadicional) {
        super(patente);
        this.precio = precio;
        this.precioadicional = precioadicional;
    }
}
