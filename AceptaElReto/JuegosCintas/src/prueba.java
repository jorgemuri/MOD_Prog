import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intentos = 2;
        while(intentos > 0){
            int hola = sc.nextInt();
            System.out.println(hola);
            intentos --;
        }

    }
}
