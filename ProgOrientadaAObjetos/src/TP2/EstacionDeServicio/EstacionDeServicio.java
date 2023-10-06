package TP2.EstacionDeServicio;

import java.util.ArrayList;
import java.util.List;

public class EstacionDeServicio {
    private List<Expendedor> expendedores;

    public EstacionDeServicio() {
        this.expendedores = new ArrayList<>();
    }

    public void agregarExpendedor(Expendedor expendedor) {
        expendedores.add(expendedor);
    }

    // Resto del código sin cambios

    public void aplicarDescuentoEmpleado(Expendedor empleado, Cliente cliente, double porcentajeDescuento) {
        // Implementar lógica para aplicar descuento al cliente
        if (empleado != null && empleado.esEmpleadoTop10MesAnterior()) {
            empleado.aplicarDescuentoCliente(cliente, porcentajeDescuento);
        }
    }
}
