import Restaurante.Restaurantes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre_restaurante = "";
        int numero_mesas;

        // pregunto el número de restaurantes en el que quiere el cliente
        System.out.println("Dime el número de restaurantes: ");
        int numero_restaurantes = sc.nextInt();
        //creo el array de restaurantes
        Restaurantes[] restaurantes = new Restaurantes[numero_restaurantes];

        //pongo nombre, elijo el número de mesas y creo cada restaurante
        for (int i = 0; i < numero_restaurantes; i++){
            System.out.printf("Dime el nombre del %d restaurante: ", i+1);
            nombre_restaurante = sc.next();
            System.out.printf("Dime el número de mesas que tiene %s: ", nombre_restaurante);
            numero_mesas = sc.nextInt();

            //creo cada objeto en el array
            restaurantes[i] = new Restaurantes(nombre_restaurante, numero_mesas);
        }

    }
}
