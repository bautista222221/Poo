package TP2.EstacionDeServicio;

import java.util.ArrayList;
import java.util.List;

public class Expendedor {
    private String nombre;
    private List<Venta> ventas;
    private boolean esEmpleadoTop10MesAnterior; // Nuevo campo

    public Expendedor(String nombre) {
        this.nombre = nombre;
        this.ventas = new ArrayList<>();
        this.esEmpleadoTop10MesAnterior = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }

    public double calcularMontoTotalVentas() {
        double montoTotal = 0;
        for (Venta venta : ventas) {
            montoTotal += venta.getTotalVenta();
        }
        return montoTotal;
    }

    public int calcularCantidadLitrosExpendidos() {
        int litrosExpendidos = 0;
        for (Venta venta : ventas) {
            // Supongamos que cada venta es de 50 litros
            litrosExpendidos += 50;
        }
        return litrosExpendidos;
    }

    public boolean esEmpleadoTop10MesAnterior() {
        return esEmpleadoTop10MesAnterior;
    }

    public void marcarComoEmpleadoTop10MesAnterior() {
        esEmpleadoTop10MesAnterior = true;
    }

    public void aplicarDescuentoCliente(Cliente cliente, double porcentajeDescuento) {
        // Implementar lógica para aplicar descuento al cliente
        if (cliente != null && !cliente.esClienteTop10MesAnterior()) {
            double montoVenta = calcularMontoTotalVentas();
            double descuento = montoVenta * (porcentajeDescuento / 100);
            // Aplicar el descuento al cliente
            // ...
            cliente.marcarComoClienteTop10MesAnterior();
        }
    }
}