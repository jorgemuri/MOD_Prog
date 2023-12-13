import restaurante.Mesas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mesas restaurante = new Mesas();
        int num;

        do {
            restaurante.mostrarmesas();
            System.out.println("¿Cuántos son?: (Introduzca -1 para salir) ");
            num = sc.nextInt();
            if(num == 0){
                System.out.println("FUERA BOT");
            }
            if(num != -1){
                if (num > 4 || num < 0){
                    System.out.printf("Lo siento, no admitimos grupos de %d, haga grupos de 4 personas como máximo e inténtelo de nuevo", num);
                }
                else{
                    int numero_mesa = restaurante.buscarmesa(num);
                    if (numero_mesa == 0){
                        System.out.println("Lo siento, en estos momentos no queda sitio.");
                    }
                    else{
                        if(numero_mesa < 100){
                            System.out.printf("Sientate en la mesa número %d\n", numero_mesa);
                        }
                        else {
                            numero_mesa = numero_mesa - 100;
                            System.out.printf("Tendrás que compartir mesa, por favor, sientate en la mesa número %d\n",numero_mesa);
                        }
                    }
                }
            }
            else {
                System.out.println("Hasta pronto");
            }
        }
        while(num != -1);

    }
}
