public class Biblioteca {

    private String nombre;

    private Lista <Libro> lista;

    public Biblioteca (String nombre){
        this.nombre = nombre;
        this.lista = new Lista<Libro>();
    }
    public void nuevoLibro (Libro libro1){
        lista.agregar(libro1);
    }

    public void agregarEjemplares(Libro libro1, int cantidad){
        for (int i=0; i<cantidad; i++){
            libro1.aumentarCantidad();
        }
    }
    public void masHojas (Libro libro1, Libro libro2){
        if (libro1.cantidadHojas() > libro2.cantidadHojas()){
            System.out.println("Tiene más hojas: " + libro1.mostrarTitulo());
        }
        else {
            System.out.println("Tienes más hojas: " + libro2.mostrarTitulo());
        }
    }

    public void prestar (Libro libro1){
        if (libro1.prestarLibro()){
            System.out.println("El ejemplar " + libro1.mostrarTitulo() + " se presto con exito!");
        }
        else {
            System.out.println("El ejemplar " + libro1.mostrarTitulo() + " no se puede prestar!");
        }
    }

    private int librosPrestados (Libro libro1){
        int prestados = libro1.cantTotales() - libro1.cantEjemplares();
        return prestados;
    }

    public void prestadosEjemplar (Libro libro1){
        int prestados = libro1.cantTotales()-libro1.cantEjemplares();
        System.out.println("Cantidad de ejemplares prestados de: " + libro1.mostrarTitulo() + " es: " + prestados);
    }
    public void mostarDatos (Libro libro1){
        System.out.println("El libro: " + libro1.mostrarTitulo() + " creado por el autor: " + libro1.mostrarAutor() + " tiene: " + libro1.cantidadHojas() + " hojas y quedan: " + libro1.cantEjemplares() + " disponibles y se prestaron: " + librosPrestados(libro1));
    }

    public int prestadosTotales(){
        int prestados = 0;
        int contador = 0;
        Libro actual;
        while (contador < lista.tamano()){
            actual = lista.recuperar(contador);
            contador++;
            prestados += librosPrestados(actual);
        }
        System.out.println("Cantidad total de ejemplares prestados: " + prestados);
        return prestados;
    }
}




// Cant total de prestamos
// Cual tiene mas pags
// Prestar un libro
