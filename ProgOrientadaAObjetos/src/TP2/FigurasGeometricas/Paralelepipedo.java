package TP2.FigurasGeometricas;


public class Paralelepipedo extends Poliedro {

    private final double arista1;
    private final double arista2;
    private final double arista3;

    public Paralelepipedo (double arista, double arista1, double arista2){
        this.arista1 = arista;
        this.arista2 = arista1;
        this.arista3 = arista2;
    }

    @Override
    public double getArea (){
        return (2 * (arista1 * arista2) + (arista1 * arista3) + (arista2 * arista3));
    }

    @Override
    double getVolumen() {
        return (arista1 * arista2 * arista3);
    }
}
