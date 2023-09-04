package Biblioteca;

import TADS.Lista;

public class Biblioteca {
    private final Lista<Libro> lista;
    public Biblioteca (){
        this.lista = new Lista<>();
    }
    public void nuevoLibro (String titulo, String autor, int cantHojas, String isbn){
        Libro libro1 = new Libro(titulo, autor, cantHojas, isbn);
        lista.agregar(libro1);
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
        int longitud = lista.tamano();
        for (int j=0; j<longitud; j++) {
            libro1 = lista.recuperar(j);
            if (libro1.getTitulo().equals(titulo1)) {
                encontrado1 = true;
                break;
            }
        }
        Libro libro2 = null;
        for (int j=0; j<longitud; j++) {
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
    public boolean prestar(String titulo) {
        Libro libro1 = null;
        int longitud = lista.tamano();
        for (int j=0; j<longitud; j++) {
            libro1 = lista.recuperar(j);
            if (libro1.getTitulo().equals(titulo)){
                if (libro1.prestarLibro()){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean devolver (String titulo, String autor, int cantHojas, String isbn){
        Libro libro1 = null;
        int longitud = lista.tamano();
        for (int j=0; j<longitud; j++) {
            libro1 = lista.recuperar(j);
            if((libro1.getTitulo().equals(titulo))&&(libro1.getAutor().equals(autor))&&(libro1.getCantidadHojas()==cantHojas)&&libro1.getIsbn().equals(isbn)){
                return libro1.devolverLibro();
            }
        }
        return false;
    }
    public int getCantPrestadosTotales () {
        int longitud = lista.tamano();
        Libro libro1;
        int prestados = 0;
        for (int i=0; i<longitud; i++){
            libro1 = lista.recuperar(i);
            prestados += libro1.cantidadPrestados();
        }
        return Math.max(prestados, 0);
    }

    public String mostrarDescripcion (String titulo){
        Libro libro1 = null;
        String descripcion = null;
        int longitud = lista.tamano();
        for (int j=0; j<longitud; j++) {
            libro1 = lista.recuperar(j);
            if (libro1.getTitulo().equals(titulo)){
                descripcion = libro1.mostarDatos();
            }
        }
        if (descripcion == null){
            System.out.println("No se encontro el libro");
            return "No";
        }
        return descripcion;
    }
}