package empresa;

public class Empleado extends Trabajador{
    private float sueldo, impuestos;

    public Empleado(String nombre, String puesto, String direccion, int telefono, int nss, float sueldo, float impuestos) {
        super(nombre, puesto, direccion, telefono, nss);
        this.sueldo = sueldo;
        this.impuestos = impuestos;
    }

    public float calcularPaga(){
       return (this.sueldo - (this.sueldo * (this.impuestos/100)));
    }
}
