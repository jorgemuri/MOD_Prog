import java.util.Scanner;

public class calificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota;

        System.out.print("Dime la nota de tu examen: ");
        nota = sc.nextFloat();


        switch ((int)nota){
            case 0:
                System.out.println("Suspenso");
                break;
            case 1:
                System.out.println("Suspenso");
                break;
            case 2:
                System.out.println("Suspenso");
                break;
            case 3:
                System.out.println("Suspenso");
                break;
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Suficiente");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Tu nota no es válida");
        }
    }
}
