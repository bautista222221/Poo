import Biblioteca.Biblioteca;
import Biblioteca.Libro;

import java.time.LocalDate;
import java.util.Scanner;
public class Prestamo {

    LocalDate fechaP;
    LocalDate fechaD;

    public Prestamo (String fechaDePrestamo, String fechaDeDev){
        this.fechaP = convertir(fechaDePrestamo);
        this.fechaD = convertir(fechaDeDev);
    }

    private LocalDate convertir(String fecha){
        DateTimeFormatter convertidor=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(fecha,convertidor);
    }

// Finalizar un prestamo

    public void finalizarPrestamo (){
        if (fechaD < fechaP){

        }
    }


}
