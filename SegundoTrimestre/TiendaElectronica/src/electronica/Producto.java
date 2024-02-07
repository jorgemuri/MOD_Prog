package electronica;

public abstract class Producto {
    /*Parámetros*/
    private String marca, modelo;
    private float precio;
    private static int inventario;
    /*Fin Parámetros*/

    public Producto(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public static int getInventario() {
        return inventario;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public abstract float calcularDescuento();
}
