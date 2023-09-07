package Juego;
import ListaPilaCola.Lista;
public class Diccionario {
    private Lista<String> palabras;
    public Diccionario(){
        this.palabras=new Lista<>();
    }
    public void agregarPalabra(String palabra){
        palabras.agregar(palabra);
    }
    public boolean eliminarPalabra(String palabra){
        for(int i=0;i<palabras.tamano();i++){
            if(palabras.recuperar(i).equals(palabra)){
                palabras.eliminar(i);
                return true;
            }
        }
        return false;
    }
    public boolean existePalabra(String palabra){
        for(int i=0;i< palabras.tamano();i++){
            if(palabras.recuperar(i).equals(palabra)){
                return true;
            }
        }
        return false;
    }
}
