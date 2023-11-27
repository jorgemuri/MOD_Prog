public class Sumas {
    public static void main(String[] args) {
        int matriz[][] = new int[4][5];
        int aleatorio = 0;
        int suma = 0, sumatotal = 0;

        /*Creo la matriz*/

        for (int i = 0; i < 4; i++) {
            suma = 0;
            for (int j = 0; j < 5; j++) {
                aleatorio = (int) (Math.random() * 100) + 1;
                matriz[i][j] = aleatorio;
                suma = suma + matriz[i][j];
                System.out.printf("%4d",aleatorio);
            }
            System.out.printf("| %d\n", suma);
            sumatotal = sumatotal + suma;
        }

        /*Suma de las columnas*/
        System.out.print(" ");
        for (int j = 0; j < 5; j++){
            suma = 0;
            for (int i = 0; i < 4; i++){
                suma = suma + matriz[i][j];
            }
            System.out.printf("%4d",suma);
            sumatotal = sumatotal + suma;
        }
        System.out.printf("| %4d", sumatotal);
    }
}
