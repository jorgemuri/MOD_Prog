import java.util.Scanner;
import java.lang.String;

public class JuegosCintas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean dentro = true, cabe = true;

        while (dentro){
            String cadena = sc.nextLine();
            if (cadena == ""){
                dentro = false;
            }
            else{
                String[] cadena_array = cadena.split(" ");

                int capacidad = Integer.parseInt(cadena_array[0]);
                int num_juegos = Integer.parseInt(cadena_array[1]);

                int capacidad_cara1 = capacidad, capacidad_cara2 = capacidad;

                while (num_juegos>0){
                    int capacidad_juego = sc.nextInt();
                    if (capacidad_juego <= capacidad_cara1){
                        //Entra en la cara 1
                        capacidad_cara1 = capacidad_cara1 - capacidad_juego;
                    }
                    else if(capacidad_juego <= capacidad_cara2){
                        capacidad_cara2 = capacidad_cara2 - capacidad_juego;
                    }
                    else{
                        cabe = false;
                    }
                    num_juegos--;
                }
                if (!cabe){
                    System.out.println("NO");
                }
                else {
                    System.out.println("SI");
                }
            }
        }
    }
}
