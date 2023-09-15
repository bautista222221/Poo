package TP2.ClubDeportivo;

public class Socio {
    private String nombre;
    private int dni;
    private int telefono;
    private String direccion;
    private String e_mail;
    private String tipoDeSuscripcion;
    private Credencial credencial;
    public Socio(String nombre,int dni,int telefono,String direccion,String e_mail,String tipoDeSuscripcion){
        this.direccion=direccion;
        this.nombre=nombre;
        this.dni=dni;
        this.e_mail=e_mail;
        this.telefono=telefono;
        this.tipoDeSuscripcion=tipoDeSuscripcion;
        this.credencial=new Credencial(this);
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getE_mail(){
        return e_mail;
    }
    public int getDni(){
        return dni;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getTipoDeSuscripcion(){
        return tipoDeSuscripcion;
    }
    public Credencial getCredencial(){
        return credencial;
    }
}
