import java.util.Scanner;

public class Buscaminas {
    public static void main(String[] args) {
        boolean elegidoBomba = false;
        Scanner sc = new Scanner(System.in);

        /*Crear la matriz*/
        //1 --> bomba 0 --> libre

        int mapa_bombas[][] = new int[10][10];
        int coordenadas[] = new int[2];
        String mapa_asteriscos[][] = new String[10][10];
        int bomba = 0;
        int probabilidad = 2;

        System.out.print("Dime la probabilidad de bomba (entre 2 y 5): ");
        probabilidad = sc.nextInt();

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                bomba = (int) (Math.random() *probabilidad);
                if (bomba != 0 && bomba != 1){
                    bomba = 0;
                }
                mapa_bombas[i][j] = bomba;
                mapa_asteriscos[i][j] = "*";
                System.out.printf("%3s",mapa_bombas[i][j]);
            }
            System.out.println();
        }

        preguntar(coordenadas, mapa_bombas,mapa_asteriscos,elegidoBomba);

    }

    /*PREGUNTAR*/
    private static void preguntar(int coordenadas[], int mapa_bombas[][], String mapa_asteriscos[][],boolean elegidoBomba){
        Scanner sc = new Scanner(System.in);
        int eleccion;
        int posicionColumnas = 0;
        int posicionFilas = 0;

        System.out.print("\nBomba: 1\nLibre: 2\n");
        eleccion = sc.nextInt();
        switch (eleccion){
            case 1:
                elegidoBomba = true;
                System.out.print("Dime la fila: ");
                posicionFilas = sc.nextInt();
                System.out.print("Dime el número: ");
                posicionColumnas = sc.nextInt();
                break;
            case 2:
                elegidoBomba = false;
                System.out.print("Dime la fila: ");
                posicionFilas = sc.nextInt();
                System.out.print("Dime la columna: ");
                posicionColumnas = sc.nextInt();
                break;
            default:
                preguntar(coordenadas,mapa_bombas,mapa_asteriscos,elegidoBomba);
                break;
        }
        coordenadas[0] = posicionFilas;
        coordenadas[1] = posicionColumnas;

        comprobarBomba(coordenadas,mapa_bombas,mapa_asteriscos);
    }
    /*Compruebo si hay bomba*/
    private static void comprobarBomba(int coordenada[],int mapabombas[][], String mapaver[][]){
        int i = coordenada[0];
        int j = coordenada[1];
        int contador = 0;

        if(mapabombas[i][j] == 1){
            System.out.println("Había una bomba, has perdido el juego");
        }
        else {
            for(int fila = i-1; fila <= i+1; fila++ ){
                for (int columna = j-1; columna <= j+1; columna++){
                    if (fila <= 10 && fila >=0 && columna<=10 && columna >=0){
                        if (mapabombas[fila][columna] == 1){
                            contador++;
                        }
                    }
                }
            }
            String cadena = "" + contador;
            mapaver[i][j] = cadena;

            /*Imprimo el nuevo mapa*/


            System.out.println();
            for(int fila = 0; fila < 10; fila ++){
                System.out.printf("%2d ",fila);
                for (int colum = 0; colum < 10; colum++){
                    System.out.printf("%3s",mapaver[fila][colum]);
                }
                System.out.println();
            }
            System.out.print("    ");
            for(int n = 0; n <10; n++)
            System.out.printf("%2d ",n);
            preguntar(coordenada, mapabombas,mapaver,false);
        }
    }


}
