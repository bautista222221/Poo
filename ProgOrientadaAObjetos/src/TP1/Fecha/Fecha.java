package TP1.Fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Fecha {
    LocalDate fecha;

    /**
     * Este constructor recibe el formato dia-mes-año
     *
     * @param fechaDiaMesAnio
     */
    public Fecha(String fechaDiaMesAnio){
        this.fecha=convertir(fechaDiaMesAnio);
    }

    /**
     * Este constructor recibe el formato mes-dia-año
     *
     * @param fechaMesDiaAnio
     */
    public Fecha(String fechaMesDiaAnio, boolean otroFormato){
        if(otroFormato) this.fecha=convertir2(fechaMesDiaAnio);
        else this.fecha=convertir(fechaMesDiaAnio);
    }
    private LocalDate convertir2(String fecha){
        DateTimeFormatter convertidor=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return LocalDate.parse(fecha,convertidor);
    }
    private LocalDate convertir(String fecha){
        DateTimeFormatter convertidor=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(fecha,convertidor);
    }

    /**
     * Determinar si una fecha esta entre otras dos
     * @param fecha1 TP1.Fecha.TP1.Fecha de inicio
     * @param fecha2 TP1.Fecha.TP1.Fecha final
     * @return True/False
     */

    public boolean entreMedio(LocalDate fecha1,LocalDate fecha2){
        return fecha.isAfter(fecha1)&&fecha.isBefore(fecha2);
    }

    /**
     * Determinarr si una fecha es posterior a otra
     * @param fechaObjetivo TP1.Fecha.TP1.Fecha determinante
     * @return True/False
     */
    public boolean fechaPosterior(LocalDate fechaObjetivo){
        return fecha.isAfter(fechaObjetivo);
    }
    /**
     * Determinarr si una fecha es anterior a otra
     * @param fechaObjetivo TP1.Fecha.TP1.Fecha determinante
     * @return True/False
     */
    public boolean fechaAnterior(LocalDate fechaObjetivo){
        return fecha.isBefore(fechaObjetivo);
    }
    public LocalDate getFecha(){
        return fecha;
    }
}
