package empresa;

public class Consultor extends  Trabajador{
    private int horas;
    private float tarifas;

    public Consultor(String nombre, String puesto, String direccion, int telefono, int nss, int horas, float tarifas) {
        super(nombre, puesto, direccion, telefono, nss);
        this.horas = horas;
        this.tarifas = tarifas;
    }

    public float calcularPaga(){
        return (horas * tarifas);
    }

    @Override
    public String toString() {
        return super.toString() +"Consultor{" +
                "horas=" + horas +
                ", tarifas=" + tarifas +
                '}';
    }
}
