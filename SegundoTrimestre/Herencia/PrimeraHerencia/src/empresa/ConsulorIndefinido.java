package empresa;

public class ConsulorIndefinido extends Consultor{
    private float impuestos;

    public ConsulorIndefinido(String nombre, String puesto, String direccion, int telefono, int nss, int horas, float tarifas, float impuestos) {
        super(nombre, puesto, direccion, telefono, nss, horas, tarifas);
        this.impuestos = impuestos;
    }
    public float calcularPaga(){
        return (super.calcularPaga() * (impuestos/100));
    }
}
