import java.util.Scanner;

public class Par_impar {
    public static void main(String[] args) {
        float num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un número: ");
        num = sc.nextFloat();

        if (num - (int)num != 0){
            System.out.println("El número no es entero.");
        }
        else if (num == 0){
            System.out.println("El 0 no es par ni impar");
        }
        else if (num % 2 == 0){
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }
    }
}
