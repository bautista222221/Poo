package Biblioteca;

import TADS.Lista;

public class Biblioteca {
    private Lista<Libro> lista;
    private Lista<Prestamo> prestamos;
    private Lista<Socio> socios;
    public Biblioteca (){
        this.lista = new Lista<>();
        this.prestamos=new Lista<>();
        this.socios=new Lista<>();
    }
    public void nuevoLibro (String titulo, String autor, int cantHojas, String isbn){
        Libro libro1 = new Libro(titulo, autor, cantHojas, isbn);
        lista.agregar(libro1);
    }
    public void nuevoSocio(String nombre, int dni){
        Socio socio=new Socio(nombre,dni);
        socios.agregar(socio);
    }
    public void agregarEjemplares(String titulo, int cantidad){
        Libro libro1;
        int longitud = lista.tamano();
        for (int j=0; j<longitud; j++){
            libro1 = lista.recuperar(j);
            if (libro1.getTitulo().equals(titulo)){
                for (int i=0; i<cantidad; i++){
                    libro1.aumentarCantidad();
                }
            }

        }
    }
    public void masHojas (String titulo1, String titulo2){
        Libro libro1 = null;
        boolean encontrado1 = false;
        boolean encontrado2 = false;
        for (int j=0; j< lista.tamano(); j++) {
            libro1 = lista.recuperar(j);
            if (libro1.getTitulo().equals(titulo1)) {
                encontrado1 = true;
                break;
            }
        }
        Libro libro2 = null;
        for (int j=0; j< lista.tamano(); j++) {
            libro2 = lista.recuperar(j);
            if (libro2.getTitulo().equals(titulo2)) {
                encontrado2 = true;
                break;
            }
        }
        if (encontrado1 && encontrado2){
            if (libro1.getCantidadHojas() > libro2.getCantidadHojas()){
                System.out.println("Tiene más hojas: " + libro1.getTitulo());
            }
            else {
                System.out.println("Tiene más hojas: " + libro2.getTitulo());
            }
        }
        else {
            System.out.println("No se encontraron los libros");
        }
    }
    public boolean prestar(String titulo,int dni) {
        for(int i=0;i<socios.tamano();i++){
            if(socios.recuperar(i).getDni()==dni){
                for(int j=0;j<lista.tamano();j++) {
                    if(lista.recuperar(i).getTitulo().equals(titulo)&&lista.recuperar(i).puedePrestar()){
                        prestamos.agregar(new Prestamo(socios.recuperar(i),lista.recuperar(i).prestarLibro()));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean devolver (String titulo, int dni){
        for(int i=0;i<prestamos.tamano();i++){
            if(prestamos.recuperar(i).getSocio().getDni()==dni&&prestamos.recuperar(i).getEjemplar().getLibro().getTitulo().equals(titulo)){
                prestamos.recuperar(i).getEjemplar().devolver();
                prestamos.eliminar(i);
                return true;
            }
        }
        return false;
    }
    public int getCantPrestadosTotales () {
        Libro libro1;
        int prestados = 0;
        for (int i=0; i< lista.tamano(); i++){
            prestados += lista.recuperar(i).cantidadPrestados();
        }
        return Math.max(prestados, 0);
    }

    public String mostrarDescripcion (String titulo){
        String descripcion = null;
        for (int i=0; i< lista.tamano(); i++) {
            if (lista.recuperar(i).getTitulo().equals(titulo)){
                descripcion = lista.recuperar(i).mostarDatos();
            }
        }
        if (descripcion == null){
            System.out.println("No se encontro el libro");
            return "No";
        }
        return descripcion;
    }
}