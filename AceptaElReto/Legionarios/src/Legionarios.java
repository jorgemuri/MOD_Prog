import java.util.Scanner;

public class Legionarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean dentro = true;

        while(dentro){
            boolean dentro2 = true;
            int tamano_cuadrado = 1;
            String datos = "";
            int N_necesario = 0;
            int N_Legionarios = sc.nextInt();
            int perimetro = 0;
            if(N_Legionarios == 0){
                dentro = false;
            }
            else{
                while (dentro2){
                    datos = optimizarFormacion(N_Legionarios, tamano_cuadrado);
                    String[] datos_split = datos.split(" ");
                    tamano_cuadrado = Integer.parseInt(datos_split[0]);
                    N_Legionarios = Integer.parseInt(datos_split[1]);
                    //aqui acumulo los escudos
                    //compruebo si el cuadrado no es de 1x1
                    if(tamano_cuadrado == 1){
                        N_necesario = N_necesario + 5;
                    }
                    else {
                        //laterales
                        if(tamano_cuadrado == 2){
                            N_necesario = (N_necesario + (4*3));
                        }
                        else {
                            //sumo todos los laterales
                            perimetro = tamano_cuadrado*4 - 4;
                            // le sumo 12 por las esquinas
                            N_necesario = N_necesario + ((perimetro-4)*2) + 12;
                        }
                        //sumo el interior
                        int interior = tamano_cuadrado*tamano_cuadrado - (tamano_cuadrado*4-4);
                        N_necesario = N_necesario + interior;
                    }
                    if(N_Legionarios == 0){
                        dentro2 = false;
                    }
                    tamano_cuadrado = 1;
                }
                System.out.println(N_necesario);
            }
        }
    }
    private static String optimizarFormacion(int N_Legionarios, int tamano_cuadrado) {
        String datos = "";
        if (tamano_cuadrado * tamano_cuadrado > N_Legionarios) {
            N_Legionarios = N_Legionarios - ((tamano_cuadrado - 1)*(tamano_cuadrado-1));
            datos=(""+(tamano_cuadrado - 1) + " " + N_Legionarios);
            return datos;
        }
        else {
            return optimizarFormacion(N_Legionarios,(tamano_cuadrado+1));
        }
    }
}
