import persona.Persona;

public class principal {
    public static void main(String[] args) {
        /*Creo los 2 objetos*/
        Persona p1 = new Persona("Pedro", "Pérez", "24957235X", 1998);
        Persona p2 = new Persona("Luis", "León","09326485F",2009);

        /*Llamo al método toString de cada objeto*/
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
