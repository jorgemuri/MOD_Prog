package personal;

public class Profesor extends Persona{
    private String especialidad;
    private static int totalProfesores;

    public Profesor(String nombre, String dni, String especialidad) {
        super(nombre, dni);
        this.especialidad = especialidad;
        totalProfesores++;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Especialidad: " + especialidad);
    }

    public static int getTotalProfesores() {
        return totalProfesores;
    }
}
