import java.util.Scanner;

public class numeromisterioso {
    public static void main(String[] args) {
        int intentos = 5;
        int num = 0;
        int num_misterioso = (int) (Math.random() * 30) + 1;
        Scanner sc = new Scanner(System.in);

        while(intentos > 0){
            System.out.println("Dime un número:");
            num = sc.nextInt();
            if (num > num_misterioso){
                System.out.println("El número es menor");
            }
            else if (num < num_misterioso){
                System.out.println("El número es mayor");
            }
            else{
                System.out.println("HAS ACERTADO");
                break;
            }
            if (intentos == 1){
                System.out.printf("Vaya, el número era el %d",num_misterioso);
            }
            intentos--;
        }
    }
}
