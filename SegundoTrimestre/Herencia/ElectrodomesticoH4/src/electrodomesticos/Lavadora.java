package electrodomesticos;

public class Lavadora extends Electrodomestico{
    /*Atibuto*/
    private float carga;

    /*Métodos*/

    public Lavadora(String marca, char consumoEnergetico, float peso, float precio, Electrodomestico.colores color, float carga) {
        super(marca, consumoEnergetico, peso, precio, color);
        this.carga = carga;
    }

    @Override
    void precioFinal() {
        super.precioFinal();
        if (carga > 10.00f){
            setPrecio(getPrecio()+50.00f);
        }
    }
}
