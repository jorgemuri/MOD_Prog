import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Asig_prim_hora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mayus = false;
        List letras_mayusculas = new ArrayList<>();
        for (char letra = 'A'; letra <='Z'; letra++){
            letras_mayusculas.add(letra);
        }

        System.out.print("Dime un dia de la semana, con todas las letras en minúscula: ");
        String cadena = sc.next();

        for (int letra = 0; letra < cadena.length(); letra++){
            char caracter = cadena.charAt(letra);
            if (letras_mayusculas.contains(caracter)){
                System.out.println("Escribe en minuscula");
                mayus = true;
            }
        }

        if (mayus == false){
            switch (cadena){
                case "lunes":
                    System.out.println("Base de datos.");
                    break;
                case "martes":
                    System.out.println("Sistemas informáticos.");
                    break;
                case "miercoles":
                    System.out.println("Base de datos");
                    break;
                case "jueves":
                    System.out.println("Sistemas informático");
                    break;
                case "viernes":
                    System.out.println("Base de Datos");
                    break;
                default:
                    System.out.println("Escribe unicamente letras");
            }
        }
    }
}