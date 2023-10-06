package TP2.EstacionDeServicio;

public class Cliente {
    private String nombre;
    private String patente;
    private boolean esClienteTop10MesAnterior; // Nuevo campo

    public Cliente(String nombre, String patente) {
        this.nombre = nombre;
        this.patente = patente;
        this.esClienteTop10MesAnterior = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPatente() {
        return patente;
    }

    public boolean esClienteTop10MesAnterior() {
        return esClienteTop10MesAnterior;
    }

    public void marcarComoClienteTop10MesAnterior() {
        esClienteTop10MesAnterior = true;
    }
}

