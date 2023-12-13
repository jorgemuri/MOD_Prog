package Restaurante;

public class Restaurantes {

    //PROPIEDADES
    private String nombre_restaurante = "";
    public int[] matriz;
    public int[] mesas;


    public Restaurantes(String nombre_restaurante, int n_mesas) {
        //Este es el numero de mesas:
        matriz = new int[n_mesas];
        //Relleno la matriz con números aleatorios:
        mesas = rellenarmatriz();

        this.nombre_restaurante = nombre_restaurante;
        mostrarmesas();
    }

    //relleno la matriz con el numero de ocupantes aleatorio entre 0 y 4
    private int[] rellenarmatriz(){
        for (int i = 0; i < matriz.length; i++){
            matriz[i] = (int) (Math.random()*4);
        }
        return matriz;
    }

    public String getNombre_restaurante() {
        return nombre_restaurante;
    }


    public void mostrarmesas(){
        System.out.printf("%13s", "NºMesa: ");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < mesas.length; j++){
                if (i == 0){
                    //muestro número de mesa
                    System.out.printf("%2d ", j+1);
                    if(j == (mesas.length -1)){
                        //muestro número de ocupantes
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
}
