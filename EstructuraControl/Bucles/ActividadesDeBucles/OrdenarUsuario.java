import java.util.Scanner;

public class OrdenarUsuario {
    public static void main(String[] args) {
        int i, decremento,minimo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un número entero para medianamente alto: ");
        i = sc.nextInt();
        System.out.print("Dime un número entero pequeño:  ");
        minimo = sc.nextInt();
        System.out.print("Dime un número entero como diferencia: ");
        decremento = sc.nextInt();

        if (minimo > i){
            System.out.println("El primer número tiene que ser más grande que el segundo.");
        }
        else{
            while (i >= minimo){
                System.out.printf("%d \n",i);
                i = i - decremento;
            }
        }
    }
}
