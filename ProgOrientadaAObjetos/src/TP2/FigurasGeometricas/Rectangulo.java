package TP2.FigurasGeometricas;

public class Rectangulo extends Poligono {

    private final double base;
    private final double altura;

    public Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double getArea (){
        return (base*altura);
    }
}
