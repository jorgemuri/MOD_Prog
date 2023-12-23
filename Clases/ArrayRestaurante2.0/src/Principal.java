import Restaurante.Restaurantes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre_restaurante = "";
        int numero_mesas;
        boolean dentro = true;

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
        while (dentro){
            //pregunto para que restaurante van a hacer la iteración
            System.out.println("¿Para cual de los restaurantes quieres pedir mesa?");
            for(int i = 0; i < restaurantes.length; i++){
                System.out.println((i + 1) + " - " + restaurantes[i].getNombre_restaurante());
            }
            //guardo la id del Restaurante
            System.out.println("(Pon el número)");
            int idRestaurante = sc.nextInt();
            idRestaurante = idRestaurante-1;

            //muestro como van las mesas
            restaurantes[idRestaurante].mostrarmesas();

            //pregunto el número de personas
            System.out.println("\n¿Cuántas personas sois? (pon -1 para finalizar): ");
            int n_personas = sc.nextInt();
            //miro si se quiere salir o no
            if(n_personas != -1){
                if (n_personas > 4 || n_personas < 0){
                    System.out.printf("Lo siento, no admitimos grupos de %d, haga grupos de 4 personas como máximo e inténtelo de nuevo", n_personas);
                }
                else if(n_personas == 0){
                    System.out.println("FUERA FANTASMA");
                }
                else{
                    int mesaN = restaurantes[idRestaurante].buscarmesa(n_personas);
                    if (mesaN == 0){
                        System.out.println("Lo siento, en estos momentos no queda sitio.");
                    }
                    else{
                        if(mesaN < 100){
                            System.out.printf("Sientate en la mesa número %d\n\n", mesaN);
                            restaurantes[idRestaurante].mostrarmesas();
                        }
                        else {
                            mesaN = mesaN - 100;
                            System.out.printf("Tendrás que compartir mesa, por favor, sientate en la mesa número %d\n\n",mesaN);
                            restaurantes[idRestaurante].mostrarmesas();
                        }
                    }
                }
            }
            else {
                dentro = false;
            }

        }
    }
}
