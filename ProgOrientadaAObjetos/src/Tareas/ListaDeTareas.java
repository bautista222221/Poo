package Tareas;
import java.time.LocalDate;
import java.util.EmptyStackException;
import ListaPilaCola.Lista;
public class ListaDeTareas {
    Lista<Tarea> lista=new Lista<>();
    public void agregarTarea(String descripcion,int prioridad, LocalDate fechaLimite,LocalDate recordatorio) {
        Tarea tarea = new Tarea(descripcion, prioridad, fechaLimite, recordatorio);
        agregarEnLista(tarea);
    }
    public void agregarColaborador (String descripcion, String colaborador){
        for(int i=0;i< lista.tamano();i++){
            if(lista.recuperar(i).getDescripcion().equals(descripcion)){
                lista.recuperar(i).agregarColab(colaborador);
            }
        }
    }
    private void agregarEnLista(Tarea tarea){
        if(lista.vacia()){
            lista.agregar(tarea);
        }else{
            int contador=0;
            Tarea buscador=lista.recuperar(contador);
            while(contador< lista.tamano()&&((buscador.prioridad()< tarea.prioridad())||(buscador.prioridad()== tarea.prioridad())&&buscador.getFechaLimite().isAfter(tarea.getFechaLimite()))){
                contador++;
                if(contador< lista.tamano()){
                    buscador=lista.recuperar(contador);
                }
            }
            lista.insertar(contador,tarea);
        }
    }
    public void modificar(String descripcionAModificar,String descripcion, int prioridad, LocalDate fechaLimite,LocalDate recordatorio){
        int prioridadAnt;
        LocalDate fechaAnt;
        for(int i=0;i< lista.tamano();i++){
            fechaAnt=lista.recuperar(i).getFechaLimite();
            prioridadAnt=lista.recuperar(i).prioridad();
            if(lista.recuperar(i).getDescripcion().equals(descripcionAModificar)){
                lista.recuperar(i).modificarDescripcion(descripcion);
                lista.recuperar(i).modificarFechaLimite(fechaLimite);
                lista.recuperar(i).modificarPrioridad(prioridad);
                lista.recuperar(i).modificarRecordatorio(recordatorio);
                if((prioridadAnt==prioridad)&&(fechaAnt==fechaLimite)){
                    return;
                }else{
                    Tarea tarea=lista.recuperar(i);
                    lista.eliminar(i);
                    agregarEnLista(tarea);
                }
            }
        }
    }
    public void tacharTarea(String descripcion, String colaborador){
        for(int i=0;i< lista.tamano();i++){
            if(lista.recuperar(i).getDescripcion().equals(descripcion)){
                lista.recuperar(i).tachar(colaborador);
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
    public void mostrarColaboradores (String descripcion){
        for(int i=0;i< lista.tamano();i++){
            if(lista.recuperar(i).getDescripcion().equals(descripcion)){
                lista.recuperar(i).mostrarColab();
            }
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
