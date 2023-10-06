package TP2.BilleteraVirtual;

public class CuentaCredito extends Cuenta{
    private double limiteCompra;
    private double intereses;
    public CuentaCredito(double saldoInicial,double limiteDescubierto,double limiteCompra){
        super(saldoInicial,limiteDescubierto);
        this.limiteCompra=limiteCompra;
        this.intereses=0;
    }

    @Override
    public void pagar(double monto) {
        if(monto<=0){
            System.out.println("El monto debe ser mayor a cero.");
            return;
        }
        if(monto>getSaldo()+limiteCompra){
            System.out.println("No hay suficiente saldo para realizar la compra.");
            return;
        }
        if(monto<=getSaldo()){
            setSaldo(getSaldo()-monto);
        }else {
            double montoRestante = monto - getSaldo();
            setSaldo(0);
            limiteCompra += montoRestante;
        }
        double montoFinal=monto*1.05;
        limiteCompra+=montoFinal-monto;
    }
}
