public class Libro {

    private final String titulo;
    private final String autor;
    private final int cantHojas;
    private int cantEjemplares;

    private int cantTotales;

    private String isbn;

    public Libro (String titulo, String autor, int cantHojas, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.cantHojas = cantHojas;
        this.isbn = isbn;
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
            System.out.println("Libro prestado con exito!!!");
            return true;
        }
        else {
            System.out.println("No hay suficientes ejemplares");
            return false;
        }
    }
    public boolean devolverLibro(){
        if(cantEjemplares<cantTotales) {
            cantEjemplares++;
            return true;
        }
        else return false;
    }

    public String getTitulo (){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getIsbn(){
        return isbn;
    }

    public int getCantidadHojas (){
        return cantHojas;
    }

    public int cantidadPrestados (){
        return (cantTotales - cantEjemplares);
    }

    public String mostarDatos (){
        return "El libro: " + titulo + " creado por el autor: " + autor + " tiene: " + cantHojas + " hojas y quedan: " + cantEjemplares + " disponibles y se prestaron: " + cantidadPrestados();
    }
}
