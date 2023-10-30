/*
* Autor: Jorge Murillo Carrera
* En esta práctica, creo dos personas, y les doy unas características que cambio después. */

import humano.Persona;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distancia;
        float peso;

        /* Creo la primera persona.*/

        Persona person = new Persona("Dani");

        System.out.print("Dime la distancia que va a recorrer la primera persona: ");
        distancia = sc.nextFloat();
        person.caminar(distancia);

        System.out.print("Dime el peso que va a aumentar la primera: ");
        peso = sc.nextFloat();
        person.engordar(peso);

        /*Creo la segunda persona.*/

        Persona person2 = new Persona("María");

        System.out.print("Dime la distancia que va a recorrer la segunda persona: ");
        distancia = sc.nextFloat();
        person2.caminar(distancia);

        System.out.print("Dime el peso que va a aumentar la segunda persona: ");
        peso = sc.nextFloat();
        person2.engordar(peso);

        /* Le pido de nuevo cuanto va a recorrer la persona 1 */

        System.out.print("¿Cuánto va a recorrer de nuevo la primera persona?: ");
        distancia = sc.nextFloat();
        person.caminar(distancia);

        /* Muestro los datos de las dos personas */

        System.out.println("\nLos datos de la primera persona son: \n Nombre: "+ person.getNombre() + "\n Peso: "+ person.getPeso() + "kg \n Recorrido: "+ person.getRecorrido() + "km \n Edad: "+ person.getEdad() + " años");

        System.out.println("\nLos datos de la segunda persona son: \n Nombre: "+ person2.getNombre() + "\n Peso: "+ person2.getPeso() + "kg \n Recorrido: "+ person2.getRecorrido() + "km \n Edad: "+ person2.getEdad() + " años");
    }
}
