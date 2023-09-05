package Biblioteca;
import TADS.Lista;

public class Libro {

    private final String titulo;
    private final String autor;
    private final int cantHojas;
    private String isbn;
    private Lista<Ejemplar> ejemplares;

    public Libro (String titulo, String autor, int cantHojas, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.cantHojas = cantHojas;
        this.isbn = isbn;
        ejemplares= new Lista<>();
    }

    public void aumentarCantidad (){
        Ejemplar ejemplar=new Ejemplar(this);
        ejemplares.agregar(ejemplar);
    }
    public boolean puedePrestar(){
        for(int i=0;i<ejemplares.tamano();i++){
            if(ejemplares.recuperar(i).getDisponible()){
                return true;
            }
        }
        return false;
    }
    public Ejemplar prestarLibro (){
        for(int i=0;i<ejemplares.tamano();i++){
            if(ejemplares.recuperar(i).getDisponible()){
                ejemplares.recuperar(i).prestar();
                return ejemplares.recuperar(i);
            }
        }
        return null;
    }
    public boolean devolverLibro(Ejemplar ejemplar){
        for(int i=0;i<ejemplares.tamano();i++){
            if(ejemplares.recuperar(i).equals(ejemplar)){
                ejemplares.recuperar(i).devolver();
                return true;
            }
        }
        return false;
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
        int prestados=0;
        for(int i=0;i< ejemplares.tamano();i++){
            if(ejemplares.recuperar(i).getDisponible()){
                prestados++;
            }
        }
        return prestados;
    }

    public String mostarDatos (){
        return "El libro: " + titulo + " creado por el autor: " + autor + " tiene: " + cantHojas + " hojas y quedan: " +ejemplares.tamano()+ " disponibles y se prestaron: " + cantidadPrestados();
    }
}
