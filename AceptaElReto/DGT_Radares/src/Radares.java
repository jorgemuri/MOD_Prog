import java.util.Scanner;

public class Radares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean dentro = true;

        while (dentro){
            int distancia_camaras = sc.nextInt();
            int velocidad_maxima = sc.nextInt();
            int segundosTardados = sc.nextInt();

            if(distancia_camaras == 0 && velocidad_maxima == 0 && segundosTardados == 0){
                dentro = false;
            }
            else if(distancia_camaras <0 || velocidad_maxima < 0 || segundosTardados <0){
                System.out.println("ERROR ");
            }
            else {
                float distancia_camarasKM = (float) distancia_camaras / 1000;
                float horasTardadas = (float) segundosTardados / 3600;

                float velocidadMedia = distancia_camarasKM/horasTardadas;
                if (velocidadMedia > velocidad_maxima){
                    if(velocidadMedia>=(velocidad_maxima + velocidad_maxima*0.2)){
                        System.out.println("PUNTOS ");
                    }
                    else {
                        System.out.println("MULTA ");
                    }
                }
                else {
                    System.out.println("OK ");
                }
            }
        }
    }
}
