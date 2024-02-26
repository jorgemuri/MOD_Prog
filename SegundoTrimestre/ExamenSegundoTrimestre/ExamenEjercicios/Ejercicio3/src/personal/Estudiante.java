package personal;

public class Estudiante extends Persona{
    private String etapa, asignatura;
    private static int totalEstudiantes;

    public Estudiante(String nombre, String dni, String etapa) {
        super(nombre, dni);
        this.etapa = etapa;
        totalEstudiantes++;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Etapa: "+ etapa);
        System.out.println("Asignatura: "+asignatura);
    }
    public void matricular(String asignatura){
    this.asignatura = asignatura;
    }

    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }
}
