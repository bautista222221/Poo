package TP2.EstacionDeServicio;

public class Empleado {
    private String nombre;
    private String direccion;
    private String dni;
    private String apellido;
    private String telefono;
    public Empleado(String nombre,String dni,String direccion,String apellido,String telefono){
        this.apellido=apellido;
        this.dni=dni;
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }
}
