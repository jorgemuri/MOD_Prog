import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Escribe un número:");
            array[i] = sc.nextInt();
        }
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
