package Contrasenas;

import TADS.Lista;

public class ColeccionDeContrasenas {
    private final Lista<Password> lista;
    public ColeccionDeContrasenas(int longitud){
        this.lista=new Lista<Password>();
        for(int i=0;i<10;i++){
            Password pass=new Password(longitud);
            lista.agregar(pass);
        }
    }
    public Lista coleccion(){
        return lista;
    }
    public void mostrarColeccion(){
        for(int i=0;i<10;i++){
            Password pass=lista.recuperar(i);
            System.out.printf("La contraseña N° %d es: %s",i+1,pass.getPassword());
            if(pass.getSegura()){
                System.out.print(" Es segura.\n");
            }else System.out.print(" No es segura.\n");
        }
    }
}
