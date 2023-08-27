import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Que quiere testear? \n1-Lista de Tareas.\n2-Biblioteca. \n3-Ecuacion de Segundo Grado. \n4-Password.");
        int numero=sc.nextInt();
        switch (numero) {
            case 1 -> getListaDeTareas();
            case 2 -> getBiblioteca();
            case 3 -> getEcuaciondeSegundoGrado();
            case 4 -> getPassword();
            default -> System.out.println("Ingrese un valor valido!");
        }
    }

    private static void getListaDeTareas() {
        Tarea tarea1 = new Tarea("Consultar repuesto del auto", 2, LocalDate.of(2023, 8, 29));
        tarea1.tachar();
        Tarea tarea2 = new Tarea("Ir al supermercado mañana", 4, LocalDate.of(2023, 8, 22));
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva peli de Marvel", 2, LocalDate.of(2023, 8, 20));
        Tarea tarea4 = new Tarea("Terminar el tp de Base de Datos 1", 10, LocalDate.of(2023, 9, 5));
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        listaDeTareas.agregar(tarea1);
        listaDeTareas.agregar(tarea2);
        listaDeTareas.agregar(tarea3);
        listaDeTareas.agregar(tarea4);
        listaDeTareas.modificar("Ir al supermercado pasado-mañana",3,LocalDate.of(2023,8,29),1);
        listaDeTareas.mostrarLista();
    }

    private static void getBiblioteca() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca");
        System.out.println("Biblioteca "+biblioteca.nombreBiblioteca()+" dada de alta.");
        Libro libro1 = new Libro("Diario de Ana Frank", "Ana Frank", 215);
        Libro libro2 = new Libro("Harry Potter y las reliquias de la muerte", "J. K. Rowling", 630);
        Libro libro3 = new Libro("Cancion de Hielo y Fuego, Juego de Tronos", "George R. R. Martin", 1300);
        biblioteca.nuevoLibro(libro1);
        biblioteca.nuevoLibro(libro2);
        biblioteca.nuevoLibro(libro3);
        biblioteca.agregarEjemplares(libro1,9);
        biblioteca.agregarEjemplares(libro2,19);
        biblioteca.agregarEjemplares(libro3,29);
        biblioteca.prestar(libro1,8);
        biblioteca.prestar(libro2,19);
        biblioteca.prestar(libro3,40);
        biblioteca.mostarDatos(libro1);
        biblioteca.mostarDatos(libro2);
        biblioteca.mostarDatos(libro3);
        biblioteca.masHojas(libro1,libro2);
        biblioteca.prestadosTotales();
    }

    private static void getEcuaciondeSegundoGrado(){
        EcuacionDeSegundoGrado ecuacion=new EcuacionDeSegundoGrado(1,-3,2);
        ecuacion.mostrarRaices();
        ecuacion.calcularValorDeY(5);
        EcuacionDeSegundoGrado ecuacion2=new EcuacionDeSegundoGrado(5,8,2);
        ecuacion2.mostrarRaices();
        ecuacion2.calcularValorDeY(2);
        EcuacionDeSegundoGrado ecuaucion3=new EcuacionDeSegundoGrado(2,-4,2);
        ecuaucion3.mostrarRaices();
        ecuaucion3.calcularValorDeY(6);
        EcuacionDeSegundoGrado ecuacion4=new EcuacionDeSegundoGrado(1,4,5);
        ecuacion4.mostrarRaices();
        ecuacion4.calcularValorDeY(-3);
    }

    private static void getPassword(){
        Password pass=new Password(10);
        pass.generarPassword();
        pass.esSegura();
        String contrasena=pass.getPassword();
    }

}
