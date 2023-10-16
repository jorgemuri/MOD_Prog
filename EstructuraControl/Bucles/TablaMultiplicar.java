import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float numero;

        System.out.print("Dime un número entero: ");
        numero = sc.nextFloat();
        if (numero - (int)numero !=0){
            System.out.print("Tiene que ser un número entero.");
        }
        else{
            for (int i = 1; i <= 20; i++){
                System.out.printf("%d * %d = %d\n", (int)numero, i, (int)numero*i);
            }
        }
    }
}
