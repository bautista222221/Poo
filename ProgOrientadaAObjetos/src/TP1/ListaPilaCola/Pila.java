package TP1.ListaPilaCola;

import java.util.EmptyStackException;

public class Pila<T> {
    private Nodo tope;
    private int tamano;
    private class Nodo {
        T valor;
        Nodo siguiente;
        Nodo(T valor){
            this.valor=valor;
        }
    }
    public Pila(){
        tope=null;
        tamano=0;
    }
    public boolean vacia(){
        return tope==null;
    }
    public int tamaño(){
        return tamano;
    }
    public void apilar(T elemento){
        Nodo nuevo=new Nodo(elemento);
        nuevo.siguiente=tope;
        tope=nuevo;
        tamano++;
    }
    public T desapilar(){
        if(tope==null){
            throw new EmptyStackException();
        }
        T elemento=tope.valor;
        tope=tope.siguiente;
        tamano--;
        return elemento;
    }
    public T tope(){
        if(tope==null){
            throw new EmptyStackException();
        }
        return tope.valor;
    }
}