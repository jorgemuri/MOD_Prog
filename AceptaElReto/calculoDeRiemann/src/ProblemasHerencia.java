import java.util.Scanner;

public class ProblemasHerencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creo las variables
        //grado de la función
        int grado = 0;
        //creo un array con el maximo de longitud (19)
        int[] coeficientes = new int[19];
        boolean dentro = true;
        int nRectangulos;

        while (dentro){
            System.out.println("Dime el grado de la función: ");
            grado = sc.nextInt();
            if (grado == 20){
                break;
            }
            System.out.println("Dime los coeficientes de la función separados con un espacio");
            for (int i = 0; i<=grado;i++){ // recorro el array solo en las primeras variables necesarias
                    coeficientes[grado-i] = sc.nextInt(); //guardo los datos en el array de coeficientes
                    System.out.print(coeficientes[i]);
            }
            System.out.print("Dime el numero de rectángulos: ");
            nRectangulos = sc.nextInt(); //guardo el número de rectángulos
            float anchuraRectangulos = (float) 1 / nRectangulos;

            float aux = anchuraRectangulos;
            while (aux < 1){ //recorro cada rectángulo
                System.out.println(aux);
                float alturaRectangulo = 0;
                for (int i = 0; i <= grado; i++){
                    alturaRectangulo = alturaRectangulo + ((float) coeficientes[i] *((float)(Math.pow(aux,i))));

                }
                aux = aux + aux;
                System.out.println(alturaRectangulo);
                if (alturaRectangulo > 1 || alturaRectangulo < 0){  //compruebo que ningun rectángulo esté en una parte negativa o por encima de 1
                    System.out.println("Supera los límites");
                }
            }




            /*
            //miro si la función es negativa en algun punto entre 0 y 1:
            float aux_num = 0;
            float suma = 0;
            while (aux_num <1 && (suma >= 0 && suma <= 1)){
                aux_num = (float) (aux_num + 0.01);
                for(int i = 0; i<=grado; i++){
                    suma = (float) (coeficientes[i]*0.01);
                }
                if(suma < 0){
                    System.out.println("");
                }
            }
             */

        }
    }
    private static void Funcion(int[] coeficientes){

    }
}
