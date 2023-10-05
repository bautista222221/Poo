package TP2.RentaAutomoviles;

public class AutoPasajeros extends NoVIP {
    private int cantAsientos;
    private double precioAsiento;
    public AutoPasajeros(String patente, int cantAsientos, double precioAsiento) {
        super(patente);
        this.cantAsientos = cantAsientos;
        this.precioAsiento = precioAsiento;
    }
}
