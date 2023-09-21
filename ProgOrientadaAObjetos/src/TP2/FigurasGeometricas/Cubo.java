package TP2.FigurasGeometricas;

public class Cubo extends Poliedro {

    private final double arista;

    public Cubo (double arista){
        this.arista = arista;
    }
    @Override
    public double getArea (){
        return (6*(arista*arista));
    }
    @Override
    public double getVolumen (){
        return (Math.pow(arista,3));
    }
}
