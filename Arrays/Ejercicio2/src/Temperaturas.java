import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nastericos = 0;
        float asteriscos = 0;
        float[] temperatura = new float[12];
        String[] meses = {"ENERO     ", "FEBRERO   ", "MARZO     ", "ABRIL     ", "MAYO      ", "JUNIO     ", "JULIO     ", "AGOSTO    ","SEPTIEMBRE", "OCTUBRE   ", "NOVIEMBRE ", "DICIEMBRE "};

        for (int i = 0; i < 12; i++){
            System.out.println("Dime la temperatura media de " + meses[i]);
            temperatura[i] = sc.nextFloat();
        }
        for (int i = 0; i < temperatura.length; i++){

            asteriscos = 2*temperatura[i];
            nastericos = (int)asteriscos;
            System.out.print(meses[i]);
            for (int n = 0; n < nastericos; n++){
                System.out.print("=+");
            }
            System.out.print("\n");

        }
    }
}
