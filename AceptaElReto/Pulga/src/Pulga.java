import java.util.Scanner;

public class Pulga {
    public static void main(String[] args) {
        int n = 0, F = 0, t = 0, f = 0, casos_prueba;
        Scanner sc = new Scanner(System.in);

        casos_prueba = sc.nextInt();

        while(casos_prueba > 0){
            n = sc.nextInt();
            f = sc.nextInt();
            t = sc.nextInt();

            F = (t % (n + 1)) * f;

            System.out.print(F + "\n");
            casos_prueba--;
        }
    }
}
