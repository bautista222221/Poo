package Juego;

import ListaPilaCola.Lista;

public class Jugador {
    String nombre;
    Lista<String> listaDePalabras;
    public Jugador(String nombre){
        this.nombre=nombre;
        this.listaDePalabras=new Lista<>();
    }
    public void agregarPalabra(String palabra,Diccionario diccionario){
        if(diccionario.existePalabra(palabra)) {
            listaDePalabras.agregar(palabra);
        }
        else System.out.println("La palabra no existe en el diccionario.");
    }
    private int calcularPuntajePalabra(String palabra,Diccionario diccionario){
        if(diccionario.existePalabra(palabra)) {
            int puntaje = 0;
            String letras = "KkZzXxYyWwQq";
            for (char c : palabra.toCharArray()) {
                puntaje++;
                if (letras.indexOf(c) != -1) {
                    puntaje++;
                }
            }
            return puntaje;
        }else return 0;
    }
    private int calcularPuntajeTotal(Diccionario diccionario){
        int puntaje=0;
        for(int i=0;i< listaDePalabras.tamano();i++){
            puntaje+=calcularPuntajePalabra(listaDePalabras.recuperar(i),diccionario);
        }
        return puntaje;
    }

    public void mostrarPalabras(){
        System.out.println(nombre+":\n");
        for(int i=0;i<listaDePalabras.tamano();i++){
            System.out.println(listaDePalabras.recuperar(i));
        }
    }
    public int getPuntaje(Diccionario diccionario){
        return calcularPuntajeTotal(diccionario);
    }
    public String getNombre(){
        return nombre;
    }
}
