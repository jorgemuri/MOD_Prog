public class Estatura {
    public static void main(String[] args) {
        String[] paises = {"España", "Rusia", "Japón", "Australia"};
        float[][] estaturas = new float[4][10];
        float media, max, min, aux;

        /*Cabecera*/

        System.out.print("\n    Países|");
        for (int i = 10; i>0; i--){
            System.out.print("       ");
        }
        System.out.print(" Media| max|  min\n\n");

        for (int i = 0; i < 4; i++){
            System.out.printf("%10s ",paises[i]);
            min = 1000;
            max = 0;
            media = 0;
        /*FIN CABECERA*/
            for (int j = 0; j < 10; j++){
                estaturas[i][j] = (float) (Math.random() * 70) + 140;
                //almaceno los datos de la fila en la media para después hacerla (dividir entre 10)
                media = media + estaturas[i][j];
                aux = estaturas[i][j];
                if(aux > max){
                    max = aux;
                }
                if(aux < min){
                    min = aux;
                }

                System.out.printf("%.2f ", estaturas[i][j]);
            }
            media = media / 10;
            System.out.printf(" %d  %.2f  %.2f\n", (int)media, max, min);
        }
    }
}
