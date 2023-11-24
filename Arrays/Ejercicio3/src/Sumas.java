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
                System.out.print(aleatorio + " ");
            }
            System.out.printf("| %d\n", suma);
            sumatotal = sumatotal + suma;
        }
        for (int i = 0; i < 5; i++){
            System.out.print("-- ");
        }
        System.out.print("\n");
        for (int j = 0; j < 5; j++){
            suma = 0;
            for (int i = 0; i < 4; i++){
                suma = suma + matriz[i][j];
            }
            System.out.printf("%d ",suma);
            sumatotal = sumatotal + suma;
        }
        System.out.printf("| %d", sumatotal);
    }
}
