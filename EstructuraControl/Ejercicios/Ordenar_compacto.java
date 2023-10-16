import java.util.Scanner;

public class Ordenar_compacto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1,n2,n3;
        int peque,medio,mayor;
        int num1,num2,num3,aux;

        System.out.print("Dime un número: ");
        n1 = sc.nextFloat();
        System.out.print("Dime otro número: ");
        n2 = sc.nextFloat();
        System.out.print("Dime el último número: ");
        n3 = sc.nextFloat();
        if (n1 == n2 || n2 == n3 || n1 == n3){
            System.out.println("Mete números diferentes.");
        }
        else if(n1 - (int)n1 == 0 || n2 - (int)n2 == 0 || n3 - (int)n3 == 0){

            if(n1 < n2){
                peque= (int)n1;
                medio = (int)n2;
                if (peque > n3){
                    medio = peque;
                    peque = (int)n3;
                }
                else if (medio > n3){
                    medio = (int)n3;
                }
            }
            else {
                peque = (int)n2;
                medio = (int)n1;
                if (peque > n3){
                    medio = peque;
                    peque = (int)n3;
                }
                else if (medio > n3) {
                    medio = (int)n3;
                }
            }
            if ((int)n1 != medio && (int)n1 != peque){
                mayor = (int)n1;
            }
            else if ((int)n2 != medio && (int)n2 != peque){
                mayor = (int)n2;
            }
            else{
                mayor = (int)n3;
            }
            System.out.printf("%d > %d > %d", mayor,medio,peque);
        }
        else{
            System.out.println("Pon números enteros.");
        }

        //Más compacto aún.
        System.out.print("Dime un numero:");
        num1 = sc.nextInt();
        System.out.print("Dime un numero:");
        num2 = sc.nextInt();
        System.out.print("Dime un numero:");
        num3 = sc.nextInt();

        if(num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if(num1 > num3){
            aux = num1;
            num1 = num3;
            num3 = aux;
        }
        if(num2 > num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        System.out.printf("%d > %d > %d",num3,num2,num1);
    }
}