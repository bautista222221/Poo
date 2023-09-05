package Billetera;

import Billetera.Dinero;
import org.junit.Assert;
import org.junit.Test;

public class TestBilletera {
    @Test
    public void test(){
        Dinero saldoInicial = new Dinero(20000.00,Moneda.DOLAR);
        Billetera billetera=new Billetera(saldoInicial);
        billetera.extraer(new Dinero(1000.00,Moneda.DOLAR));
        Dinero saldo=billetera.getSaldo();
        //saldo.restar(new Dinero(100.00,Moneda.DOLAR);
        Assert(
            equals((new Dinero(1000.00,Moneda.DOLAR)),billetera.getSaldo())
        );
    }
}

