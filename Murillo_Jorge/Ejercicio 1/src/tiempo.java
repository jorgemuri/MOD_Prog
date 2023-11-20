import java.util.Scanner;

public class tiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos;

        System.out.print("Dime unos segundos concretos sin decimales: ");
        segundos = sc.nextInt();

        /*Horas*/
        System.out.printf("%d segundos son %d horas, %d minutos y %d segundos .\n", segundos, (segundos / 3600), (segundos % 3600)/60,(segundos % 3600)%60);
        /*minutos*/
        System.out.printf("%d segundos son %d minutos.\n", segundos, (segundos / 60));
    }
}
