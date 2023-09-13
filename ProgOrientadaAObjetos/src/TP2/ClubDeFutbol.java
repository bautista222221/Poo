package TP2;
import TP1.ListaPilaCola.Lista;

import java.time.LocalDate;

public class ClubDeFutbol {
    private Lista<Socio> socios;

    public ClubDeFutbol(){
        this.socios=new Lista<>();
    }
    public Lista<Socio> getSocios(){
        return socios;
    }
    public void cobrarSuscripciones(){
        if(LocalDate.now())
    }
    private boolean verificarSuscripcion(String suscripcion)throws Exception{
        if(suscripcion.equals("basica")||suscripcion.equals("intermedia")||suscripcion.equals("destacada")){
            return true;
        }
        throw new Exception("Suscripcion no valida!");
    }
    public void agregarSocio(String nombre, String direccion, String e_mail, int dni, int telefono,String suscripcion) throws Exception {
        if(verificarSuscripcion(suscripcion)){
            Socio socio=new Socio(nombre,dni,telefono,direccion,e_mail,suscripcion);
            socios.agregar(socio);
        }
    }
    public Lista<Socio> sociosPorSuscripcion(String suscripcion) throws Exception {
        Lista<Socio> lista=new Lista<>();
        if(verificarSuscripcion(suscripcion)) {
            for (int i = 0; i < socios.tamano(); i++) {
                if (socios.recuperar(i).getTipoDeSuscripcion().equals(suscripcion)){
                    lista.agregar(socios.recuperar(i));
                }
            }
        }
        return lista;
    }
}
