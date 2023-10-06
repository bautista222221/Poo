package TP2.BilleteraVirtual;

import java.time.LocalDate;

public class Cuenta {
    private double saldo;
    private double limiteDescubierto;
    private double montoInvertido;
    private boolean inversionActiva;
    private LocalDate fechaInversion;
    public Cuenta(double saldoInicial,double limiteDescubierto){
        this.saldo=saldoInicial;
        this.limiteDescubierto=limiteDescubierto;
        this.montoInvertido=0;
        this.inversionActiva=false;
        this.fechaInversion=null;
    }
    public void invertir(double monto){
        if(inversionActiva){
            System.out.println("Ya hay una inversion activa en este momento.");
            return;
        }
        if(monto<=saldo) {
            this.montoInvertido = monto;
            saldo -= monto;
            inversionActiva = true;
            fechaInversion = LocalDate.now();
            System.out.println("Se ha realizado una inversion de " + monto + " pesos.");
        }else{
            System.out.println("No hay suficiente saldo.");
        }
    }
    private void calcularIntereses(){
        if(!inversionActiva){
            System.out.println("No hay una inversion activa.");
            return;
        }
        double interesesGenerados=montoInvertido* 1.4;
        saldo+=interesesGenerados;
        montoInvertido=0;
        inversionActiva=false;
        System.out.println("Se han generado unos interes por un monto de "+interesesGenerados+" pesos.");
    }
    public void retirarIntereses(LocalDate fechaRetiro){
        if(fechaRetiro.plusDays(365).isAfter(fechaRetiro)){
            calcularIntereses();
            return;
        }else{
            System.out.println("No han transcurrido los dias necesarios para retirar el interes");
        }
    }
    public void pagar(double monto){
        if(monto<=(saldo+limiteDescubierto)){
            if(monto>saldo){
                System.out.println("Este pago se efectuara con el saldo el limite descubierto.");
            }
            this.saldo-=monto;
            System.out.println("Pago realizado.");
        }
        else System.out.println("No hay suficientes fondos para realizar el pago.");
    }
    public void agregarSaldo(double saldo){
        this.saldo+=saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    public double getMontoInvertido() {
        return montoInvertido;
    }

    public boolean isInversionActiva() {
        return inversionActiva;
    }

    public LocalDate getFechaInversion() {
        return fechaInversion;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
