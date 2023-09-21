package TP2.FigurasGeometricas;
import TP1.ListaPilaCola.Lista;
public class ListaDeFiguras {
    private final Lista<Figura> lista;
    public ListaDeFiguras(){
        this.lista=new Lista<>();
    }
    public void agregarFigura(Figura figura){
        lista.agregar(figura);
    }
    public void quitarFigura(int indice){
        if(indice>=0&&indice< lista.tamano()){
            lista.eliminar(indice);
        }else{
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
    }
    public Lista<Double> areaLista(){
        Lista<Double> listaNueva=new Lista<>();
        for(int i=0;i< lista.tamano();i++){
            listaNueva.agregar(lista.recuperar(i).getArea());
        }
        return listaNueva;
    }
    public Lista<Double> volumenLista(){
        Lista<Double> listaNueva=new Lista<>();
        for(int i=0;i< lista.tamano();i++){
            if(lista.recuperar(i) instanceof TresDimensiones){
                listaNueva.agregar(((TresDimensiones) lista.recuperar(i)).getVolumen());
            }
        }
        return listaNueva;
    }
    public Lista<Figura> getLista(){
        return lista;
    }
    public Lista<Figura> listaDosDimensiones(){
        Lista<Figura> nueva=new Lista<>();
        for(int i=0;i< lista.tamano();i++){
            if(lista.recuperar(i) instanceof DosDimensiones){
                nueva.agregar(lista.recuperar(i));
            }
        }
        return nueva;
    }
    public Lista<Figura> listaTresDimensiones(){
        Lista<Figura> nueva=new Lista<>();
        for(int i=0;i< lista.tamano();i++){
            if(lista.recuperar(i) instanceof TresDimensiones){
                nueva.agregar(lista.recuperar(i));
            }
        }
        return nueva;
    }
}
