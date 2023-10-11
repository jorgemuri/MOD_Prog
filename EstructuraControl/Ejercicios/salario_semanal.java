// Realizado por Jorge Murillo. Te calcúla una salario semanal dependiendo de tu tipo de contrato y de las horas trabajadas.

import java.util.Scanner;

public class salario_semanal {
    public static void main(String[] args) {
        float horas_extras;
        Scanner sc = new Scanner(System.in);

        //Aquí pregunto si tiene jornada completa
        System.out.print("Dime si tienes jornada completa con un si: ");
        String jornada_completa = sc.next();
        switch (jornada_completa){
            case "si":
                //pregunto las horas extras
            System.out.print("Dime las horas extras que trabajas:");
            horas_extras = sc.nextFloat();
            //el maximo de horas extras a la semana son 16
            if (horas_extras > 16){
                System.out.println("No se pueden trabajar tantas horas extras");
            }
            else{
                //miro si me da un entero en las horas extras.
                if (horas_extras - (int)horas_extras == 0){
                    System.out.printf("Tu salario esta semana es de: %d€", 40*12 + (int)horas_extras*16);
                }
                else{
                    System.out.println("Tienen que ser horas enteras, sin decimales.");
                }
            }
            break;
            //si no tiene jornada completa, entonces que diga el número de horas que trabaja.
            default:
                float horas;
                System.out.print("Dime el número de horas que trabajas: ");
                horas = sc.nextFloat();

                if (horas - (int)horas == 0) {
                    System.out.printf("Ganarías esta semana: %d€",(int)horas*12);
                }
                else{
                    System.out.println("Numeros enteros. PLEASE.");
                }
        }
    }
}
