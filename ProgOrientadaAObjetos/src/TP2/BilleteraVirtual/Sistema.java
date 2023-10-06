package TP2.BilleteraVirtual;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Cuenta> cuentas;
    public Sistema(){
        this.cuentas=new ArrayList<>();
    }
    public void agregarCuenta(double saldoInicial,double limiteDescubierto){
        cuentas.add(new Cuenta(saldoInicial,limiteDescubierto));
    }
    public void agregarCuentaCredito(double saldoInicial,double limiteDescubierto,double limiteCompras){
        cuentas.add(new CuentaCredito(saldoInicial,limiteDescubierto,limiteCompras));
    }

}
