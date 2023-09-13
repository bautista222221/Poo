package TP1.ListaPilaCola;

public class ListaEnlazadaDoble<T>{
    private class Nodo{
        T valor;
        Nodo siguiente;
        Nodo anterior;
        Nodo(T valor){
            this.valor=valor;
            this.siguiente=null;
            this.anterior=null;
        }
    }
    private int tamano;
    private Nodo cabeza;
    private Nodo cola;
    public ListaEnlazadaDoble(){
        cabeza=null;
        cola=null;
        tamano=0;
    }
    public void agregar(T elemento){
        Nodo nuevoNodo=new Nodo(elemento);
        if(cola==null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        }else{
            nuevoNodo.anterior=cola;
            cola.siguiente=nuevoNodo;
            cola=nuevoNodo;
        }
        tamano++;
    }
    public void eliminar(int indice){
        if(indice<0||indice>=tamano){
            throw new IndexOutOfBoundsException("Indice fuera de rango!");
        }
        Nodo actual=cabeza;
        int contador=0;
        while(contador<indice){
            actual=actual.siguiente;
            contador++;
        }
        if(actual.anterior!=null){
            actual.anterior.siguiente=actual.siguiente;
        }else{
            cabeza=actual.siguiente;
        }
        if(actual.siguiente!=null){
            actual.siguiente.anterior=actual.anterior;
        }else {
            cola=actual.anterior;
        }
        tamano--;
    }
    public int tamano(){
        return tamano;
    }
    public T recuperar(int indice){
        if(indice<0||indice>=tamano){
            throw new IndexOutOfBoundsException("Indice fuera de rango!");
        }
        Nodo actual=cabeza;
        int contador=0;
        while(contador<indice){
            actual=actual.siguiente;
            contador++;
        }
        return actual.valor;
    }
    public boolean vacia(){
        return cabeza==null;
    }
    public void insertar(int indice,T elemento){
        if(indice<0||indice>=tamano){
            throw new IndexOutOfBoundsException("Indice fuera de rango!");
        }
        if(indice==0){
            Nodo aux=new Nodo(elemento);
            if(cabeza!=null){
                cabeza.anterior=aux;
            }
            cabeza=aux;
            if(cola==null){
                cola=aux;
            }
        }
        if(indice==tamano){
            agregar(elemento);
        }else {
            Nodo nodoAnterior = cabeza;
            int contador = 0;
            while (contador < indice-1) {
                nodoAnterior = nodoAnterior.siguiente;
                contador++;
            }
            Nodo nuevo=new Nodo(elemento);
            Nodo nodoSiguiente = nodoAnterior.siguiente;
            nuevo.anterior=nodoAnterior;
            nuevo.siguiente=nodoSiguiente;
            nodoAnterior.siguiente=nuevo;
            nodoSiguiente.anterior=nuevo;
        }
        tamano++;
    }
}
