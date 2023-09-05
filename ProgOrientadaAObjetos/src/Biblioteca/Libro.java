package Biblioteca;
import TADS.Lista;

public class Libro {

    private final String titulo;
    private final String autor;
    private final int cantHojas;
    private int cantEjemplares;

    private int cantTotales;

    private String isbn;
    private Lista<Ejemplar> ejemplares;

    public Libro (String titulo, String autor, int cantHojas, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.cantHojas = cantHojas;
        this.isbn = isbn;
        ejemplares= new Lista<>();
        cantEjemplares = 1;
        cantTotales = 1;
    }

    public void aumentarCantidad (){
        Ejemplar ejemplar=new Ejemplar(this);
        ejemplares.agregar(ejemplar);
        cantEjemplares++;
        cantTotales++;
    }
    public boolean puedePrestar(){
        for(int i=0;i<ejemplares.tamano();i++){
            if(ejemplares.recuperar(i).getPrestado()){
                return true;
            }
        }
        return false;
    }
    public Ejemplar prestarLibro (){
        for(int i=0;i<ejemplares.tamano();i++){
            if(ejemplares.recuperar(i).getPrestado()){
                ejemplares.recuperar(i).prestar();
                return ejemplares.recuperar(i);
            }
        }
        return null;
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
