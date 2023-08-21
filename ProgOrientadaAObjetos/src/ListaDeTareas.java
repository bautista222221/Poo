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
    public void main(){
        Tarea tarea1=new Tarea("Consultar repuesto del auto.",3,LocalDate.of(2023,8,20));
        tarea1.tachar();
        Tarea tarea2=new Tarea("Ir al supermercado mañana.",1,LocalDate.of(2023,8,22));
        Tarea tarea3=new Tarea("Ir al cine a ver la nueva peli de Marvel.",1,LocalDate.of(2023,8,20));
        System.out.printf("Tarea 1: %s\n",tarea1.mostrarTarea());
        System.out.printf("Tarea 2: %s\n",tarea2.mostrarTarea());
        System.out.printf("Tarea 3: %s\n",tarea3.mostrarTarea());
    }
}
