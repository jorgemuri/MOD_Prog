package examen;

import java.util.Scanner;

public class EntradasGraduacion {
    /*Propiedades*/
    Scanner sc = new Scanner(System.in);
    private int entradasButacas, entradasAnfiteatro, entradasPalco;

    /*Métodos*/

    public EntradasGraduacion(int Butacas, int Anfiteatro, int Palco) {
        this.entradasButacas = Butacas;
        this.entradasAnfiteatro = Anfiteatro;
        this.entradasPalco = Palco;
    }

    public void venderEntradas(){
        System.out.println("¿Para qué zona quieres las entradas? \n 1. Butacas. \n 2. Anfiteatro. \n 3. Palco.");
        int caso = sc.nextInt();
        int n_entradas = 0;
        switch (caso){
            case 1:
                System.out.println("¿Cuántas entradas quieres en las butacas?: ");
                n_entradas = sc.nextInt();
                if (n_entradas > this.entradasButacas){
                    System.out.println("No hay suficientes entradas.");
                }
                else{
                    this.entradasButacas = this.entradasButacas - n_entradas;
                }
                break;
            case 2:
                System.out.println("¿Cuántas entradas quieres en las anfiteatro?: ");
                n_entradas = sc.nextInt();
                if (n_entradas > this.entradasAnfiteatro){
                    System.out.println("No hay suficientes entradas.");
                }
                else{
                    this.entradasAnfiteatro = this.entradasAnfiteatro - n_entradas;
                }
                break;
            case 3:
                System.out.println("¿Cuántas entradas quieres en el palco?: ");
                n_entradas = sc.nextInt();
                if (n_entradas > this.entradasPalco){
                    System.out.println("No hay suficientes entradas.");
                }
                else{
                    this.entradasPalco = this.entradasPalco - n_entradas;
                }
                break;
            default: break;
        }
    }

    @Override
    public String toString() {
        return "EntradasGraduacion{" +
                "entradasButacas=" + entradasButacas +
                ", entradasAnfiteatro=" + entradasAnfiteatro +
                ", entradasPalco=" + entradasPalco +
                '}';
    }
}
