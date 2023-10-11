/*
Realizado por Jorge Murillo. Este programa te da una calificación dependiendo de la nota sacada.
*/
import java.util.Scanner;

public class calificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota;

        System.out.print("Dime la nota de tu examen: ");
        nota = sc.nextFloat();


        switch ((int)nota){
            case 0,1,2,3,4:
                System.out.println("Suspenso");
                break;
            case 5,6:
                System.out.println("Suficiente");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Tu nota no es válida");
        }
    }
}
