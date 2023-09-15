package TP2.AgenciaTurismo.Proveedores;

public class MedioDeTransporte extends Proveedor{
    private String medio;
    private double precio;
    public MedioDeTransporte(String medio, double precio){
        this.medio=medio;
        this.precio=precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    public String getMedio(){
        return medio;
    }
}
