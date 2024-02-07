package electronica;

public class Ordenador extends Producto{
    /*atributos*/
    private String procesador;
    private int ram;
    private int hdd;
    private final int DESCUENTO = 5;

    /*Métodos*/

    public Ordenador(String marca, String modelo, float precio, String procesador, int ram, int hdd) {
        super(marca, modelo, precio);
        this.procesador = procesador;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "procesador='" + procesador + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", DESCUENTO=" + DESCUENTO +
                '}';
    }

    @Override
    public float calcularDescuento() {
        return super.getPrecio() * (DESCUENTO/100f); // devuelvo el total con el descuento aplicado
    }
    public void ampliarRam(int aumento){
        ram = ram + aumento;
        System.out.println("La ram total del ordenador es: " + ram + " Gb");
    }
}
