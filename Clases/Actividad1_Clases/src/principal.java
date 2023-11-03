import persona.Persona;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Variables*/
        String nombre1= "Pedro";
        String nombre2 = "Luis";
        int dni1, dni2, cambiar_nombre;
        final int anionacimiento1 = 1998, anionacimiento2 = 2009;

        /*Pido DNI*/

        System.out.print("Dime el DNI de Pedro sin letra: ");
        dni1 = sc.nextInt();
        System.out.print("Dime el DNI de Luis sin letra: ");
        dni2 = sc.nextInt();



        /*Creo los 2 objetos*/
        Persona p1 = new Persona(nombre1, "Pérez", dni1, anionacimiento1);
        Persona p2 = new Persona(nombre2, "León",dni2, anionacimiento2);


        /*Compruebo si es mayor de edad, y le doy la opción de cambiar de nombre a los mayores de 18*/
        if (p1.getEdad() < 18){
            System.out.println("No puedes cambiar el nombre de la primera persona");
        }
        else{
            System.out.println("Si quieres cambiar el nombre de la persona 1, pulsa 1");
            cambiar_nombre = sc.nextInt();
            if (cambiar_nombre == 1){
                System.out.println("Dime el nuevo nombre: ");
                nombre1 = sc.next();
                p1.cambiarnombre(nombre1);
            }
            else{
                System.out.println("Perfecto");
            }
        }
        if (p2.getEdad() < 18){
            System.out.println("No puedes cambiar el nombre de la segunda persona.");
        }
        else{
            System.out.println("Si quieres cambiar el nombre de la persona 2, pulsa el 1");
            cambiar_nombre = sc.nextInt();
            if (cambiar_nombre == 1){
                System.out.println("Dime el nuevo nombre: ");
                nombre1 = sc.next();
                p1.cambiarnombre(nombre1);
            }
            else{
                System.out.println("Perfecto");
            }
        }

        /*Llamo al método toString de cada objeto*/
        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}
