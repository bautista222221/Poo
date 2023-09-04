package Tareas;
import java.time.LocalDate;
import java.util.EmptyStackException;
import TADS.Lista;
public class ListaDeTareas {
    Lista<Tarea> lista=new Lista<>();
    public void agregarTarea(String descripcion,int prioridad, LocalDate fechaLimite,LocalDate recordatorio) {
        Tarea tarea = new Tarea(descripcion, prioridad, fechaLimite, recordatorio);
        agregarEnLista(tarea);
    }
    private void agregarEnLista(Tarea tarea){
        if(lista.vacia()){
            lista.agregar(tarea);
        }else{
            int contador=0;
            Tarea buscador=lista.recuperar(contador);
            while((buscador.prioridad()<=tarea.prioridad())&&(buscador.getFechaLimite().isAfter(tarea.getFechaLimite()))&&(contador<lista.tamano()-1)){
                contador++;
                buscador=lista.recuperar(contador);
            }
            lista.insertar(contador,tarea);
        }
    }
    public void modificar(String descripcion, int prioridad, LocalDate fechaLimite,LocalDate recordatorio, int posicionTarea){
        if(posicionTarea<0||posicionTarea>lista.tamano()){
            throw new IndexOutOfBoundsException("El indice no se encuentra en la lista!");
        }
        Tarea nueva=lista.recuperar(posicionTarea);
        nueva.modificarDescripcion(descripcion);
        nueva.modificarFechaLimite(fechaLimite);
        int prioridadAnt=nueva.prioridad();
        nueva.modificarPrioridad(prioridad);
        nueva.modificarRecordatorio(recordatorio);
        lista.eliminar(posicionTarea);
        if(prioridadAnt==nueva.prioridad()){
            lista.insertar(posicionTarea,nueva);
        }else{
            agregarEnLista(nueva);
        }
    }
    public void tacharTarea(String desripcion){
        for(int i=0;i< lista.tamano();i++){
            if(lista.recuperar(i).getDescripcion().equals(desripcion)){
                lista.recuperar(i).tachar();
            }
        }
    }
    public void mostrarLista(){
        if(lista.vacia()){
            throw new EmptyStackException();
        }
        ordenar();
        int contador=0;
        Tarea actual;
        while(contador<lista.tamano()){
            actual=lista.recuperar(contador);
            contador++;
            System.out.printf("Tarea "+contador+"\n");
            actual.mostrarTarea();
            System.out.print("\n\n");
        }
    }

    public Tarea recuperarTarea(String desripcion){
        for(int i=0;i< lista.tamano();i++){
            if(lista.recuperar(i).getDescripcion().equals(desripcion)){
                return lista.recuperar(i);
            }
        }
        return null;
    }
    public ListaDeTareas listaDeTareasNoVencidas(){
        ListaDeTareas listaNoVencidas=new ListaDeTareas();
        for(int i=0;i< lista.tamano();i++){
            if((!lista.recuperar(i).estaVencida())&&(!lista.recuperar(i).estaCompleta())){
                listaNoVencidas.agregarEnLista(lista.recuperar(i));
            }
        }
        return listaNoVencidas;
    }
    private Lista<Tarea> getLista(){
        return lista;
    }
    private void ordenar(){
        ListaDeTareas listaNueva=new ListaDeTareas();
        for(int i=0;i<lista.tamano();i++){
            listaNueva.agregarEnLista(lista.recuperar(i));
        }
        this.lista=listaNueva.getLista();
    }
}
