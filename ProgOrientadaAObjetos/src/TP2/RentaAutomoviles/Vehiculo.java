package TP2.RentaAutomoviles;

public class Vehiculo {
    private String patente;
    private String tipo;
    private int asientos;
    private double precioBaseDiario;

    public Vehiculo(String patente, String tipo, int asientos) {
        this.patente = patente;
        this.tipo = tipo;
        this.asientos = asientos;
        this.precioBaseDiario = 3000;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAsientos() {
        return asientos;
    }

    public double calcularCostoAlquiler(int dias) {
        double costoTotal = precioBaseDiario * dias;
        if (tipo.equals("Auto de pasajero")) {
            costoTotal += 300 * asientos * dias;
        } else if (tipo.equals("Auto VIP")) {
            costoTotal += 500 * dias;
        } else if (tipo.equals("Combi")) {
            costoTotal += 4500 * dias;
        }
        return costoTotal;
    }
}

