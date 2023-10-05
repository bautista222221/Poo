package TP2.EstacionDeServicio;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ModuloInformes{
    private List<Cliente> clientes;
    private Venta venta;
    public ModuloInformes(List<Cliente> lista,Venta venta){
        this.clientes=lista;
        this.venta=venta;
    }
    public List<Cliente> informeTop10Clientes(){
        clientes.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente c1, Cliente c2) {
                return (int) (c2.getComprasFinal() - c1.getComprasFinal());
            }
        });
        List<Cliente> top10=clientes.subList(0,10);
    }
    public List<Combustible> informeVentasXCombustible(){
    }
}
