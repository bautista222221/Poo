import java.time.LocalDate;
public class ListaDeTareas<T> {
    public class Tarea{
        String descripcion;
        boolean estado;
        int prioridad;
        LocalDate fechaLimite;
        Tarea(String descripcion,int prioridad,LocalDate fechaLimite){
            this.descripcion=descripcion;
            this.estado=false;
            this.prioridad=prioridad;
            this.fechaLimite=fechaLimite;
        }
        void modificarDescripcion(String descripcion){
            this.descripcion=descripcion;
        }
        void modificarPrioridad(int prioridad){
            this.prioridad=prioridad;
        }
        void modificarFechaLimite(LocalDate fechaLimite){
            this.fechaLimite=fechaLimite;
        }
        void tachar(){
            this.estado=true;
        }
        String mostrarTarea(){
            if(estado){
                return"(Vencida...) "+descripcion;
            }else{
                return descripcion;
            }
        }
        boolean estaVencida(){
            LocalDate fechaActual=LocalDate.now();
            return !estado&&fechaActual.isAfter(fechaLimite);
        }
        boolean estaCompleta(){
            return estado;
        }
    }
}
