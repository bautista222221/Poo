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
    private int tamaño;
    public Lista(){
        cabeza=null;
        tamaño=0;
    }
    public void agregar(T elemento){
        Nodo nuevoNodo=new Nodo(elemento);
        if(cabeza==null){
            cabeza=nuevoNodo;
        }
        else{
            Nodo actual=cabeza;
            while(cabeza.siguiente!=null){
                actual=actual.siguiente;
            }
            actual.siguiente=nuevoNodo;
        }
        tamaño++;
    }
    public int tamaño(){
        return tamaño;
    }
    public T recuperar(int indice){
        if(indice<0||indice>=tamaño){
            throw new IndexOutOfBoundsException("El indice esta fuera de rango!");
        }
        int contador=0;
        Nodo actual=cabeza;
        while(contador<indice){
            actual=actual.siguiente;
            contador++;
        }
        return actual.valor;
    }
    public void eliminar(int indice){
        if(indice<0||indice>=tamaño) {
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
        tamaño--;
    }
    public boolean vacia(){
        return cabeza==null;
    }

    public void insertar(int indice,T elemento){
        if(indice<0||indice>=tamaño) {
            throw new IndexOutOfBoundsException("El indice esta fuera de rango!");
        }
        if(indice==tamaño-1){
            agregar(elemento);
        }else{
            Nodo actual=cabeza;
            int contador=0;
            while(contador<indice){
                actual=actual.siguiente;
                contador++;
            }
            Nodo aux=actual.siguiente;
            actual.siguiente=new Nodo(elemento);
            actual=actual.siguiente;
            actual.siguiente=aux;
        }
        tamaño++;
    }
}