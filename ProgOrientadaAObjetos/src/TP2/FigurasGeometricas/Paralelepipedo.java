package TP2.FigurasGeometricas;


public class Paralelepipedo extends Poliedro {

    private double arista;
    private double arista1;
    private double arista2;

    public Paralelepipedo (double arista, double arista1, double arista2){
        this.arista = arista;
        this.arista1 = arista1;
        this.arista2 = arista2;
    }

    @Override
    public double getArea (){
        return (2 * (arista * arista1) + (arista * arista2) + (arista1 * arista2));
    }

    @Override
    double getVolumen() {
        return (arista * arista1 * arista2);
    }
}
