

package TP2.EstacionDeServicio;

import TP1.ListaPilaCola.Lista;

public class Surtidor {
    private Lista <Combustible> combustible;
    private int codigo;
    public Surtidor(int codigo) {
        this.codigo = codigo;
    }

    public void agregarCombustible(String nombre, double precioventa) {
        combustible.agregar (new Combustible (nombre, precioventa));
    }

    public void eliminarCombustible(String nombre) {
        for (int i=0; i < combustible.tamano(); i++){
            if (combustible.recuperar(i).getCombustible().equals(nombre)){
                combustible.eliminar(i);
            }
        }
    }
}



// lista de combustibles
// agregar combustible o sacar
// calcular total de combustible


