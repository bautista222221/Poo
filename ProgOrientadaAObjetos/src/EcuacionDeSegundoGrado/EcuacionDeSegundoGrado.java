package EcuacionDeSegundoGrado;

public class EcuacionDeSegundoGrado {

    private final double a;
    private final double b;
    private final double c;

    private boolean unica;

    private double raiz1;

    private double raiz2;

    public EcuacionDeSegundoGrado(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void calcularRaices(){
        double contenido=(b*b)-(4*a*c);
        if(contenido<0){
            System.out.println("La ecuacion no tiene raices reales!");
            return;
        }
        if(contenido==0){
            this.unica=true;
            this.raiz1=-b/(2*a);
        }
        else{
            this.raiz1=(-b+Math.sqrt(contenido))/(2*a);
            this.raiz2=(-b-Math.sqrt(contenido))/(2*a);
        }
    }

    public double calcularValorDeY(double x){
        return a * x * x + b * x + c;
    }

    public void mostrarRaices(){
        double contenido=(b*b)-(4*a*c);
        if(contenido<0){
            System.out.println("La ecuacion no tiene raices reales!");
            return;
        }
        calcularRaices();
        if(unica){
            System.out.println("La ecuacion tiene una unica raiz: "+raiz1);
        }else{
            System.out.println("Las raices son: "+raiz1+" y: "+raiz2);
        }
    }

    public double getRaiz1(){
        return raiz1;
    }
    public double getRaiz2(){
        if(unica){
            System.out.println("Solo existe una raiz.");
            return -1;
        }
        else{
            return raiz2;
        }
    }
}
