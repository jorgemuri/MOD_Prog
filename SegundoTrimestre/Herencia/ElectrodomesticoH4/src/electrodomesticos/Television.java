package electrodomesticos;
public class Television extends Electrodomestico{
    static String rojo = "\u001B[31m";
    static String reset = "\u001B[0m";
    private final float pulgadas;
    private final boolean smartTV;

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
        return super.toString() + rojo+"\nTelevision{" +
                "pulgadas=" + pulgadas +
                ", smartTV=" + smartTV +
                ", color=" + color +
                '}'+reset;
    }
    public void instalarNetflix(){
        if (smartTV){
            System.out.println(rojo+"Netflix intalado correctamente. Marca televisor: " + getMarca() + reset);
        }
        else System.out.println(rojo+"La televisión no es smartTV"+reset);
    }
}
