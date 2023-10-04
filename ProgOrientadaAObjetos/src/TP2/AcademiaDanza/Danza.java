package TP2.AcademiaDanza;
import TP1.ListaPilaCola.Lista;
public class Danza {
    private String danza;
    private Lista<Comision> comisiones;
    public Danza(String danza){
        this.danza=danza;
        this.comisiones=new Lista<Comision>();
    }
    public void agregarComision(Comision comision){
        for(int i=0;i< comisiones.tamano();i++){
            if(comisiones.recuperar(i).getComision()==comision.getComision()){
                System.out.println("La comision ya existe!");
                return;
            }
        }
        comisiones.agregar(comision);
    }
    public void darDeBajaComision(Comision comision){
        for(int i=0;i< comisiones.tamano();i++){
            if(comisiones.recuperar(i).getComision()==comision.getComision()){
                comisiones.eliminar(i);
                return;
            }
        }
        System.out.println("La comision no existe!");
    }

}
