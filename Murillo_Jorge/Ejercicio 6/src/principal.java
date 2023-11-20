import examen.EntradasGraduacion;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int butacas, anfiteatro, palco, caso = 0;
        boolean salirMenu = false;

        /*Configurar*/
        System.out.print("Dime el número de entradas que hay en el patio de butacas: ");
        butacas = sc.nextInt();
        System.out.print("Dime el número de entradas que hay en el anfiteatros: ");
        anfiteatro = sc.nextInt();
        System.out.print("Dime el número de entradas que hay en el palco: ");
        palco = sc.nextInt();
        EntradasGraduacion objeto = new EntradasGraduacion(butacas,anfiteatro,palco);

        /*Menu*/
        while(!salirMenu){
            System.out.println("\n\n 1. Mostrar número de entradas disponibles en cada zona.\n\n 2.Vender entradas.\n\n 3. Salir");
            caso = sc.nextInt();
            switch (caso){
                case 1:
                    System.out.println(objeto);
                    break;
                case 2:
                    objeto.venderEntradas();
                    break;
                case 3:
                    salirMenu = true;
                    break;
                default:break;
            }

        }

    }
}
