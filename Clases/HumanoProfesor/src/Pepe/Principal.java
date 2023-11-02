package Pepe;

import Pepe.Persona;

public class Principal {
    public static void main(String[] args) {
        Persona person = new Persona();
        person.nacer();

        System.out.println(person.devolvernombre());
        System.out.println(person.devolverpeso());

        person.dormir();

        System.out.println(person.devolverpeso());

        person.engordar(5.5f);

        System.out.println(person.devolverpeso());
    }
}
