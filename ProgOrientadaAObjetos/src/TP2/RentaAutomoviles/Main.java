package TP2.RentaAutomoviles;

public class Main {
    public static void main(String[] args) {
        // Crear vehículos
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Auto de pasajero", 4);
        Vehiculo vehiculo2 = new Vehiculo("DEF456", "Combi", 1);
        Vehiculo vehiculo3 = new Vehiculo("GHI789", "Auto VIP", 2);

        // Crear cliente
        Cliente cliente = new Cliente("Juan Pérez");

        // Generar presupuestos y alquileres
        Presupuesto presupuesto1 = new Presupuesto(vehiculo1, 5);
        Alquiler alquiler1 = presupuesto1.generarAlquiler(cliente);

        Presupuesto presupuesto2 = new Presupuesto(vehiculo2, 3);
        Alquiler alquiler2 = presupuesto2.generarAlquiler(cliente);

        // Agregar alquileres al cliente
        cliente.agregarAlquiler(alquiler1);
        cliente.agregarAlquiler(alquiler2);

        // Calcular el monto total de alquileres del cliente
        double montoTotal = cliente.calcularMontoTotalAlquileres();
        System.out.println("Monto total de alquileres para " + cliente.getNombre() + ": $" + montoTotal);
    }
}
