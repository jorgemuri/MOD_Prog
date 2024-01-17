import estudiantes.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroExpediente = 999, indice = 0;
        String nombre;
        String fechaMatriculacion;
        boolean salir = false;
        Estudiante[] estudiantes = new Estudiante[5]; // array donde se guardan los estudiantes/objetos

        while(!salir){ // programa
            System.out.println("""
                    AÑADIR ALUMNO: AA
                    VER CANTIDAD ALUMNOS: CA
                    SALIR: EXIT
                    """);
            System.out.print(">>>");
            String respuesta = sc.next();
            respuesta = respuesta.toUpperCase();
            switch (respuesta){
                case "AA" -> {
                    System.out.print("¿Qué nombre tiene el alumno?: "); // pregunto nombre
                    nombre = sc.next();
                    System.out.print("¿Cuál es la fecha de matriculación?(00/00/0000): "); // pregunto fecha matriculación
                    fechaMatriculacion = sc.next();
                    numeroExpediente++;
                    estudiantes[indice] = new Estudiante(nombre,fechaMatriculacion,numeroExpediente);
                    indice++;
                }
                case "CA" -> {
                    if(estudiantes[0] != null){
                        System.out.printf("\nEl número de estudiantes registrados son %d\n",Estudiante.getNumeroEstudiantes());
                        System.out.println("\nLa información de los estudiantes es la siguiente: ");
                        for (int i = 0; i<estudiantes.length; i++){
                            if(estudiantes[i] != null){
                                System.out.println(estudiantes[i] + "\n");
                            }
                        }
                    }
                    else {
                        System.out.println("ERROR: TIENES QUE AÑADIR UN ALUMNO");
                    }

                }
                case "EXIT" ->{
                    System.out.println("Gracias por usar el programa");
                    salir = true;
                }
                default -> System.out.println("ERROR: COMANDO NO RECONOCIDO");
            }
        }
    }
}
