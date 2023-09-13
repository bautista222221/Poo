package TP1.ListaPilaCola;

public class Lista<T> {
    private class Nodo{
        T valor;
        Nodo siguiente;
        Nodo(T valor){
            this.valor=valor;
            this.siguiente=null;
        }
    }
    private Nodo cabeza;
    private int tamano;
    public Lista(){
        cabeza=null;
        tamano=0;
    }
    public void agregar(T elemento){
        Nodo nuevoNodo=new Nodo(elemento);
        if(cabeza==null){
            cabeza=nuevoNodo;
        }
        else{
            Nodo actual=cabeza;
            while(actual.siguiente!=null){
                actual=actual.siguiente;
            }
            actual.siguiente=nuevoNodo;
        }
        tamano++;
    }
    public int tamano(){
        return tamano;
    }
    public T recuperar(int indice){
        if(indice<0||indice>=tamano){
            throw new IndexOutOfBoundsException("El indice esta fuera de rango!");
        }
        int contador = 0;
        Nodo actual = cabeza;
        while (contador < indice) {
            actual = actual.siguiente;
            contador++;
        }
        return actual.valor;
    }
    public void eliminar(int indice){
        if(indice<0||indice>=tamano) {
            throw new IndexOutOfBoundsException("El indice esta fuera de rango!");
        }
        if (indice == 0) {
            cabeza = cabeza.siguiente;
        }
        int contador=0;
        Nodo actual=cabeza;
        while(contador<indice-1){
            actual=actual.siguiente;
            contador++;
        }
        actual.siguiente=actual.siguiente.siguiente;
        tamano--;
    }
    public boolean vacia(){
        return cabeza==null;
    }

    public void insertar(int indice,T elemento) {
        if (indice < 0 || indice > tamano) {
            throw new IndexOutOfBoundsException("El indice esta fuera de rango!");
        }
        if (indice == 0) {
            Nodo nuevo = new Nodo(elemento);
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            int contador = 0;
            while (contador < indice-1) {
                contador++;
                actual = actual.siguiente;
            }
            Nodo aux = actual.siguiente;
            actual.siguiente = new Nodo(elemento);
            actual = actual.siguiente;
            actual.siguiente = aux;
        }
        tamano++;
    }
}