package Juego;

import ListaPilaCola.Lista;

public class Juego {
    private final Lista<Jugador> listaDeJugadores=new Lista<>();
    private final Diccionario diccionario;
    public Juego(Diccionario diccionario){
        this.diccionario=diccionario;
    }
    public void agregarJugador(String nombreJugador){
        listaDeJugadores.agregar(new Jugador(nombreJugador));
    }
    public void agregarPalabra(String palabra,String nombreJugador){
        for(int i=0;i<listaDeJugadores.tamano();i++){
            if(listaDeJugadores.recuperar(i).getNombre().equals(nombreJugador)){
                listaDeJugadores.recuperar(i).agregarPalabra(palabra,diccionario);
                break;
            }
        }
    }
    public String ganador(){
        int puntajeMaximo=-1;
        String ganador="Empate";
        for (int i=0;i< listaDeJugadores.tamano();i++){
            int puntaje=listaDeJugadores.recuperar(i).getPuntaje(diccionario);
            if(puntaje>puntajeMaximo){
                puntajeMaximo=puntaje;
                ganador=listaDeJugadores.recuperar(i).getNombre();
            }else if(puntaje==puntajeMaximo){
                ganador="Empate";
            }
        }
        return ganador;
    }
    public void mostrarPuntos(String nombreJugador){
        for(int i=0;i<listaDeJugadores.tamano();i++){
            if(listaDeJugadores.recuperar(i).getNombre().equals(nombreJugador)){
                System.out.println(listaDeJugadores.recuperar(i).getPuntaje(diccionario));
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
