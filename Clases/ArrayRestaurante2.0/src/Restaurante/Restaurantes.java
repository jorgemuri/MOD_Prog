package Restaurante;

public class Restaurantes {

    //PROPIEDADES
    private String nombre_restaurante = "";

    public Restaurantes(String nombre_restaurante, int n_mesas) {
        //Este es el numero de mesas:
        int[] matriz = new int[n_mesas];
        //Relleno la matriz con números aleatorios:
        int[] mesas = rellenarmatriz(matriz);

        this.nombre_restaurante = nombre_restaurante;
        mostrarmesas(mesas);
    }

    //relleno la matriz con el numero de ocupantes aleatorio entre 0 y 4
    private int[] rellenarmatriz(int[] matriz){
        for (int i = 0; i < matriz.length; i++){
            matriz[i] = (int) (Math.random()*4);
        }
        return matriz;
    }

    public void mostrarmesas(int[] mesas){
        System.out.printf("%13s", "NºMesa: ");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < mesas.length; j++){
                if (i == 0){
                    System.out.printf("%2d ", j+1);
                    if(j == (mesas.length -1)){
                        System.out.println();
                        System.out.printf("%13s", "NºOcupantes: ");
                    }
                }
                else{
                    System.out.printf("%2d ", mesas[j]);
                    if (j == (mesas.length -1)){
                        System.out.println();
                    }
                }
            }
        }
    }
}
