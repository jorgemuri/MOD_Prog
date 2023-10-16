import java.util.Scanner;

public class diezNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces_positivo = 0;
        int veces_cero = 0;
        int veces_negativo = 0;
        for (int i = 1; i <=10; i++){
            System.out.println("Pon un número: ");
            float num = sc.nextFloat();
            if (num < 0){
                veces_negativo++;
            }
            else if(num == 0){
                veces_cero++;
            }
            else {veces_positivo++;}
        }
        System.out.printf("Has metido %d números positivos, %d números negativos y %d ceros.",veces_positivo,veces_negativo,veces_cero);
    }
}
