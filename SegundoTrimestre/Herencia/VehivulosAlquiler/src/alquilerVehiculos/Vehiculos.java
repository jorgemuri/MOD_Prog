package alquilerVehiculos;

public abstract class Vehiculos {
    private final String marca, modelo;
    private final int anioFabricacion;
    private static float ingresoAlquiler;

    public Vehiculos(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                '}';
    }

    public static float getIngresoAlquiler() {
        return ingresoAlquiler;
    }

    public static void setIngresoAlquiler(float ingresoAlquiler) {
        Vehiculos.ingresoAlquiler = Vehiculos.ingresoAlquiler + ingresoAlquiler;
    }
    public abstract float calcularAlquiler(int dias);
}
