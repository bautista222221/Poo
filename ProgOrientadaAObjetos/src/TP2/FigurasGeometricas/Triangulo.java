
package TP2.FigurasGeometricas;


public class Triangulo extends Poligono {

    private double base;
    private double altura;

    public Triangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double getArea (){
        return (base*altura)/2;
    }
}
