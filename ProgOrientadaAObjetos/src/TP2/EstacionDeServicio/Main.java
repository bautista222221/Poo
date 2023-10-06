package TP2.EstacionDeServicio;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear la estación de servicio
        EstacionDeServicio estacion = new EstacionDeServicio();

        // Crear expendedores
        Expendedor expendedor1 = new Expendedor("Expendedor 1");
        Expendedor expendedor2 = new Expendedor("Expendedor 2");

        // Agregar expendedores a la estación de servicio
        estacion.agregarExpendedor(expendedor1);
        estacion.agregarExpendedor(expendedor2);

        // Realizar ventas y registrarlas en los expendedores
        Venta venta1 = new Venta("ABC123", Combustible.TipoCombustible.NAFTA, 50.0, expendedor1.getNombre());
        expendedor1.registrarVenta(venta1);

        Venta venta2 = new Venta("DEF456", Combustible.TipoCombustible.GASOIL, 75.0, expendedor2.getNombre());
        expendedor2.registrarVenta(venta2);

        // Generar informes mensuales
        List<Expendedor> surtidoresPorMontoTotalVentas = estacion.generarInformeSurtidoresPorMontoTotalVentas();
        List<Expendedor> surtidoresPorCantidadLitrosExpendidos = estacion.generarInformeSurtidoresPorCantidadLitrosExpendidos();
        List<Expendedor> empleadosPorMontoTotalVentas = estacion.generarInformeEmpleadosPorMontoTotalVentas();

        // Imprimir los informes
        System.out.println("Listado de surtidores ordenados por monto total de ventas:");
        for (Expendedor expendedor : surtidoresPorMontoTotalVentas) {
            System.out.println(expendedor.getNombre() + ": $" + expendedor.calcularMontoTotalVentas());
        }

        System.out.println("Listado de surtidores ordenados por cantidad de litros expendidos:");
        for (Expendedor expendedor : surtidoresPorCantidadLitrosExpendidos) {
            System.out.println(expendedor.getNombre() + ": " + expendedor.calcularCantidadLitrosExpendidos() + " litros");
        }

        System.out.println("Listado de empleados ordenado por monto total de ventas:");
        for (Expendedor expendedor : empleadosPorMontoTotalVentas) {
            System.out.println(expendedor.getNombre() + ": $" + expendedor.calcularMontoTotalVentas());
        }
    }
}
