import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*Tarea tarea1 = new Tarea("Consultar repuesto del auto", 2, LocalDate.of(2023, 8, 29));
        tarea1.tachar();
        Tarea tarea2 = new Tarea("Ir al supermercado mañana", 4, LocalDate.of(2023, 8, 22));
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva peli de Marvel", 2, LocalDate.of(2023, 8, 20));
        Tarea tarea4 = new Tarea("Terminar el tp de Base de Datos 1", 10, LocalDate.of(2023, 9, 5));
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        listaDeTareas.agregar(tarea1);
        listaDeTareas.agregar(tarea2);
        listaDeTareas.agregar(tarea3);
        listaDeTareas.agregar(tarea4);
        listaDeTareas.mostrarLista();*/

        Biblioteca maincra = new Biblioteca("Maincra");
        Libro libro1 = new Libro("Diario de Ana Frank", "Ana Frank", 215);
        maincra.nuevoLibro(libro1);
        maincra.agregarEjemplares(libro1, 6);
        maincra.prestar(libro1);
        Libro libro2 = new Libro("El mundo de Vegetta 777", "Vegetta777", 130);
        maincra.nuevoLibro(libro2);
        Libro libro3 = new Libro("Las aventuras de Franketa y su 110", "TT", 25);
        maincra.nuevoLibro(libro3);
        maincra.agregarEjemplares(libro3,1258);
        maincra.prestar(libro3);
        maincra.prestar(libro3);
        maincra.prestar(libro3);
        maincra.prestar(libro3);
        maincra.prestar(libro3);
        maincra.prestar(libro3);
        maincra.prestar(libro3);
        maincra.prestar(libro3);
        maincra.prestar(libro3);
        maincra.prestar(libro3);
        maincra.prestar(libro3);
        maincra.prestar(libro3);
        maincra.prestar(libro3);
        maincra.prestar(libro3); // 14
        maincra.mostarDatos(libro3);
        maincra.agregarEjemplares(libro2, 15);
        maincra.prestar(libro2);
        maincra.prestar(libro2);
        maincra.prestar(libro2);
        maincra.mostarDatos(libro1);
        maincra.mostarDatos(libro2);
        maincra.masHojas(libro1, libro3);
        maincra.prestadosEjemplar(libro3);
        maincra.prestadosTotales();
    }

}
