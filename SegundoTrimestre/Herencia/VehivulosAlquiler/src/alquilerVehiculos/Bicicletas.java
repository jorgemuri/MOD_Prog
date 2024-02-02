package alquilerVehiculos;

public class Bicicletas extends Vehiculos{
    public Bicicletas(String marca, String modelo, int anioFabricacion) {
        super(marca, modelo, anioFabricacion);
    }
    public float calcularAlquiler(int dias){
        float alquiler = 0.00f;
        for (int i = 1; i <= dias; i++){
            if (i <= 3){
                alquiler = alquiler + 15;
            }
            else {
                alquiler = alquiler + 10;
            }
        }
        return alquiler;
    }
}
