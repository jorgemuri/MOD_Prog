import electronica.Movil;
import electronica.Ordenador;
import electronica.Producto;
import electronica.Televisor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[10]; // creo el array de objetos. Maximo 10
        int respuesta = -1, i = 0;

        System.out.println("BIENVENIDO AL PROGRAMA");

        while (respuesta != 0){
            mostrarMenu();
            System.out.print(">>>");
            respuesta = preguntarEntero(); // muestro menu y pregunto la opción

            switch (respuesta){
                case 1:
                    int respuesta2 = anadirProducto();
                    String marca, modelo, procesador;
                    float precio;
                    int ram, pulgadas, hdd;
                    switch (respuesta2) {
                        case 1: // añade un teléfono móvil.

                            System.out.print("Marca: ");
                            marca = preguntarString();
                            System.out.print("Modelo: ");
                            modelo = preguntarString();
                            System.out.print("Precio: ");
                            precio = preguntarFloat();
                            System.out.print("Procesador: ");
                            procesador = preguntarString();
                            System.out.print("Total RAM: ");
                            ram = preguntarEntero();
                            System.out.print("Pulgadas: ");
                            pulgadas = preguntarEntero();

                            productos[i] = new Movil(marca, modelo, precio, procesador, ram, pulgadas); // creo el teléfono móvil
                            i++; // incremento el índice para que no haya conflicto
                            break;
                        case 2: // añade ordenador
                            System.out.print("Marca: ");
                            marca = preguntarString();
                            System.out.print("Modelo: ");
                            modelo = preguntarString();
                            System.out.print("Precio: ");
                            precio = preguntarFloat();
                            System.out.print("Procesador: ");
                            procesador = preguntarString();
                            System.out.print("Total RAM: ");
                            ram = preguntarEntero();
                            System.out.print("HDD: ");
                            hdd = preguntarEntero();

                            productos[i] = new Ordenador(marca, modelo, precio, procesador, ram, hdd); // creo el ordenador
                            i++; // incremento el índice para que no haya conflicto
                            break;
                        case 3: // añade televisor
                            System.out.print("Marca: ");
                            marca = preguntarString();
                            System.out.print("Modelo: ");
                            modelo = preguntarString();
                            System.out.print("Precio: ");
                            precio = preguntarFloat();
                            System.out.print("Pulgadas: ");
                            pulgadas = preguntarEntero();

                            productos[i] = new Televisor(marca, modelo, precio, pulgadas); // creo el ordenador
                            i++; // incremento el índice para que no haya conflicto
                            break;
                        default:
                            System.out.println("...");
                            break;
                    }
                case 2:
                    System.out.println("Tenemos "+(i + 1) + " productos");
            }

        }

    }
    private static void mostrarMenu(){
        System.out.println("------------------------");
        System.out.println("""
                ¿Qué deseas hacer?
                
                1. Añadir un producto
                2. Numero de productos
                3. Características de todos los productos
                4. Características de un producto concreto
                5. Consultar precio de un producto
                6. Llamar a un número.
                7. Cambiar la RAM de un ordenador.
                8. Cambiar de canal un televisor.
                0. SALIR
                """);
    }
    private static int preguntarEntero(){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean salir = false;
        while (!salir){
            try {
                numero = sc.nextInt();
                salir = true;
            }
            catch (InputMismatchException e){
                System.out.println("ERROR: Mete un número entero");
            }
        }
        return numero;
    }
    private static String preguntarString(){
        Scanner sc = new Scanner(System.in).useDelimiter(";");
        System.out.println("(TIP: Pon \";\" para terminar.)");
        return sc.next();
    }
    private static float preguntarFloat(){
        Scanner sc = new Scanner(System.in);
        float numero = 0;
        boolean salir = false;
        while (!salir){
            try {
                numero = sc.nextFloat();
                salir = true;
            }
            catch (InputMismatchException e){
                System.out.println("ERROR: Mete un número válido. Recuerda que es con ,");
            }
        }
        return numero;
    }
    private static int anadirProducto(){
        System.out.println("Que producto quieres añadir?");
        System.out.println("""
                1. Móvil
                2. Ordenador
                3. Televisor
                4. Volver
                """);
        System.out.print(">>>");
        return preguntarEntero();
    }
}
