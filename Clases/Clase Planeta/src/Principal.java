import clases.Planeta;

public class Principal {
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra",1, 5.9736E24, 1.08321E1, 12742,149597870);
        Planeta jupiter = new Planeta("Júpiter",95,1.899E27,1.4313E15,142984,778412026);


        System.out.println("\n" + tierra + "\n");
        System.out.println(jupiter + "\n");

        if(tierra.esExterior()){
            System.out.println("La Tierra es exterior\n");
        }
        else System.out.println("La Tierra no es exterior\n");
        if(jupiter.esExterior()){
            System.out.println("Júpiter es exterior\n");
        }
        else System.out.println("Júpiter no es exterior\n");

        /*Dos maneras de mostrar el número más bonito*/
        System.out.println("La densidad de la tierra es: " + String.format("%.3e",tierra.calcularDensidad()));
        System.out.printf("La densidad de Júpiter es: %.3e", jupiter.calcularDensidad());
    }
}
