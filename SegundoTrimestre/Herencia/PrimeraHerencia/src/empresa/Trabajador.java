package empresa;

public class Trabajador {
    private String nombre, puesto, direccion;
    private int telefono, nss;
    private static int totalTrabajadores;

    public Trabajador(String nombre, String puesto, String direccion, int telefono, int nss) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nss = nss;

        totalTrabajadores++;
    }

    public static int getTotalTrabajadores(){
        return totalTrabajadores;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", nss=" + nss +
                '}';
    }
}
