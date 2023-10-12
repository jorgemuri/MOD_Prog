import java.util.Scanner;

public class Ordenar_compacto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1;
        float n2;
        float n3;
        int peque;
        int medio;
        int mayor;

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

            //miro el pequeño
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
    }
}

/*
2   4   6
  2
     2
 */