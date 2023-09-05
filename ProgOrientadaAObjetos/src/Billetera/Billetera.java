package Billetera;

public class Billetera {
    private Dinero saldo;
    public Billetera(Dinero saldo){
        this.saldo=saldo;
    }
    public void extraer(Dinero dinero){
        if(saldo.getSaldo()<dinero.getSaldo()){
            return;
        }
        this.saldo.restar(dinero);
    }
    public Dinero getSaldo(){
        return saldo;
    }
}
