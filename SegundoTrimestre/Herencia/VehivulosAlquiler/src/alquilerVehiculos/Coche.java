package alquilerVehiculos;

public class Coche extends  Vehiculos{
    private final int numeroPuertas;

    public Coche(String marca, String modelo, int anioFabricacion, int numeroPuertas) {
        super(marca, modelo, anioFabricacion);
        this.numeroPuertas = numeroPuertas;
    }
    public float calcularAlquiler(int dias){
        if(numeroPuertas <= 3){
            return (60 * dias);
        } else{
            return (70 * dias);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Coche{" +
                "numeroPuertas=" + numeroPuertas +
                '}';
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
