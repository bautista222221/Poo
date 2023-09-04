package TADS;

public class Cola <T>{
    private class Nodo{
        T valor;
        Nodo siguiente;
        Nodo(T valor){
            this.valor=valor;
            siguiente=null;
        }
    }
    private Nodo frente;
    private int tamano;
    private Nodo fondo;
    public Cola(){
        frente=null;
        fondo=null;
        tamano=0;
    }
    public void encolar(T elemento){
        Nodo nuevo=new Nodo(elemento);
        if(frente==null){
            frente=nuevo;
        }else{
            fondo.siguiente=nuevo;
        }
        fondo=nuevo;
        tamano++;
    }
    public boolean vacia(){
        return frente==null;
    }
    public int tamano(){
        return tamano;
    }
    public T desencolar(){
        if(frente==null){
            throw new IllegalStateException("La cola esta vacia");
        }
        T dato=frente.valor;
        frente=frente.siguiente;
        tamano--;
        if(vacia()){
            fondo=null;
        }
        return dato;
    }
}