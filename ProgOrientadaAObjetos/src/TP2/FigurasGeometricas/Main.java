package TP2.FigurasGeometricas;
public class Main {

    public static void main (String[] args){
        System.out.println("Test figuras");
        Cubo cubo = new Cubo(2);
        System.out.println(cubo.getArea());
        System.out.println(cubo.getVolumen());
        Circulo circulo = new Circulo(3);
        System.out.println(circulo.getArea());
        Cuadrado cuadro = new Cuadrado(4);
        System.out.println(cuadro.getArea());
        Rectangulo rectangulo = new Rectangulo(2,3);
        System.out.println(rectangulo.getArea());
        Triangulo triangulo = new Triangulo(2,4);
        System.out.println(triangulo.getArea());
        Esfera esfera = new Esfera(3);
        System.out.println(esfera.getArea());
        System.out.println(esfera.getVolumen());
        Paralelepipedo paralelepipedo = new Paralelepipedo(2,3,4);
        System.out.println(paralelepipedo.getArea());
        System.out.println(paralelepipedo.getVolumen());
        Tetraedro tetraedro = new Tetraedro(3);
        System.out.println(tetraedro.getArea());
        System.out.println(tetraedro.getVolumen());
    }
}
