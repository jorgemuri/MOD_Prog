import java.util.Scanner;

public class Moviles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pi = 1,pd = 1,di = 1,dd = 1;
        int numeros;
        String cadena = "";
        int numero_ceros = 0;

        while (pi != 0 || pd != 0 || di != 0 || dd != 0){
            cadena = sc.next();
            cadena = cadena.replaceAll("\\s+", "");
            numeros = Integer.parseInt(cadena);
            pi = (numeros / 1000) %10;
            di = (numeros / 100) % 10;
            pd = (numeros / 10 % 10);
            dd = (numeros % 10);
            if(pi == 0){
                numero_ceros++;
            }
            if(di == 0){
                numero_ceros++;
            }
            if(pd == 0){
                numero_ceros++;
            }
            if(dd == 0){
                numero_ceros++;
            }
            if(pi == 0 || pd == 0 || di == 0 || dd == 0){

            }
            else{
                if (pi * di == pd * dd){
                    
                }
                else {

                }
            }
        }
    }
}
