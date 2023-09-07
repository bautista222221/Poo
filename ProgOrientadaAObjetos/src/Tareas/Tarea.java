package Tareas;
import ListaPilaCola.Lista;
import java.time.LocalDate;
public class Tarea{
    private String descripcion;
    private boolean estado;
    private int prioridad;
    private LocalDate fechaLimite;
    private LocalDate recordatorio;
    private Lista <String> colaboradores;
    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        this.descripcion=descripcion;
        this.estado=false;
        this.prioridad=prioridad;
        this.fechaLimite=fechaLimite;
        this.recordatorio=fechaRecordatorio;
        colaboradores = new Lista<>();
    }
    public void agregarColab (String colaborador){
        colaboradores.agregar(colaborador);
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
    public void tachar(String colaborador){
        if (estado){
            System.out.println("La tarea ya fue realizada!!!");
            return;
        }
        for (int i=0; i< colaboradores.tamano(); i++){
            if (colaboradores.recuperar(i).equals(colaborador)){
                this.estado=true;
                this.fechaLimite=LocalDate.now();
            }
        }
        System.out.println("El colaborador no es parte de esta tarea!!!");
    }
    public void mostrarTarea(){
        actualizar();
        if(!estado) {
            System.out.println("Descricion: " + descripcion);
            System.out.println("Prioridad: " + prioridad);
            System.out.println("Vencimiento: " + fechaLimite);
        }else{
            System.out.println("Descripcion: "+descripcion);
        }
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
            descripcion+= "\nRealizada el: " + fechaLimite;
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
    public void mostrarColab (){
        System.out.println("Colaboradores: ");
        for(int i=0;i< colaboradores.tamano();i++){
            System.out.println(colaboradores.recuperar(i)+ "\n");
        }
    }
}