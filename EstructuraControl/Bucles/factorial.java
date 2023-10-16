import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int operacion;

        System.out.print("Dime un número: ");
        num = sc.nextInt();
        operacion = num;

        while (num >1) {
            operacion = operacion * (num - 1);
            num = num - 1;
        }
        System.out.printf("El factorial es: %d",operacion);
    }
}
