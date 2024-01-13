import circulo.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eleccion;
        Circulo[] circulos = new Circulo[10];
        int indice = -1;
        double radio;
        boolean salir = false;
        while (!salir){
            System.out.println("Dime que deseas hacer: \n1.Crear una circunferencia\n2.Saber el área de una circunferencia cualquiera\n3.Seleccionar círculo\n4.Propiedades del circulo seleccionado");
            eleccion = sc.nextInt();
            switch (eleccion){
                case 1 -> {
                    indice++;
                    System.out.println("Dime el rádio de la circunferencia");
                    radio = sc.nextDouble();
                    circulos[indice] = new Circulo(radio);
                }
                case 2 -> {
                    System.out.println("Dime el rádio de la circunferencia");
                    radio = sc.nextDouble();
                    System.out.print("El área de la circunferencia es: " + Circulo.calcularArea(radio) + "\n");
                }
                case 3 ->{
                    System.out.printf("¿Qué círculo quieres elegir? de los %d que has creado?", Circulo.getNumCirculos());
                    indice = sc.nextInt() - 1;
                }
                case 4 ->{
                    System.out.println("Las propiedades de ésta circunferencia son: " + circulos[indice]);
                }

                default -> {
                    System.out.println("El número no es válido");
                    salir = true;
                }
            }
        }

    }
}
