import java.util.Scanner;

public class numero_oculto {
    public static void main(String[] args) {


        /*Muestro el menu*/
        menu_opciones();



    }

    private static void menu_opciones(){
        Scanner sc = new Scanner(System.in);

        int numInt = 0, numMax = 0;

        /*Menú de opciones*/
        System.out.println("OPCIONES DEL JUEGO: \n 1. Configurar. \n 2. Jugar. \n 3. Salir.");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.print("Dime el número de intentos: ");
                numInt = sc.nextInt();
                System.out.print("Dime el número máximo para generar: ");
                numMax = sc.nextInt();
                juego(numMax,numInt);
                break;
            case 2:
                /*Compruebo si está configurado*/
                if (numInt == 0 && numMax == 0){
                    System.out.println("El juego aun no está configurado");
                    menu_opciones();
                }
                else {
                    juego(numMax,numInt);
                }
                break;
            case 3:
                System.out.println("Gracias por jugar el juego");
                break;
            default: break;
        }
    }
    private static void juego(int numMax,int numInt){
        Scanner sc = new Scanner(System.in);

        int num = 0, intentos = 0;
        boolean intentosON = true;
        int numOculto = (int) ((Math.random() * numMax) + 1);
        while (intentosON && num != numOculto){
            numInt--;
            if (numInt == 0){
                intentosON = false;
            }
            intentos++;
            System.out.print("Dime un número: ");
            num = sc.nextInt();
            if(num == numOculto){
                System.out.printf("¡Has acertado! \n\n Has gastado: %d intentos\n\n", intentos);
                menu_opciones();
            }
            else {
                if(num > numOculto){
                    System.out.println("El número oculto es más pequeño.");
                }
                else{
                    System.out.println("El número oculto es más grande");
                }
                if(numInt == 0){
                    System.out.println("¡Perdiste! Has agotado todos tus intentos permitidos.");
                    menu_opciones();
                }
            }

        }
    }
}
