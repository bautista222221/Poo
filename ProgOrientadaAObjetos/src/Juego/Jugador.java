package Juego;

import TADS.Lista;

public class Jugador {
    String nombre;
    Lista<String> listaDePalabras;
    public Jugador(String nombre){
        this.nombre=nombre;
        this.listaDePalabras=new Lista<>();
    }
    public void agregarPalabra(String palabra){
        listaDePalabras.agregar(palabra);
    }
    private int calcularPuntajePalabra(String palabra){
        int puntaje=0;
        String letras="KkZzXxYyWwQq";
        for (char c:palabra.toCharArray()) {
            puntaje++;
            if(letras.indexOf(c)!=-1){
                puntaje++;
            }
        }
        return puntaje;
    }
    private int calcularPuntajeTotal(){
        int puntaje=0;
        for(int i=0;i< listaDePalabras.tamano();i++){
            puntaje+=calcularPuntajePalabra(listaDePalabras.recuperar(i));
        }
        return puntaje;
    }

    public void mostrarPalabras(){
        System.out.println(nombre+":\n");
        for(int i=0;i<listaDePalabras.tamano();i++){
            System.out.println(listaDePalabras.recuperar(i));
        }
    }
    public int getPuntaje(){
        return calcularPuntajeTotal();
    }
    public String getNombre(){
        return nombre;
    }
}
