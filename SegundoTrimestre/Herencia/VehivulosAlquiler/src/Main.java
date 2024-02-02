import alquilerVehiculos.*;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Vehiculos[] vehiculos = new Vehiculos[8];

        /* Creo los dos vehículos de cada tipo */
        vehiculos[0] = new Coche("Mercedes","G-ClaseA",2022,3);
        vehiculos[1] = new Coche("Audi","A4",2020,5);
        vehiculos[2] = new Moto("Honda","CBR650R",2021,649);
        vehiculos[3] = new Moto("Honda","CB500F",2019,471);
        vehiculos[4] = new CocheAltaGama("Rolls-Royce","Phantom",2015,4);
        vehiculos[5] = new CocheAltaGama("Ferrari","812 Superfast",2014,2);
        vehiculos[6] = new Bicicletas("Specialized","Roubaix",2020);
        vehiculos[7] = new Bicicletas("Trek", "Domane", 2021);

        System.out.println("BIENVENIDO AL PROGRAMA");
        System.out.println("****************************");
        boolean salir = false;
        while (!salir){
            switch (mostrarMenu(sc)){
                case 1:
                    alquilar(vehiculos,sc,"coche",0);
                    break;
                case 2:
                    alquilar(vehiculos,sc,"coche alta gama",4);
                    break;
                case 3:
                    alquilar(vehiculos,sc,"moto",2);
                    break;
                case 4:
                    alquilar(vehiculos,sc,"bichicleta",6);
                    break;
                case 5:
                    System.out.println("----------------------");
                    System.out.printf("El ingreso total de la empresa es: %.2f€\n", Vehiculos.getIngresoAlquiler());
                    System.out.println("----------------------");
                    break;
                case 6:
                    salir = true;
                    break;
            }
        }
        System.out.println("GRACIAS POR USAR EL PROGRAMA"); // finaliza el programa

    }
    /* Creo el menú */
    private static int mostrarMenu(Scanner sc) {
        boolean salir = false;
        int respuesta = 1;
        System.out.println("""
                Alquilar coche -> 1
                Alquilar coche alta gama -> 2
                Alquilar moto -> 3
                Alquilar bicibleta -> 4
                Calcular ingreso total alquiler de la empresa -> 5
                SALIR -> 6
                """);
        while (!salir){
            try {
                respuesta = sc.nextInt();
                if (respuesta > 0 && respuesta <= 6){
                    salir = true;
                }
                else {
                    System.out.println("Pon un número en el intervalo válido");
                }

            }
            catch (InputMismatchException e){
                System.out.println("ERROR: Debes ingresar un número entero.");
            }
        }
        return respuesta;

    }
    private static int preguntarEntero(Scanner sc){
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
    private static void alquilar(Vehiculos[] vehiculos, Scanner sc, String tipo,int indice){
        System.out.println("Los "+tipo+" que tenemos son: "); // muestro los vehiculos de ese tipo que tenemos
        System.out.println("------------------------------");
        int numeroAux = 0;
        for (int i = indice; i < (indice+2); i++){
            System.out.println(numeroAux+": ");
            System.out.println(vehiculos[i]);
            numeroAux++;
        }
        System.out.println("------------------------------");
        System.out.print("¿Qué "+tipo+" quieres?: (0 o 1)");
        int identificadorCoche = preguntarEntero(sc); // guardo el vehiculo que elige
        if(identificadorCoche == 0){
            identificadorCoche = indice;
        }
        else {
            identificadorCoche = indice+1;
        }
        System.out.print("¿Cuántos días quieres el vehículo?: ");
        int dias = preguntarEntero(sc); // guardo los dias
        System.out.printf("El presupuesto es de: %.2f\n",vehiculos[identificadorCoche].calcularAlquiler(dias));
        System.out.println("¿Confirmas?: (1 -> si. 2 -> no.)  ");
        int confirmar = preguntarEntero(sc);
        if (confirmar == 1){
            Vehiculos.setIngresoAlquiler(vehiculos[identificadorCoche].calcularAlquiler(dias));
            System.out.println("Se ha confirmado con exito.");
        }
        else {
            System.out.println("Se ha rechazado");
        }
        System.out.println("||||||||||||||||||||||||||||||||");
    }
}
