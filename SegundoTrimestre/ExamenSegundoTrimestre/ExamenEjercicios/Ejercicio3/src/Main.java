import personal.Estudiante;
import personal.Persona;
import personal.Profesor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona[] personas = new Persona[10];

        boolean salir = false;
        while (!salir){
            int respuesta = mostrarMenu();
            switch (respuesta){
                case 1:
                    inscribirPersona(personas, Persona.getTotalPersonas());
                    break;
                case 2:
                    matricularAsignatura(personas);
                    break;
                case 3:
                    System.out.printf("El numero total de estudiantes es %d y de profesores es %d.\n",Estudiante.getTotalEstudiantes(),Profesor.getTotalProfesores());
                    break;
                case 4:
                    mostrarDatosPersona(personas);
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa.");
                    salir=true;
                    break;
                default:
                    salir=true;
                    break;
            }
        }
    }
    private static int mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        int respuesta;
        System.out.println("""
                1. Inscribir persona.
                2. Matricular asignatura
                3. Mostrar número de estudiantes y profesores.
                4. Mostrar datos de una persona.
                5. Salir del programa.
                """);
        respuesta = sc.nextInt();
        return respuesta;
    }
    private static void inscribirPersona(Persona[] personas, int indice){
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Dime el nombre de la persona");
        System.out.print(">>>");
        String nombre = sc.next();
        System.out.println("Dime el dni");
        System.out.print(">>>");
        String dni = sc.next();
        System.out.println("Que tipo de persona es:\n1.Profesor. \n2.Estudiante");
        System.out.print(">>>");
        int respuesta = sc.nextInt();
        if (respuesta==1){//profesor
            System.out.println("Dime su especialidad:");
            System.out.print(">>>");
            String especialidad = sc.next();

            personas[indice] = new Profesor(nombre,dni,especialidad);
            System.out.println("Se ha añadido el profesor correctamente");
        }
        else { //alumno
            System.out.println("Dime su etapa: ");
            System.out.print(">>>");
            String etapa = sc.next();

            personas[indice] = new Estudiante(nombre,dni,etapa);
            System.out.println("Se ha añadido el estudiante correctamente");
        }
    }
    private static void matricularAsignatura(Persona[] personas){
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Dime el dni del alumno please");
        System.out.print(">>>");
        String dni = sc.next();
        boolean existe = false;
        for (int i = 0; i< Persona.getTotalPersonas();i++){
            if (personas[i].getDni().equalsIgnoreCase(dni) && personas[i] instanceof Estudiante){
                existe = true;
                System.out.println("Dime el nombre de la asignatura");
                System.out.print(">>>");
                String asignatura = sc.next();
                ((Estudiante) personas[i]).matricular(asignatura);
                System.out.println("Se ha añadido correctamente al estudiante a la asignatura: "+ asignatura);
            }
        }
        if (!existe){
            System.out.println("No existe ningún estudiante con el dni aportado.");
        }
    }
    private static void mostrarDatosPersona(Persona[] personas){
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Dime el dni de la persona please");
        System.out.print(">>>");
        String dni = sc.next();
        boolean existe = false;
        for (int i = 0; i<Persona.getTotalPersonas();i++){
            if (personas[i].getDni().equalsIgnoreCase(dni)){
                existe = true;
                personas[i].mostrarDatos();
            }
        }
        if (!existe){
            System.out.println("No existe ninguna persona con el dni aportado.");
        }
    }
}
