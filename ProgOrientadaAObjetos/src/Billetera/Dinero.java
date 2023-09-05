package Billetera;

import java.util.Objects;

public class Dinero {
    private double saldo;
    private Moneda moneda;
    public Dinero(double saldo,Moneda moneda){
        this.saldo=saldo;
        this.moneda=moneda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dinero dinero = (Dinero) o;
        return Double.compare(saldo, dinero.saldo) == 0 && Objects.equals(moneda, dinero.moneda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saldo, moneda);
    }

    public double getSaldo() {
        return this.saldo;
    }
    public Dinero restar(Dinero dinero){
        return new Dinero(this.saldo- dinero.saldo,this.moneda);
    }
    public Dinero restar(double dinero){
        return this.restar(new Dinero(dinero,this.moneda));
    }
}
