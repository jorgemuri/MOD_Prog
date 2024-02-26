import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*ARRAY 2 DIMENSIONES*/
        int[][] miarray = new int[10][10];

        //relleno
        for (int i = 0; i<miarray[0].length;i++){
            for (int j = 0; j< miarray.length;j++){
                miarray[i][j] = ((int) (Math.random() * 25)+1);
            }
        }
        //muestro array
        for (int i = 0; i<10;i++){
            System.out.println();
            for (int j = 0; j<10;j++){
                System.out.printf("%2d ",miarray[i][j]);
            }
        }
        //averiguo la suma
        int aux=0;
        int sumaFila=0;
        for (int i = 0; i<10;i++){
            for (int j = 0; j<10;j++){
                sumaFila+=miarray[i][j];
            }
            if (sumaFila>aux){
                aux=sumaFila;
            }
            sumaFila=0;
        }

        //miro cual es la i, y la j de aux
        for (int i = 0; i<10;i++){
            for (int j = 0; j<10;j++){
                sumaFila+=miarray[i][j];
            }
            if (sumaFila==aux){
                System.out.println("\n\nLa fila con mayor suma es la número: "+i+" y la suma es: " + aux);
            }
            sumaFila=0;
        }
        //pido un número entre el 1 y el 25
        int[] arrayFilas = new int[10];
        int[] arrayColumnas = new int[10];
        int contador = 0;
        System.out.print("Dime un número entre el 1 y el 25: ");
        int numero = sc.nextInt();
        for (int i = 0; i<10;i++){
            for (int j = 0; j<10;j++){
                if (miarray[i][j]==numero){
                    arrayFilas[contador]=i;
                    arrayColumnas[contador]=j;
                    contador++;
                }
            }
        }
        //lo muestro
        System.out.print("Los elementos que tienen el número " + numero+" son: ");
        if (contador!=0){
            for (int i=0;i<=contador;i++){
                System.out.print("{"+arrayFilas[i]+","+arrayColumnas[i]+"},");
            }
        }
        else System.out.print("No hay");

    }
}
