import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = 0;
        float[] temperatura = new float[12];

        for (int i = 0; i < 11; i++){
            mes++;
            System.out.printf("Dime la temperatura media del mes 0%d", mes);
            temperatura[i] = sc.nextFloat();

        }


    }
}
