public class ColeccionDeContraseñas {
    private int longitud;
    private Lista<Password> lista;
    public ColeccionDeContraseñas(int longitud){
        this.longitud=longitud;
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
                System.out.printf(" Es segura.\n");
            }else System.out.printf(" No es segura.\n");
        }
    }
}
