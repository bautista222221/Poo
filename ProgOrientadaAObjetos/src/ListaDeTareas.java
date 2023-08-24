import java.time.LocalDate;
import java.util.EmptyStackException;

public class ListaDeTareas {
    Lista<Tarea> lista=new Lista<>();
    public void agregar(Tarea tarea){
        if(lista.vacia()){
            lista.agregar(tarea);
        }else{
            int contador=0;
            Tarea buscador=lista.recuperar(contador);
            while((buscador.prioridad()>tarea.prioridad())&&(contador<lista.tamano()-1)){
                contador++;
                buscador=lista.recuperar(contador);
            }
            lista.insertar(contador,tarea);
        }
    }
    public void modificar(String descripcion, int prioridad, LocalDate fechaLimite, int posicionTarea){
        if(posicionTarea<0||posicionTarea>lista.tamano()){
            throw new IndexOutOfBoundsException("El indice no se encuentra en la lista!");
        }
        Tarea nueva=lista.recuperar(posicionTarea);
        nueva.modificarDescripcion(descripcion);
        nueva.modificarFechaLimite(fechaLimite);
        int prioridadAnt=nueva.prioridad();
        nueva.modificarPrioridad(prioridad);
        lista.eliminar(posicionTarea);
        if(prioridadAnt== nueva.prioridad()){
            lista.insertar(posicionTarea,nueva);
        }else{
            agregar(nueva);
        }
    }
    public void mostrarLista(){
        if(lista.vacia()){
            throw new EmptyStackException();
        }
        int contador=0;
        Tarea actual;
        while(contador<lista.tamano()){
            actual=lista.recuperar(contador);
            contador++;
            System.out.printf("Tarea %d\n",contador);
            actual.mostrarTarea();
            System.out.print("\n\n");
        }
    }
}
