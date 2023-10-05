package TP2.EstacionDeServicio;

public class Cliente {
    private String nombre;
    private String patente;

    private double compratotal;

    public Cliente (String nombre, String patente, double compratotal){
        this.nombre = nombre;
        this.patente = patente;
        this.compratotal = compratotal;
    }
    public double getComprasFinal(){
        return compratotal;
    }



}
