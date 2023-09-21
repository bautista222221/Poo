package TP2.FigurasGeometricas;

public class Cuadrado extends Poligono {

    private final double base;

    public Cuadrado (double base){
        this.base = base;
    }
    @Override
    public double getArea (){
        return (base*base);
    }

}
