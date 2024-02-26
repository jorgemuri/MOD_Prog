package personal;

public class Persona {
    private String nombre, dni;
    private static int totalPersonas;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        totalPersonas++;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: "+ dni);
    }

    public String getDni() {
        return dni;
    }

    public static int getTotalPersonas() {
        return totalPersonas;
    }
}
