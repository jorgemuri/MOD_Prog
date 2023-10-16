import java.util.Scanner;

public class EscaleraAsteristicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Dime un número: ");
        num = sc.nextInt();

        for (int i = 1;i <= num; i++){
            System.out.print("*");
        }
    }
}
