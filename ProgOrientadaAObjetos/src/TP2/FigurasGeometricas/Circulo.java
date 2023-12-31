package TP2.FigurasGeometricas;
public class Circulo extends DosDimensiones {

    private final double radio;

    public Circulo (double radio){
        this.radio = radio;
    }
    public double getArea(){
        double pi = Math.PI;
        return pi *(radio*radio);
    }
}
