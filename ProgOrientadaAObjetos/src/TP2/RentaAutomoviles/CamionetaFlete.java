package TP2.RentaAutomoviles;

public class CamionetaFlete extends Vehiculos{
    private double pat;
    private double tarifa;
    public CamionetaFlete(String patente, double pat, double tarifa) {
        super(patente);
        this.pat = pat;
        this.tarifa = tarifa;
    }
}
