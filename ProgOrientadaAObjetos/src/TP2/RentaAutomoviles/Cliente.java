package TP2.RentaAutomoviles;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Alquiler> alquileres;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.alquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public double calcularMontoTotalAlquileres() {
        double montoTotal = 0;
        for (Alquiler alquiler : alquileres) {
            montoTotal += alquiler.getCosto();
        }
        return montoTotal;
    }
}

