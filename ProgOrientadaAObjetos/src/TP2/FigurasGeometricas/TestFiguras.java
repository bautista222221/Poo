package TP2.FigurasGeometricas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestFiguras {
    @Test
    public void testArea2D(){
        Cuadrado cuadrado=new Cuadrado(2);
        double areaCuadrado=4;
        Assertions.assertEquals(cuadrado.getArea(),areaCuadrado);
        Circulo circulo=new Circulo(2);
        double areaCirculo=Math.PI*4;
        Assertions.assertEquals(circulo.getArea(),areaCirculo);
        Triangulo triangulo=new Triangulo(3,4);
        double areaTriangulo=6;
        Assertions.assertEquals(triangulo.getArea(),areaTriangulo);
        Rectangulo rectangulo=new Rectangulo(5,6);
        double areaRectangulo=30;
        Assertions.assertEquals(rectangulo.getArea(),areaRectangulo);
    }
    @Test
    public void testArea3D(){
        Esfera esfera=new Esfera(2);
        Cubo cubo=new Cubo(3);
        Paralelepipedo paralelepipedo=new Paralelepipedo(2,3 ,4);
        Tetraedro tetraedro=new Tetraedro(3);
        double areaEsfera=4*Math.PI*4;
        double areaCubo=54;
        double areaParalelepipedo=2*(6+8+12);
        double areaTetraedro=(9)*(Math.sqrt(3));
        Assertions.assertEquals(esfera.getArea(),areaEsfera);
        Assertions.assertEquals(cubo.getArea(),areaCubo);
        Assertions.assertEquals(tetraedro.getArea(),areaTetraedro);
        Assertions.assertEquals(paralelepipedo.getArea(),areaParalelepipedo);
    }
    @Test
    public void testVolumen(){
        Esfera esfera=new Esfera(2);
        Cubo cubo=new Cubo(3);
        Paralelepipedo paralelepipedo=new Paralelepipedo(2,3 ,4);
        Tetraedro tetraedro=new Tetraedro(3);
        double volumenEsfera=((double) 4 /3)*Math.PI*8;
        double volumenCubo=27;
        double volumenParalelepipedo=24;
        double volumenTetraedro=(Math.sqrt(2)/12)*9;
        Assertions.assertEquals(esfera.getVolumen(),volumenEsfera);
        Assertions.assertEquals(cubo.getVolumen(),volumenCubo);
        Assertions.assertEquals(paralelepipedo.getVolumen(),volumenParalelepipedo);
        Assertions.assertEquals(tetraedro.getVolumen(),volumenTetraedro);
    }
    @Test
    public void testLista(){
        Esfera esfera=new Esfera(2);
        Cubo cubo=new Cubo(3);
        Paralelepipedo paralelepipedo=new Paralelepipedo(2,3 ,4);
        Tetraedro tetraedro=new Tetraedro(3);
        Cuadrado cuadrado=new Cuadrado(2);
        Circulo circulo=new Circulo(2);
        Triangulo triangulo=new Triangulo(3,4);
        Rectangulo rectangulo=new Rectangulo(5,6);

    }
}
