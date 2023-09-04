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
        actualizar();
    }
    public void modificarDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void modificarPrioridad(int prioridad){
        this.prioridad=prioridad;
        actualizar();
    }
    public void modificarFechaLimite(LocalDate fechaLimite){
        this.fechaLimite=fechaLimite;
        actualizar();
    }
    public void modificarRecordatorio(LocalDate recordatorio){
        this.recordatorio=recordatorio;
        actualizar();
    }
    public void tachar(){
        this.estado=true;
        actualizar();
    }
    public void mostrarTarea(){
        System.out.println("Descricion: "+descripcion);
        System.out.printf("Prioridad: "+prioridad+"\n");
        System.out.println("Vencimiento: "+fechaLimite+"\n");
    }
    private void actualizar(){
        if((fechaLimite.isBefore(LocalDate.now())&&!estado)&&(!descripcion.contains("(Vencida)..."))){
            descripcion="(Vencida)..."+descripcion;
        }
        else if(estado){
            StringBuilder sb=new StringBuilder();
            for (char c:descripcion.toCharArray()) {
                sb.append(c);
                sb.append("̶");
            }
            descripcion=sb.toString();
            descripcion+="\n";
        }else{
            if(recordatorio.isBefore(LocalDate.now())&&(!descripcion.contains("(Por vencer)..."))){
                descripcion="(Por vencer)..."+descripcion;
                prioridad=1;
            }
        }
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
    public LocalDate getFechaLimite(){
        return fechaLimite;
    }
}