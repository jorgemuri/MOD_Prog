import java.util.Scanner;

public class Par_impar {
    public static void main(String[] args) {
        float num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un número: ");
        num = sc.nextFloat();

        //compruebo si el número es entero
        if (num - (int)num != 0){
            System.out.println("El número no es entero.");
        }
        //miro si el número introducido es 0
        else if (num == 0){
            System.out.println("El 0 no es par ni impar");
        }
        //miro si es par
        else if (num % 2 == 0){
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }
    }
}
