package TP2.AcademiaDanza;
import TP1.ListaPilaCola.Lista;

public class Alumno {
    private String nombre;
    private int dni;
    private Credencial credencial;
    private String mail;
    private int telefono;
    private Lista<Danza> danzas;
    public Alumno(String nombre,int dni,String mail,int telefono){
        this.nombre=nombre;
        this.dni=dni;
        this.telefono=telefono;
        this.mail=mail;
        credencial=new Credencial(nombre,dni,this);
        danzas=new Lista<Danza>();
    }
    public void inscribirDanza(Danza danza){
        for(int i=0;i<danzas.tamano();i++){
            if(danzas.recuperar(i).getDanza()==danza.getDanza()){
                System.out.println("El alumno ya esta inscripto en esta danza!");
                return;
            }
        }
        danzas.agregar(danza);
    }
    public void eliminarDanza(Danza danza){
        for(int i=0;i< danzas.tamano();i++){
            if(danzas.recuperar(i).getDanza()==danza.getDanza()){
                danzas.eliminar(i);
            }
        }
    }
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public Credencial getCredencial() {
        return credencial;
    }
    public String getMail() {
        return mail;
    }
    public int getTelefono() {
        return telefono;
    }
    public Lista<Danza> getDanzas() {
        return danzas;
    }
}
