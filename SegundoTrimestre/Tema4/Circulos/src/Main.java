import circulo.Circulo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eleccion = 0;
        Circulo[] circulos = new Circulo[10];
        int indice = -1;
        double radio;
        boolean salir = false;
        while (!salir){
            System.out.println("Dime que deseas hacer: \n1.Crear una circunferencia\n2.Saber el área de una circunferencia cualquiera\n3.Seleccionar círculo\n4.Propiedades del circulo seleccionado");
            eleccion = comprobarDatoEntero(sc);
            switch (eleccion){
                case 1 -> {
                    indice++;
                    System.out.println("Dime el rádio de la circunferencia");
                    radio = comprobarDato(sc);
                    circulos[indice] = new Circulo(radio);
                }
                case 2 -> {
                    System.out.println("Dime el rádio de la circunferencia");
                    radio = comprobarDato(sc);
                    System.out.print("El área de la circunferencia es: " + Circulo.calcularArea(radio) + "\n");
                }
                case 3 ->{
                    System.out.printf("¿Qué círculo quieres elegir? de los %d que has creado?\n", Circulo.getNumCirculos());
                    for (int i = 0; i < Circulo.getNumCirculos(); i++){
                        System.out.printf("El circulo numero %d tiene estas propiedades ",i);
                        System.out.println(circulos[i]);
                        System.out.println();
                    }
                    System.out.print("Elige uno: ");
                    indice = comprobarDatoEntero(sc) - 1;
                }
                case 4 ->{
                    if(circulos.length != 0){
                        System.out.println("Las propiedades de ésta circunferencia son: " + circulos[indice]);
                        System.out.println("""
                                !
                                !
                                !
                                """);
                        System.out.println("Las propiedades de todas las circunferencias son: ");
                        for (int i = 0; i < Circulo.getNumCirculos(); i++){
                            System.out.printf("El circulo numero %d tiene estas propiedades ",i);
                            System.out.println(circulos[i]);
                            System.out.println();
                        }
                    }
                    else {
                        System.out.println("Crea un círculo primero.");
                    }
                }

                default -> {
                    System.out.println("El número no es válido");
                    salir = true;
                }
            }
        }

    }
    private static double comprobarDato(Scanner sc){
        boolean salir = false;
        double dato = 0;
        while (!salir){
            try {
                System.out.print(">>>");
                dato = sc.nextDouble();
                salir = true;
            }
            catch (InputMismatchException e){
                System.out.println("Escribe un número, chorizo");
                sc.nextLine();
            }
        }
        return dato;
    }
    private static int comprobarDatoEntero(Scanner sc){
        boolean salir = false;
        int dato = 0;
        while (!salir){
            try {
                System.out.print(">>>");
                dato = sc.nextInt();
                salir = true;
            }
            catch (InputMismatchException e){
                System.out.println("Escribe un número entero por favor :)");
                sc.nextLine();
            }
        }
        return dato;
    }
}
