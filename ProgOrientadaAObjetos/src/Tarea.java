import java.time.LocalDate;
public class Tarea{
    private String descripcion;
    private boolean estado;
    private int prioridad;
    private LocalDate fechaLimite;
    Tarea(String descripcion,int prioridad,LocalDate fechaLimite){
        this.descripcion=descripcion;
        this.estado=false;
        this.prioridad=prioridad;
        this.fechaLimite=fechaLimite;
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
    public void tachar(){
        this.estado=true;
    }
    public void mostrarTarea(){
        if(fechaLimite.isBefore(LocalDate.now())&&!estado) {
            descripcion="(Vencida)..."+descripcion;
        }
        if(estado&&!(fechaLimite.isBefore(LocalDate.now()))){
            for (char c:descripcion.toCharArray()) {
                System.out.print(c+"̶");
            }
            System.out.print("\n");
        }else{
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
}