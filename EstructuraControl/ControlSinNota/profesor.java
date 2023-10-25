import java.util.Scanner;

public class profesor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, i, resto, aux;
        boolean encontrado = false;
        String siaparece="", noaparece="";

        System.out.print("Dame un número entero: ");
        numero = sc.nextInt();

        aux = numero;

        for (i = 0; i<=9;i++){
            numero = aux;
            while(numero != 0 && !encontrado){
                //compruebo si la última cifra del número es igual a la variable int i
                resto = numero % 10;
                if (i == resto){
                    encontrado = true;
                }
                //voy haciendo que el número vaya teniendo una cifra menos ej: 374 --> 37 --> 3 --> 0
                else{numero = numero / 10;}
            }
            //concateno para almacenar en la string el número que si aparece o no aparece.
            if (encontrado){
                siaparece = siaparece + i + " ";
                encontrado = false;
            }
            else{
                noaparece = noaparece + i + " ";
            }
        }
        System.out.println("Las cifras que si aparecen son: " + siaparece);
        System.out.print("Las cifras que no aparecen son: " + noaparece);
    }
}
