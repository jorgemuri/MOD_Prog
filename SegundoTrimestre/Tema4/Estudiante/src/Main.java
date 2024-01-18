import estudiantes.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int indice = 0;
        String nombre;
        String fechaMatriculacion = "";
        boolean salir = false;
        Estudiante[] estudiantes = new Estudiante[5]; // array donde se guardan los estudiantes/objetos

        while(!salir){ // programa
            System.out.println("""
                    AÑADIR ALUMNO: AA
                    VER CANTIDAD ALUMNOS: CA
                    SALIR: EXIT""");
            System.out.print(">>>");
            String respuesta = sc.next();
            respuesta = respuesta.toUpperCase();
            switch (respuesta){
                case "AA" -> {
                    boolean dentro = true;
                    System.out.print("¿Qué nombre tiene el alumno?: "); // pregunto nombre
                    nombre = sc.next();
                    while (dentro){
                        System.out.print("¿Cuál es la fecha de matriculación?(00/00/0000): "); // pregunto fecha matriculación
                        fechaMatriculacion = sc.next();
                        if(tieneBuenFormato(fechaMatriculacion)){
                            dentro = false;
                        }
                        else {
                            System.out.println("Escribe con el siguiente formato: 00/00/0000");
                        }
                    }
                    estudiantes[indice] = new Estudiante(nombre,fechaMatriculacion);
                    indice++;
                }
                case "CA" -> {
                    if(Estudiante.getNumeroEstudiantes() != 0){
                        System.out.printf("\nEl número de estudiantes registrados son %d\n",Estudiante.getNumeroEstudiantes());
                        System.out.println("\nLa información de los estudiantes es la siguiente: ");
                        for(int i = 0; i<Estudiante.getNumeroEstudiantes(); i++){
                            System.out.println(estudiantes[i] + "\n");
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
    private static boolean tieneBuenFormato(String cadena){
        if (cadena.length() == 10 && cadena.charAt(2) == 47 && cadena.charAt(5) == 47 ) { // si la longitud es 10 y están puestas las barras del 7
            return true;
        }
        else {
            return false;
        }
    }
}
