package TP2.AgenciaTurismo;

public class Destino {
    private String destino;
    private double precio;
    public Destino(String destino,double precio){
        this.destino=destino;
        this.precio=precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDestino() {
        return destino;
    }
}
