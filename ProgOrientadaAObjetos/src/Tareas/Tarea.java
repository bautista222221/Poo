package Tareas;

import java.time.LocalDate;
public class Tarea{
    private String descripcion;
    private boolean estado;
    private int prioridad;
    private LocalDate fechaLimite;
    private LocalDate recordatorio;
    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        this.descripcion=descripcion;
        this.estado=false;
        this.prioridad=prioridad;
        this.fechaLimite=fechaLimite;
        this.recordatorio=fechaRecordatorio;
    }
    public void modificarDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void modificarPrioridad(int prioridad){
        this.prioridad=prioridad;
    }
    public void modificarFechaLimite(LocalDate fechaLimite){
        this.fechaLimite=fechaLimite;
    }
    public void modificarRecordatorio(LocalDate recordatorio){
        this.recordatorio=recordatorio;
    }
    public void tachar(){
        this.estado=true;
    }
    public void mostrarTarea(){
        if(fechaLimite.isBefore(LocalDate.now())&&!estado) {
            descripcion="(Vencida)..."+descripcion;
        }
        if(estado){
            for (char c:descripcion.toCharArray()) {
                System.out.print(c+"̶");
            }
            System.out.print("\n");
        }else{
            if(recordatorio.isBefore(LocalDate.now())){
                descripcion="(Por vencer)..."+descripcion;
                prioridad=1;
            }
            System.out.println(descripcion);
        }
        System.out.printf("Prioridad: %d\n",prioridad);
    }
    public int prioridad(){
        return prioridad;
    }
    public boolean estaVencida(){
        LocalDate fechaActual=LocalDate.now();
        return !estado&&fechaActual.isAfter(fechaLimite);
    }
    public boolean estaCompleta(){
        return estado;
    }
    public String getDescripcion(){
        return descripcion;
    }
}