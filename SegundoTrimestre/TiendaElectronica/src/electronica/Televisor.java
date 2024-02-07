package electronica;

public class Televisor extends Producto{
    private int pulgadas;
    private final int DESCUENTO = 8;

    public Televisor(String marca, String modelo, float precio, int pulgadas) {
        super(marca, modelo, precio);
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "pulgadas=" + pulgadas +
                ", DESCUENTO=" + DESCUENTO +
                '}';
    }
    public float calcularDescuento() {
        return super.getPrecio() * (DESCUENTO/100f); // devuelvo el total con el descuento aplicado
    }
    public void cambiarCanal(int canal){
        System.out.println("Has cambiado al canal " + canal);
    }
}
