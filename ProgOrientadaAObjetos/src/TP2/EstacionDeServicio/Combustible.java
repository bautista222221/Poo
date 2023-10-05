package TP2.EstacionDeServicio;

public class Combustible {
    private String nombre;
    double precioventa;

    public Combustible(String nombre, double precioventa) {
        this.nombre = nombre;
        this.precioventa = precioventa;
    }

    public String getCombustible (){
        return nombre;
    }
}
