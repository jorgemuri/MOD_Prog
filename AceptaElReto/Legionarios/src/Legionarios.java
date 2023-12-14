import java.util.Scanner;

public class Legionarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean dentro = true;

        while(dentro){
            int tamano_cuadrado = 1;
            String datos = "";
            int N_necesario = 0;
            int N_Legionarios = sc.nextInt();
            if(N_Legionarios == 0){
                dentro = false;
            }
            else{
                datos = optimizarFormacion(N_Legionarios, tamano_cuadrado);
                String[] datos_split = datos.split("|");
                System.out.println(datos_split[1]);
                tamano_cuadrado = Integer.parseInt(datos_split[0]);
                N_Legionarios = Integer.parseInt(datos_split[1]);
                //aqui acumulo los escudos
                //compruebo si el cuadrado no es de 1x1 para no sumar las esquinas
                if(tamano_cuadrado == 1){
                    N_necesario = N_necesario + 1;
                }
                else {
                    N_necesario = N_necesario + (tamano_cuadrado*tamano_cuadrado + 4);
                }
                if(N_Legionarios == 0){
                    System.out.println(N_necesario);
                }
            }
        }
    }
    private static String optimizarFormacion(int N_Legionarios, int tamano_cuadrado) {
        String datos = "";
        if (tamano_cuadrado * tamano_cuadrado > N_Legionarios) {
            N_Legionarios = N_Legionarios - ((tamano_cuadrado - 1)*(tamano_cuadrado-1));
            datos=(""+(tamano_cuadrado - 1) + "|" + N_Legionarios);
            System.out.println(datos);
            return datos;
        }
        else {
            return optimizarFormacion(N_Legionarios,(tamano_cuadrado+1));
        }
    }
}
