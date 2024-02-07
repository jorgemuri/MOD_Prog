package electronica;

public class Movil extends Producto{
    /*Parámetros*/
    private String procesador;
    private int ram, pulgadas;
    private final int DESCUENTO = 5;
    /*FIN Parámetros*/

    /*Métodos*/

    public Movil(String marca, String modelo, float precio, String procesador, int ram, int pulgadas) {
        super(marca, modelo, precio);
        this.procesador = procesador;
        this.ram = ram;
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return  "Movil{" + super.getMarca() + " " + super.getModelo() + " " +
                "procesador='" + procesador + '\'' +
                ", ram=" + ram +
                ", pulgadas=" + pulgadas +
                ", DESCUENTO=" + DESCUENTO +
                '}';
    }
    public float calcularDescuento(){
        return super.getPrecio() * (DESCUENTO/100f); // devuelvo el total que me van a descontar
    }
    public void llamar(String numero){
        System.out.println("Marcando...");
        System.out.println("Llamando a " + numero);
    }
    /*Fin métodos*/
}
