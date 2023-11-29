import java.util.Scanner;

public class ConstanteMagica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2, CM = 0;

        while(n !=0 ){

            n = sc.nextInt();

            if (n != 0){
                int matriz[][] = new int[n][n];

                for (int i = 0; i < n; i++){
                    for (int j = 0; j < n; j++){
                        matriz[i][j] = sc.nextInt();
                    }
                }

                //miro cual debe ser la suma mágica

                for (int i = 0; i < n; i++) {
                    CM = CM + matriz[i][0];
                }
                if (!diabolico(matriz,n, CM)){
                    System.out.println("NO");
                }
                else {
                    if(esoterico(matriz,n, CM)){
                        System.out.println("Esoterico");
                    }
                    else {
                        System.out.println("Diabolico");
                    }
                }
                /*for (int i = 0; i < n; i++){
                    for (int j = 0; j < n; j++){
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }*/
            }
        }

    }

    private static boolean diabolico(int[][] matriz, int n, int CM) {

        int sumafilas = 0, sumacolumnas = 0, sumadiagonales = 0;
        boolean esDiabolico = true;

        // suma de las COLUMNAS
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumacolumnas = sumacolumnas + matriz[i][j];
            }
            if (sumacolumnas != CM) {
                esDiabolico = false;
            } else {
                sumacolumnas = 0;
            }
        }
        //suma de las FILAS
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                sumafilas = sumafilas + matriz[i][j];
            }
            if (sumafilas != CM) {
                esDiabolico = false;
            } else {
                sumafilas = 0;
            }
        }
        //suma DIAGONAL
        // diagonal principal
        for (int i = 0; i < n; i++){
            sumadiagonales = sumadiagonales + matriz[i][i];
        }
        if (sumadiagonales != CM){
            esDiabolico = false;
        }
        else {
            sumadiagonales = 0;
        }
        // diagonal secundaria
        for (int i = 0; i < n; i++){
            sumadiagonales = sumadiagonales + matriz[i][(n-1)-i];
        }
        if (sumadiagonales != CM){
            esDiabolico = false;
        }

        if (esDiabolico) {
            return true;
        } else {
            return false;
        }
    }
    private static boolean esoterico(int[][] matriz, int n, int CM){

        int sumaEsquinas = 0;
        int CM2 = (4*CM)/n;
        int mitad = n / 2;

        //miro si hay algun cero
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (matriz[i][j] == 0){
                    return false;
                }
            }
        }

        //sumo las esquinas
        sumaEsquinas = matriz[0][0] + matriz[0][n - 1] + matriz[n - 1][0] + matriz[n - 1][n - 1];
        if (sumaEsquinas != CM2){
            return false;
        }

        //compruebo si n es par o impar

        if (n % 2 == 0){
            //es par
            int lateralestop = matriz[0][mitad] + matriz[0][mitad - 1];
            int lateralesright = matriz[mitad][n - 1] + matriz[mitad - 1][n - 1];
            int lateralesleft  = matriz[mitad][0] + matriz[mitad - 1][0];
            int lateralesbottom =  matriz[n - 1][mitad] + matriz[n - 1][mitad - 1];

            if (lateralesbottom + lateralesleft + lateralesright + lateralestop != (2 * CM2)){
                return  false;
            }
            if(matriz[mitad][mitad] + matriz[mitad][mitad-1] + matriz[mitad-1][mitad] + matriz[mitad-1][mitad-1] != CM2){
                return false;
            }
        }
        else{
            //es impar
            if(matriz[0][mitad] + matriz[mitad][n - 1] + matriz[mitad][0] + matriz[n - 1][mitad] != CM2){
                return false;
            }
            if (matriz[mitad][mitad] * 4 != CM2){
                return false;
            }
        }
        return true;
    }
}
