

import humano.Persona;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        float distancia;
        float peso;

        Persona person = new Persona();
        System.out.print("Dime un nombre para un humano: ");
        nombre = sc.next();
        System.out.println(person.nacer(nombre));

        System.out.print("Dime la distancia que va a recorrer: ");
        distancia = sc.nextFloat();
        System.out.println(person.caminar(distancia));

        System.out.print("Dime el peso que va a aumentar: ");
        peso = sc.nextFloat();
        System.out.println(person.engordar(peso));

        Persona person2 = new Persona();
        System.out.print("Dime un nombre para otro humano: ");
        nombre = sc.next();
        System.out.println(person2.nacer(nombre));

        System.out.print("Dime la distancia que va a recorrer: ");
        distancia = sc.nextFloat();
        System.out.println(person2.caminar(distancia));

        System.out.print("Dime el peso que va a aumentar: ");
        peso = sc.nextFloat();
        System.out.println(person2.engordar(peso));


        System.out.println("Los datos de la primera persona son: ");
        System.out.print("El nombre de la primera persona: ");
        System.out.println(person.mostrarNombre());
        System.out.print("El peso de la primera persona: ");
        System.out.println(person.mostrarPeso());
        System.out.print("El recorrido de la primera persona: ");
        System.out.println(person.mostrarRecorrido());

        System.out.println("Los datos de la segunda persona son: ");
        System.out.print("El nombre de la segunda persona: ");
        System.out.println(person2.mostrarNombre());
        System.out.print("El peso de la segunda persona: ");
        System.out.println(person2.mostrarPeso());
        System.out.print("El recorrido de la segunda persona: ");
        System.out.println(person2.mostrarRecorrido());

    }
}
