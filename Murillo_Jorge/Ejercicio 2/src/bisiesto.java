import java.util.Scanner;

public class bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;

        System.out.print("Dime un año: ");
        ano = sc.nextInt();

        /*Compruebo si es divisible por 4*/
        if (ano % 4 == 0 && ano % 100 != 0){
            System.out.println("El año es bisiesto");
        }
        else if (ano == 400){
            System.out.println("El año es bisiesto");
        }
        else {
            System.out.println("El año no es bisiesto");
        }
    }
}
