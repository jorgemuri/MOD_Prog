import java.util.Scanner;

public class EscaleraAsteristicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,numasteriscos;

        System.out.println("Dime un número: ");
        num = sc.nextInt();
        numasteriscos = 1;
        for (int i = 1;i <= num; i++){
            for (int n = 1; n <= numasteriscos; n++){
                System.out.print("*");
            }
            System.out.println("");
            numasteriscos++;
        }
    }
}