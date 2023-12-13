package restaurante;

import java.util.Arrays;

public class Mesas {
    private int[] matriz = new int[10];
    //Relleno la matriz con números aleatorios:
    private int[] mesas = rellenarmatriz(matriz);




    /*Métodos*/

    private int[] rellenarmatriz(int[] matriz){
        for (int i = 0; i < matriz.length; i++){
            matriz[i] = (int) (Math.random()*4);
        }
        return matriz;
    }

    public int buscarmesa(int numero_comensales){
        for (int i = 0; i < mesas.length; i++){

            if(mesas[i] == 0){
                mesas[i] = mesas[i] + numero_comensales;
                return i + 1;
            }
        }

        for (int i = 0; i < mesas.length; i++){
            if(mesas[i] + numero_comensales <= 4){
                mesas[i] = mesas[i] + numero_comensales;
                return i + 1 + 100;
            }
        }
        return 0;
    }

    public void mostrarmesas(){
        for(int i = 0; i< 10; i++){
            String columna = "M"+(i+1);
            System.out.printf("%2s ",columna);
        }
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < mesas.length; j++){
                if (i == 0){
                    System.out.print("");
                }
                else{
                    System.out.printf("%2d ", mesas[j]);
                }
            }
            System.out.println();
        }
    }
}
