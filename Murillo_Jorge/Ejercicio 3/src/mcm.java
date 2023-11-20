import java.util.Scanner;

public class mcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, multiplo_n1, multiplo_n2, i = 1;
        String mutiplos_n1 = "", multiplos_n2 = "";
        boolean encontrado = false;

        System.out.print("Dime un número: ");
        n1 = sc.nextInt();
        multiplo_n1 = n1;
        System.out.print("Dime otro número: ");
        n2 = sc.nextInt();
        multiplo_n2 = n2;

        /*Miro si el n2 es múltiplo de n1*/
        if (n2 / n1 == 0){
            System.out.printf("El mcm es %d\n",n2);
        }
        /*Miro si el n1 es múltiplo de n2*/
        else if (n1 / n2 == 0){
            System.out.printf("El mcm es %d\n",n1);
        }
        /*Está sin terminar*/
    }
}
