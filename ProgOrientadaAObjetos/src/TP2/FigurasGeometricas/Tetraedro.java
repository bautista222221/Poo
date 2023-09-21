package TP2.FigurasGeometricas;


public class Tetraedro extends Poliedro {

    private final double arista;

    public Tetraedro (double arista){
        this.arista = arista;
    }

    @Override
    public double getArea() {
        return ((arista*arista)*(Math.sqrt(3)));
    }

    @Override
    double getVolumen() {
        return ((Math.pow(arista,3))*(Math.sqrt(2)/12));
    }
}
