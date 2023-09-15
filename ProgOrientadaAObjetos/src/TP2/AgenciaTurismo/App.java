package TP2.AgenciaTurismo;
import TP2.AgenciaTurismo.Proveedores.*;
import TP1.ListaPilaCola.Lista;

import java.io.CharArrayReader;
import java.util.Arrays;

public class App {
    Lista<PaqueteTurismo> paqueteTurismoLista=new Lista<>();
    public App(){

    }
    public void venderPaquete(PaqueteTurismo paqueteTurismo){
        paqueteTurismoLista.agregar(paqueteTurismo);
    }
    private Lista<String> ordenarListaPorDestino(Lista<String> lista){
       Lista<String> nueva=new Lista<>();
       for(int i=0;i< lista.tamano();i++){
           char[] str=(lista.recuperar(i).toCharArray());
       }
    }
    public Lista<String> getListadoVentas(){
        Lista<String>lista=new Lista<>();
        for(int i=0;i< paqueteTurismoLista.tamano();i++){
            lista.agregar((char) i+"\n"+paqueteTurismoLista.recuperar(i).getPaquete() + paqueteTurismoLista.recuperar(i).getPrecioTotal());
        }
        return ordenarListaPorDestino(lista);
    }
}
