import java.util.EmptyStackException;

public class Pila<T> {
    private Nodo tope;
    private int tamaño;
    private class Nodo {
        T valor;
        Nodo siguiente;
        Nodo(T valor){
            this.valor=valor;
        }
    }
    public Pila(){
        tope=null;
        tamaño=0;
    }
    public boolean vacia(){
        return tope==null;
    }
    public int tamaño(){
        return tamaño;
    }
    public void apilar(T elemento){
        Nodo nuevo=new Nodo(elemento);
        nuevo.siguiente=tope;
        tope=nuevo;
        tamaño++;
    }
    public T desapilar(){
        if(tope==null){
            throw new EmptyStackException();
        }
        T elemento=tope.valor;
        tope=tope.siguiente;
        tamaño--;
        return elemento;
    }
    public T tope(){
        if(tope==null){
            throw new EmptyStackException();
        }
        return tope.valor;
    }
}