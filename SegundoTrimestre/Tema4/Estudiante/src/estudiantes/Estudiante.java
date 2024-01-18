package estudiantes;

public class Estudiante {
    //atrbutos
    private String nombre, fechaMatriculacion;
    private int numeroExpediente;
    private static int numeroEstudiantes, nextNexpediente = 1000;

    //fin de atributos


    //métodos
    public Estudiante(String nombre, String fechaMatriculacion) {
        this.nombre = nombre;
        this.fechaMatriculacion = fechaMatriculacion;
        this.numeroExpediente = nextNexpediente;
        nextNexpediente++;
        numeroEstudiantes++;
    }
    //fin métodos

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", fechaMatriculacion='" + fechaMatriculacion + '\'' +
                ", numeroExpediente=" + numeroExpediente +
                '}';
    }

    public static int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }
}
