package Biblioteca;
import TADS.Lista;
public class Prestamo {
    private Socio socio;
    private Ejemplar ejemplar;
    public Prestamo(Socio socio,Ejemplar ejemplar){
        this.socio=socio;
        this.ejemplar=ejemplar;
    }
    public Socio getSocio(){
        return socio;
    }
    public Ejemplar getEjemplar(){
        return ejemplar;
    }
}
