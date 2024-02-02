import empresa.ConsulorIndefinido;
import empresa.Consultor;
import empresa.Empleado;
import empresa.Trabajador;

public class Main {
    public static void main(String[] args) {
        Empleado[] asalariados = new Empleado[5];
        Consultor[] consultores = new Consultor[5];
        ConsulorIndefinido[] consulorIndefinidos = new ConsulorIndefinido[3];

        asalariados[0] = new Empleado("Dani", "Profesor","sjcbwj",555,123,2000.00f,22);
        asalariados[1] = new Empleado("Jorge","Estudiante","Valdepa", 321,908,-10.00f,49.1f);
        consultores[0] = new Consultor("Alberto Jociles Ortega","maricon","club piruleta",69,1,24,5.5f);
        consultores[1] = new Consultor("Cubano españolito","Gerente","bahamas",123456,654,12,12.6f);
        consulorIndefinidos[0] = new ConsulorIndefinido("Blash Galbán","Merchandaising","Nubes de azucar", 12345,923,100,10.5f,30.5f);

        System.out.println("El número total de trabajadores es: " + Trabajador.getTotalTrabajadores() + "\n");

        System.out.printf("La paga es: %.2f\n", asalariados[0].calcularPaga());
        System.out.println(consultores[0]);
        System.out.println(consulorIndefinidos[0]);
        System.out.println(consulorIndefinidos[0].calcularPaga());

        System.out.println("---------------------------------------");
        for (int i = 0; i < 5; i++){
            System.out.println(asalariados[i]);
            System.out.printf("La paga es de %.2f\n\n",asalariados[i].calcularPaga());
            System.out.println(consultores[i]);
            System.out.printf("La paga es de %.2f\n\n",consultores[i].calcularPaga());

        }
    }
}
