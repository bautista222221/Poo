public class Biblioteca {
    private final String nombre;
    private final Lista <Libro> lista;
    public Biblioteca (String nombre){
        this.nombre = nombre;
        this.lista = new Lista<>();
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
    public void prestar (Libro libro1,int cantidad) {
        int contador = 0;
        while (libro1.prestarLibro() && contador < cantidad-1) {
            contador++;
        }
        if (contador < cantidad - 1) {
            System.out.println("Solo se han podido dar " + contador + " libros!");
        } else {
            System.out.println("Se han dado exitosamente los " + cantidad + " libros!");
        }
    }
    private int librosPrestados (Libro libro1){
        return libro1.cantTotales() - libro1.cantEjemplares();
    }

    public void mostarDatos (Libro libro1){
        System.out.println("El libro: " + libro1.mostrarTitulo() + " creado por el autor: " + libro1.mostrarAutor() + " tiene: " + libro1.cantidadHojas() + " hojas y quedan: " + libro1.cantEjemplares() + " disponibles y se prestaron: " + librosPrestados(libro1));
    }
    public void prestadosTotales(){
        int prestados = 0;
        int contador = 0;
        Libro actual;
        while (contador < lista.tamano()){
            actual = lista.recuperar(contador);
            contador++;
            prestados += librosPrestados(actual);
        }
        System.out.println("Cantidad total de ejemplares prestados: " + prestados);
    }
    public String nombreBiblioteca(){
        return nombre;
    }
}