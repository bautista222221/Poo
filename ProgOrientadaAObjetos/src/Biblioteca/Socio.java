package Biblioteca;
public class Socio {
    private String nombre;
    private int dni;
    public Socio(String nombre,int dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    public String getNombre(){
        return nombre;
    }
    public int getDni(){
        return dni;
    }
}
