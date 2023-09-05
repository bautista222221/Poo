import Biblioteca.Biblioteca;
import Contrasenas.ColeccionDeContrasenas;
import EcuacionDeSegundoGrado.EcuacionDeSegundoGrado;
import Fecha.Fecha;
import Juego.Juego;
import Tareas.ListaDeTareas;

import java.time.LocalDate;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Que quiere testear? \n1-Lista de Tareas.\n2-Biblioteca. \n3-Ecuacion de Segundo Grado. \n4-Password. \n5-Fecha.Fecha. \n6-Juego. ");
        int numero=sc.nextInt();
        switch (numero) {
            case 1 -> getListaDeTareas();
            case 2 -> getBiblioteca();
            case 3 -> getEcuaciondeSegundoGrado();
            case 4 -> getPassword();
            case 5 -> getFecha();
            case 6 -> getJuego();
            default -> System.out.println("Ingrese un valor valido!");
        }
    }





    private static void getListaDeTareas() {
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        listaDeTareas.agregarTarea("Consultar repuesto del auto.", 5, LocalDate.of(2023, 9,23),LocalDate.of(2023,9,17));
        listaDeTareas.agregarColaborador("Ir al supermercado mañana.", "Juan Pedro Lopez");
        listaDeTareas.agregarColaborador("Ir al supermercado mañana.", "Armando Paredes");
        listaDeTareas.agregarColaborador("Consultar repuesto del auto.", "Esteban Quito");
        listaDeTareas.agregarTarea("Ir al supermercado mañana.", 4, LocalDate.of(2023, 9,4),LocalDate.of(2023,9,3));
        listaDeTareas.agregarTarea("Ir al cine a ver la nueva peli de Marvel.", 2, LocalDate.of(2023, 9, 20),LocalDate.of(2023,9,8));
        listaDeTareas.agregarTarea("Terminar el tp de Base de Datos 1.", 1, LocalDate.of(2023, 9, 8),LocalDate.of(2023,9,2));
        listaDeTareas.agregarTarea("Tender la ropa.",2,LocalDate.of(2023,9,4),LocalDate.of(2023,9,4));
        listaDeTareas.agregarTarea("Estudiar para Jorge.",2,LocalDate.of(2023,9,10),LocalDate.of(2023,9,8));
        listaDeTareas.tacharTarea("Consultar repuesto del auto.", "Esteban Quito");
        listaDeTareas.modificar("Ir al supermercado pasado-mañana.",3,LocalDate.of(2023,9,5),LocalDate.of(2023,9,4),3);
        listaDeTareas.mostrarColaboradores("Consultar repuesto del auto.");
        listaDeTareas.mostrarColaboradores("Ir al supermercado mañana.");
        System.out.println("\n\n\n\n");
        listaDeTareas.listaDeTareasNoVencidas().mostrarLista();
        System.out.println("\n\n\n\n");
        listaDeTareas.mostrarLista();
    }



    private static void getBiblioteca() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.nuevoLibro("Harry Potter", "J.K.Rowling", 560, "51654135415");
        biblioteca.nuevoLibro("El principito", "Juan Perez", 600, "51837461382");
        biblioteca.agregarEjemplares("Harry Potter", 9);
        biblioteca.prestar("Harry Potter");
        biblioteca.prestar("El principito");
        biblioteca.masHojas("Harry Potter", "El principito");
        System.out.println(biblioteca.mostrarDescripcion("Harry Potter"));
        System.out.println(biblioteca.mostrarDescripcion("El principito"));
        biblioteca.devolver("Harry Potter", "J.K.Rowling", 560, "51654135415");
        biblioteca.devolver("Harry Potter", "J.K.Rowling", 560, "51654135415");
        System.out.println("Los ejemplares totales prestados son: " + biblioteca.getCantPrestadosTotales());
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
        ColeccionDeContrasenas lista=new ColeccionDeContrasenas(10);
        lista.mostrarColeccion();
    }



    private static void getFecha(){
        Fecha fecha=new Fecha("22-03-2004");
        Fecha fecha2=new Fecha("08-25-2021",true);
        LocalDate fecha3=LocalDate.of(2022,9,21);
        LocalDate fecha4=LocalDate.of(2000,6,15);
        LocalDate prueba1=fecha.getFecha();
        LocalDate prueba2=fecha2.getFecha();
        System.out.println("La primer fecha es: "+prueba1);
        System.out.println("La segunda fecha es: "+prueba2);
        System.out.println("La primer fecha esta entre las otras dos? "+fecha.entreMedio(fecha4,fecha3));
        System.out.println("La fecha es anterior? "+fecha2.fechaAnterior(fecha3));
        System.out.println("La fecha es posterior? "+fecha.fechaPosterior(fecha4));
    }



    private static void getJuego(){
        Juego juego=new Juego();
        juego.agregarJugador("Bautista");
        juego.agregarJugador("Pedro");
        juego.agregarJugador("Pablo");
        juego.agregarPalabra("WWWzzzzZZ","Bautista");
        juego.agregarPalabra("Perro","Bautista");
        juego.agregarPalabra("Zorro","Pedro");
        juego.agregarPalabra("Esternocleidomastiodeo","Pablo");
        juego.palabrasJugador("Bautista");
        juego.mostrarPuntos("Bautista");
        juego.ganador();
    }



}
