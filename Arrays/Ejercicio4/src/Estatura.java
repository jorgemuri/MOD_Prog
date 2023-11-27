public class Estatura {
    public static void main(String[] args) {
        String paises[] = {"España", "Rusia", "Japón", "Australia"};
        float estaturas[][] = new float[4][10];
        float media = 0, max = 0, min = 0, aux = 0;

        /*Cabecera*/

        System.out.printf("\n    Países|");
        for (int i = 10; i>0; i--){
            System.out.print("       ");
        }
        System.out.print(" Media| max|  min\n\n");

        for (int i = 0; i < 4; i++){
            System.out.printf("%10s ",paises[i]);
            min = 0;
            max = 0;
            media = 0;
            for (int j = 0; j < 10; j++){
                estaturas[i][j] = (float) (Math.random() * 70) + 140;
                media = media + estaturas[i][j];
                aux = estaturas[i][j];
                if(aux > max){
                    max = aux;
                }
                else{
                    min = aux;
                }

                System.out.printf("%.2f ", estaturas[i][j]);
            }
            media = media / 10;
            System.out.printf(" %.0f  %.2f  %.2f", media, max, min);
            System.out.println("");
        }


    }
}
