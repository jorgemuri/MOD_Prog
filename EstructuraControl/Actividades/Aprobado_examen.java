/*
Realizado por Jorge Murillo. Saber si has aprobado o suspendido un examen.
 */
import java.util.Scanner;

public class Aprobado_examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota;

        System.out.print("Dime una nota: ");
        nota = sc.nextFloat();

        if (nota < 0 || nota >10){
            System.out.println("Esa nota no es valida.");
        }
        else if (nota < 5){
            System.out.println("Has suspendido el examen.");
        }
        else{
            System.out.println("Has aprobado el examen.");
        }
    }
}
