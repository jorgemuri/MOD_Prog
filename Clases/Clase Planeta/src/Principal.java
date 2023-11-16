import clases.Planeta;

public class Principal {
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra",1, 5.9736E24, 1.08321E1, 12742,149597870);
        Planeta jupiter = new Planeta("Júpiter",95,1.899E27,1.4313E15,142984,778412026);

        System.out.println(tierra.toString());
        System.out.println(jupiter.toString());
    }
}
