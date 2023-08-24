public class Libro {

    private final String titulo;
    private final String autor;
    private final int cantHojas;
    private int cantEjemplares;

    private int cantTotales;

    public Libro (String titulo, String autor, int cantHojas){
        this.titulo = titulo;
        this.autor = autor;
        this.cantHojas = cantHojas;
        cantEjemplares = 1;
        cantTotales = 1;
    }

    public void aumentarCantidad (){
        cantEjemplares++;
        cantTotales++;
    }

    public boolean prestarLibro (){
        if (cantEjemplares > 1){
            cantEjemplares--;
            return true;
        }
        else {
            System.out.println("No hay suficientes ejemplares");
            return false;
        }
    }

    public String mostrarTitulo (){
        return titulo;
    }

    public String mostrarAutor (){
        return autor;
    }

    public int cantidadHojas (){
        return cantHojas;
    }

    public int cantEjemplares (){
        return cantEjemplares;
    }

    public int cantTotales (){
        return cantTotales;
    }

}
