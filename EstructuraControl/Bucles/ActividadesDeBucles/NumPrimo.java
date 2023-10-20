import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        int num;
        int i = 2;
        boolean es_primo = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un número entero menor de 100: ");
        num = sc.nextInt();
        if (num > 100){
            System.out.println("Dime un número más pequeño");
        }
        else {
            for ( i = 2; i <= 100; i++){
            //while(i <= 100){
               //si llega al mismo número que cierre el bucle.
                if (i == num){
                    break;
                }
                //si es divisible por algun número que no sea 1, entonces no es primo.
                else {
                   if (num % i == 0){
                       es_primo = false;
                       break;
                   }
                }
                i++;
            }
            if(es_primo){
                System.out.println("Es primo");
            }
            else{
                System.out.println("No es primo");
            }
        }
    }
}
