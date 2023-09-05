package Billetera;

import Billetera.Dinero;
import org.junit.Test;

public class TestBilletera {
    @Test
    public void test(){
        Dinero saldoInicial = new Dinero(20000.00,Moneda.DOLAR);
        Billetera billetera=new Billetera(saldoInicial);
        billetera.extraer(new Dinero(1000.00,Moneda.DOLAR));
        Assert(IsEqual(new Dinero(1000.00,Moneda.DOLAR),Billetera.saldo()));

    }
}
