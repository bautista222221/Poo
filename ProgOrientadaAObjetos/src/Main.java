import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Que quiere testear? \n1-Lista de Tareas.\n2-Biblioteca. \n3-Ecuacion de Segundo Grado. \n4-Password. \n5-Fecha. ");
        int numero=sc.nextInt();
        switch (numero) {
            case 1 -> getListaDeTareas();
            case 2 -> getBiblioteca();
            case 3 -> getEcuaciondeSegundoGrado();
            case 4 -> getPassword();
            case 5 -> getFecha();
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
        /*Password pass=new Password(10);
        pass.generarPassword();
        pass.esSegura();
        String contrasena=pass.getPassword();*/
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
}
