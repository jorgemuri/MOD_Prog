import java.util.Scanner;
import java.lang.String;

public class MurilloJorge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numparadividir = 10;
        int division = 1;
        int n = 10;
        int i = 0;
        int contador = 0;
        boolean cero = false;
        boolean uno = false;
        boolean dos = false;
        boolean tres = false;
        boolean cuatro = false;
        boolean cinco = false;
        boolean seis = false;
        boolean siete = false;
        boolean ocho = false;
        boolean nueve = false;

        System.out.print("Dime un número entero: ");
        numero = sc.nextInt();

        while(division != 0){
            division = numero / n;
            n = n*10;
            contador++;
        }
        System.out.printf("El número de cifras es: %d\n",contador);
        while(contador > 0){
            int cifra = numero % numparadividir;
            switch (cifra){
                case 0:
                    if(cero != true){
                        System.out.printf("%d  ",cifra);
                    }
                    cero = true;
                    break;
                case 1:
                    if(uno != true){
                        System.out.printf("%d  ",cifra);
                    }
                    uno = true;
                    break;
                case 2:
                    if(dos != true){
                        System.out.printf("%d  ",cifra);
                    }
                    dos = true;
                    break;
                case 3:
                    if(tres != true){
                        System.out.printf("%d  ",cifra);
                    }
                    tres = true;
                    break;
                case 4:
                    if(cuatro != true){
                        System.out.printf("%d  ",cifra);
                    }
                    cuatro = true;
                    break;
                case 5:
                    if(cinco != true){
                        System.out.printf("%d  ",cifra);
                    }
                    cinco = true;
                    break;
                case 6:
                    if(seis != true){
                        System.out.printf("%d  ",cifra);
                    }
                    seis = true;
                case 7:
                    if(siete != true){
                        System.out.printf("%d  ",cifra);
                    }
                    siete = true;
                    break;
                case 8:
                    if(ocho != true){
                        System.out.printf("%d  ",cifra);
                    }
                    ocho = true;
                    break;
                case 9:
                    if(nueve != true){
                        System.out.printf("%d  ",cifra);
                    }
                    nueve = true;
                    break;
            }
            numero = numero/10;
            contador--;
        }
        System.out.println("");
        if(!cero){
            System.out.print("0 ");
        }
        if(!uno){
            System.out.print("1 ");
        }
        if(!dos){
            System.out.print("2 ");
        }
        if(!tres){
            System.out.print("3 ");
        }
        if(!cuatro){
            System.out.print("4 ");
        }
        if(!cinco){
            System.out.print("5 ");
        }
        if(!seis){
            System.out.print("6 ");
        }
        if(!siete){
            System.out.print("7 ");
        }
        if(!ocho){
            System.out.print("8 ");
        }
        if(!nueve){
            System.out.print("9 ");
        }
    }
}