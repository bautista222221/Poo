package TP2.FigurasGeometricas;
public class Main {

    public static void main (String[] args){
        System.out.println("Test figuras");
        System.out.println("-------------------------------------------------------");
        System.out.println("Figuras en Dos dimensiones\n");
        Circulo circulo = new Circulo(3);
        System.out.println("El area del circulo es: " + circulo.getArea());
        Cuadrado cuadro = new Cuadrado(4);
        System.out.println("El area del cuadrado es: " + cuadro.getArea());
        Rectangulo rectangulo = new Rectangulo(2,3);
        System.out.println("El area del rectangulo es: " + rectangulo.getArea());
        Triangulo triangulo = new Triangulo(2,4);
        System.out.println("El area del triangulo es: " + triangulo.getArea() + "\n");
        System.out.println("Figuras en Tres dimensiones\n");
        Esfera esfera = new Esfera(3);
        System.out.println("El area de la esfera es: " + esfera.getArea());
        System.out.println("El volumen de la esfera es: " + esfera.getVolumen());
        Cubo cubo = new Cubo(2);
        System.out.println("El area del cubo es: " + cubo.getArea());
        System.out.println("El volumen del cubo es: " + cubo.getVolumen());
        Paralelepipedo paralelepipedo = new Paralelepipedo(2,3,4);
        System.out.println("El area del paralelepidedo es: " + paralelepipedo.getArea());
        System.out.println("El volumen del paralelepipedo es: " + paralelepipedo.getVolumen());
        Tetraedro tetraedro = new Tetraedro(3);
        System.out.println("El area del tetraedro es: " + tetraedro.getArea());
        System.out.println("El volumen del tetraedro es: " + tetraedro.getVolumen());
    }
}
