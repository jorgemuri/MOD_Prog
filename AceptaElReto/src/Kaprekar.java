import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args) {
        int num, num_ordenado_mayor, num_ordenado_menor;
        int i = 9, intentos, num_de_num;
        int c1,c2,c3,c4;
        final int constante_Kaprekar = 6174;
        boolean es_repdigits;
        String num_ordenador_string = "", solucion = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el número de números que vas a meter: ");
        num_de_num = sc.nextInt();

        /*Se ejecute el programa el número de veces dado*/

        while(num_de_num>0){

            /*Pongo algunas variables a su valor inicial*/

            intentos = 0;
            es_repdigits = false;

            System.out.print("Dime un número de 4 cifras que tenga al menos 2 cifras diferentes: ");
            num = sc.nextInt();

            /*Un bucle hasta que llegue a la constante*/

            while(num != constante_Kaprekar && !es_repdigits){

                /*Doy una cifra a cada variable*/

                c1 = num % 10;
                c2 = num / 10 % 10;
                c3 = num / 100 % 10;
                c4 = num / 1000 % 10;

                /*Compruebo si las 4 cifras son iguales*/

                if(c1 == c2 && c1 == c3 && c1 == c4){
                    solucion = solucion + "8";
                    es_repdigits = true;
                }

                if(!es_repdigits){

                    /*Ordeno de mayor a menor*/

                    while(i >= 0){
                        if( i == c1){
                            num_ordenador_string = num_ordenador_string + c1;
                        }
                        if( i == c2){
                            num_ordenador_string = num_ordenador_string + c2;
                        }
                        if( i == c3){
                            num_ordenador_string = num_ordenador_string + c3;
                        }
                        if( i == c4){
                            num_ordenador_string = num_ordenador_string + c4;
                        }
                        i--;
                    }

                    /*Una vez ordenado, lo convierto a un entero para poder operar con el numero.*/

                    num_ordenado_mayor = Integer.parseInt(num_ordenador_string);
                    num_ordenador_string = "";

                    /*Ordeno de menor a mayor*/

                    while(i <= 9){
                        if( i == c1){
                            num_ordenador_string = num_ordenador_string + c1;
                        }
                        if( i == c2){
                            num_ordenador_string = num_ordenador_string + c2;
                        }
                        if( i == c3){
                            num_ordenador_string = num_ordenador_string + c3;
                        }
                        if( i == c4){
                            num_ordenador_string = num_ordenador_string + c4;
                        }
                        i++;
                    }

                    /*Lo convierto a entero*/

                    num_ordenado_menor = Integer.parseInt(num_ordenador_string);
                    num_ordenador_string = "";

                    num = num_ordenado_mayor - num_ordenado_menor;
                    intentos++;
                }
            }

            /*Añado la solución a una string*/
            if (!es_repdigits){
                solucion = solucion + intentos;
            }

            num_de_num--;
        }

        /* Muestro cada carácter de la string "solucion" */

        for (int n = 0; solucion.length() > n; n = n + 1){
            char caracter = solucion.charAt(n);
            System.out.println(caracter);
        }
    }
}
