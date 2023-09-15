package TP2.AgenciaTurismo;
import TP1.ListaPilaCola.Lista;
import TP2.AgenciaTurismo.Proveedores.*;

import java.util.Scanner;

public class PaqueteTurismo {
    private final Destino destino;
    private final MedioDeTransporte transporte;
    private final Hospedaje hospedaje;
    private final Lista<Excursion> excursionesLista;
    public PaqueteTurismo(Destino destino, MedioDeTransporte medioDeTransporte, Hospedaje hospedaje, int cantidadExcursiones){
        this.destino=destino;
        this.transporte=medioDeTransporte;
        this.hospedaje=hospedaje;
        this.excursionesLista=new Lista<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<cantidadExcursiones;i++){
            System.out.println("Excursion N°"+(i+1)+":");
            String nombre=sc.nextLine();
            System.out.println("Precio de la excursion N°"+(i+1)+":");
            Excursion ex=new Excursion(nombre,sc.nextDouble());
            excursionesLista.agregar(ex);
        }
    }
    public double getPrecioTotal(){
        double precio=destino.getPrecio();
        precio+= transporte.getPrecio();
        precio+= hospedaje.getPrecio();
        for(int i=0;i<excursionesLista.tamano();i++){
            precio+=excursionesLista.recuperar(i).getPrecio();
        }
        return precio;
    }
    public String getPaquete(){
        StringBuilder paquete= new StringBuilder(destino.getDestino() + "\n" + hospedaje.getHospedaje() + "\n" + transporte.getMedio() + "\n");
        for(int i=0;i<excursionesLista.tamano();i++){
            paquete.append(excursionesLista.recuperar(i).getExcursion()).append("\n");
        }
        return paquete.toString();
    }
}
