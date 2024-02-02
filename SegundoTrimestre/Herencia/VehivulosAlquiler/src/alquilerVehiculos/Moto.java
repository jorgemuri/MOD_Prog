package alquilerVehiculos;

public class Moto extends Vehiculos{
    private final int cilindrada;

    public Moto(String marca, String modelo, int anioFabricacion, int cilindrada) {
        super(marca, modelo, anioFabricacion);
        this.cilindrada = cilindrada;
    }

    public float calcularAlquiler(int dias){
        if(cilindrada<500){
            return 50 * dias;
        }
        else {
            return 75 * dias;
        }
    }
    @Override
    public String toString() {
        return super.toString()+"Moto{" +
                "cilindrada=" + cilindrada +
                '}';
    }
}
