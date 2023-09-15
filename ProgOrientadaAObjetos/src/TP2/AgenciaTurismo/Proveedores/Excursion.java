package TP2.AgenciaTurismo.Proveedores;

public class Excursion extends Proveedor{
    private String excursion;
    private double precio;
    public Excursion(String excursion, double precio){
        this.precio=precio;
        this.excursion=excursion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public String getExcursion() {
        return excursion;
    }
}
