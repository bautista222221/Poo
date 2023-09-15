package TP2.AgenciaTurismo.Proveedores;

public class Hospedaje extends Proveedor{
    private String hospedaje;
    private double precio;
    public Hospedaje(String hospedaje,double precio){
        this.hospedaje=hospedaje;
        this.precio=precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public String getHospedaje() {
        return hospedaje;
    }
}
