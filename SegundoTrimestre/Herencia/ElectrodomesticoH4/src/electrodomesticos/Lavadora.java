package electrodomesticos;

public class Lavadora extends Electrodomestico{
    /*Atibuto*/
    private float carga;

    /*Métodos*/

    public Lavadora(String marca, char consumoEnergetico, float peso, float precio, Electrodomestico.colores color, float carga) {
        super(marca, consumoEnergetico, peso, precio, color);
        this.carga = carga;
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 10.00f){
            setPrecio(getPrecio()+50.00f);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nLavadora{" +
                "carga=" + carga +
                ", color=" + color +
                '}';
    }
}
