package Biblioteca;

import TADS.Lista;

public class Ejemplar {
    private boolean disponible;
    private Libro libro;
    public Ejemplar(Libro libro){
        this.disponible=true;
        this.libro=libro;
    }
    public boolean getDisponible(){
        return disponible;
    }
    public Libro getLibro() {
        return libro;
    }
    public void prestar(){
        disponible=false;
    }
    public void devolver(){
        disponible=true;
    }
}
