package TP2.EstacionDeServicio;

public class Venta {
    private String patente;
    private Combustible tipoCombustible;
    private double totalVenta;
    private String nombreVendedor;

    public Venta(String patente, Combustible.TipoCombustible tipoCombustible, double totalVenta, String nombreVendedor) {
        this.patente = patente;
        this.tipoCombustible = tipoCombustible;
        this.totalVenta = totalVenta;
        this.nombreVendedor = nombreVendedor;
    }

    public Combustible getTipoCombustible() {
        return tipoCombustible;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }
}