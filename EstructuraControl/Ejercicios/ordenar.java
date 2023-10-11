import java.util.Scanner;

public class ordenar {
    public static void main(String[] args) {
        float n1;
        float n2;
        float n3;
        int mayor ;
        int medio ;
        int menor ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un número entero: ");
        n1 = sc.nextFloat();
        System.out.print("Dime otro número entero: ");
        n2 = sc.nextFloat();
        System.out.print("Dime el último número entero: ");
        n3 = sc.nextFloat();
        //Compruebo si son iguales alguno de los numeros dados.
        if (n1 == n2 || n2 == n3 || n1 == n3){
            System.out.println("Indroduce datos que no sean iguales.");
        }
        //Compruebo si todos ellos
        else if (n1 - (int)n1 == 0 && n2 - (int)n2 == 0 && n3 - (int)n3 == 0){

            //miro si el número 1 es el mayor.

            if (n1 > n2 && n1 > n3){
                 mayor = (int)n1;
                 if (n2 > n3){
                     medio = (int)n2;
                     menor = (int)n3;
                 }
                 else{
                     medio = (int)n3;
                     menor = (int)n2;
                 }
            }

            //miro si número 2 es el mayor.

            else if (n2 > n3) {
                mayor = (int)n2;
                if (n3 > n1){
                    medio = (int)n3;
                    menor = (int)n1;
                }
                else{
                    medio = (int)n1;
                    menor = (int)n3;
                }
            }

            //Aquí tiene que ser el mayor el número 3

            else{
                mayor = (int)n3;
                if (n2 > n1){
                    medio = (int)n2;
                    menor = (int)n1;
                }
                else {
                    medio = (int)n1;
                    menor = (int)n2;
                }
            }
            System.out.printf("%d > %d > %d",mayor,medio,menor);
        }
        else{
            System.out.println("Dame valores enteros.");
        }
    }
}