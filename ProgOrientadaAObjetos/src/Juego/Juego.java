package Juego;

import TADS.Lista;

public class Juego {
    private Lista<Jugador> listaDeJugadores=new Lista<>();
    public void agregarJugador(String nombreJugador){
        listaDeJugadores.agregar(new Jugador(nombreJugador));
    }
    public void agregarPalabra(String palabra,String nombreJugador){
        for(int i=0;i<listaDeJugadores.tamano();i++){
            if(listaDeJugadores.recuperar(i).getNombre().equals(nombreJugador)){
                listaDeJugadores.recuperar(i).agregarPalabra(palabra);
                break;
            }
        }
    }
    public String ganador(){
        int puntajeMaximo=-1;
        String ganador="Empate";
        for (int i=0;i< listaDeJugadores.tamano();i++){
            int puntaje=listaDeJugadores.recuperar(i).getPuntaje();
            if(puntaje>puntajeMaximo){
                puntajeMaximo=puntaje;
                ganador=listaDeJugadores.recuperar(i).getNombre();
            }else if(puntaje==puntajeMaximo){
                ganador="Empate";
            }
        }
        System.out.println("El ganador es: "+ganador);
        return ganador;
    }
    public void mostrarPuntos(String nombreJugador){
        for(int i=0;i<listaDeJugadores.tamano();i++){
            if(listaDeJugadores.recuperar(i).getNombre().equals(nombreJugador)){
                System.out.println(listaDeJugadores.recuperar(i).getPuntaje());
            }
        }
    }
    public void palabrasJugador(String nombreJugador){
        for(int i=0;i<listaDeJugadores.tamano();i++){
            if(listaDeJugadores.recuperar(i).getNombre().equals(nombreJugador)){
                listaDeJugadores.recuperar(i).mostrarPalabras();
            }
        }
    }
}
