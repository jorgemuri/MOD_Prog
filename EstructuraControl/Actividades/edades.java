import java.util.Scanner;

/*
Autor: Jorge Murillo
Se busca saber si es mayor de edad y si se tiene edad para trabajar.
 */

public class edades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float edad;

        System.out.print("Dime tu edad porfa: ");
        edad = sc.nextFloat();

        if (edad - (int)edad == 0){
            if (edad < 0 || edad > 120){
                System.out.println("No existes");
            }
            else if (edad >= 18){
                System.out.println("Eres mayor de edad, por lo tanto tienes edad para trabajar");
            }
            else if (edad >= 16 && edad < 18){
                System.out.println("No eres mayor de edad, pero tienes edad de trabajar.");
            }
            else {
                System.out.println("Eres menor de edad sin tener edad suficiente para trabajar");
            }
        }
        else {
            System.out.println("Mete una edad válida.");
        }

    }
}
