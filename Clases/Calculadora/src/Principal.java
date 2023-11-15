import calculadora.Calculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;

        Calculadora calculadora = new Calculadora();
        System.out.println(" 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Factorial \n 6. Inicializar \n 7. Fin");

        while(num < 7 && num > 0){
            System.out.println("¿Dime que operación quieres hacer?: ");
            num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.print("Dime el número para operar con el: ");
                    calculadora.sumar(sc.nextInt());
                    System.out.printf("El resultado es: %d\n", calculadora.getResultado());
                    break;
                case 2:
                    System.out.print("Dime el número para operar con el: ");
                    calculadora.restar(sc.nextInt());
                    System.out.printf("El resultado es: %d\n", calculadora.getResultado());
                    break;
                case 3:
                    System.out.print("Dime el número para operar con el: ");
                    calculadora.multiplicar(sc.nextInt());
                    System.out.printf("El resultado es: %d\n", calculadora.getResultado());
                    break;
                case 4:
                    System.out.print("Dime el número para operar con el: ");
                    calculadora.dividir(sc.nextInt());
                    System.out.printf("El resultado es: %d\n", calculadora.getResultado());
                    break;
                case 5:
                    calculadora.factorial();
                    System.out.printf("El factorial es: %d\n", calculadora.getResultado());
                    break;
                case 6:
                    calculadora.inicializar();
                    break;
                default:
                    break;
            }
        }
        System.out.println("Gracias por usar la calculadora");
    }
}
