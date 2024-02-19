package electrodomesticos;

public class Television extends Electrodomestico{
    private float pulgadas;
    private boolean smartTV;

    public Television(String marca, char consumoEnergetico, float peso, float precio, colores color, float pulgadas, boolean smartTV) {
        super(marca, consumoEnergetico, peso, precio, color);
        this.pulgadas = pulgadas;
        this.smartTV = smartTV;

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(pulgadas >= 40){
            setPrecio(getPrecio()+(getPrecio()*0.3f));
        }
        if (smartTV){
            setPrecio(getPrecio()+50.00f);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nTelevision{" +
                "pulgadas=" + pulgadas +
                ", smartTV=" + smartTV +
                ", color=" + color +
                '}';
    }
    public void instalarNetflix(){
        if (smartTV){
            System.out.println("Netflix intalado correctamente. Marca televisor: " + getMarca());
        }
        else System.out.println("La televisión no es smartTV");
    }
}
