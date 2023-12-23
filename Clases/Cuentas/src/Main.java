
import cuenta.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creo un String con el historial de los números de cuentas, para que no se repitan
        String historial = "";
        String comandos = "";
        boolean salir = false;
        //creo un array de objetos
        Cuenta[] cuentas = new Cuenta[10];
        int[] arrayNcuentas = new int[10];
        int N_Cuenta = 0;

        while (!salir){
            System.out.println("AYUDA: Para ver los comandos pon HELP");
            comandos = sc.next();
            //compruebo si quiere los comandos
            if (comandos.equals("HELP")){
                mostrarComandos();
            } else if (comandos.equals("EXIT")) {
                salir = true;
            } else{
                if(comandos.equals("AC")){
                    cuentas[N_Cuenta] = new Cuenta() //sin saldo

                } else if (comandos.equals("ACS")) {
                    //le pido el número de cuenta
                    System.out.println("Dime el número de la cuenta: ");
                    int NumeroCuenta = sc.nextInt();
                    //tengo que añadir el numero de cuenta al array
                    cuentas[N_Cuenta] = new Cuenta() //con saldo
                } else if (comandos.equals("CS")) {

                } else if (comandos.equals("ID")) {

                } else if (comandos.equals("RD")) {

                } else if (comandos.equals("CM")) {

                }
                else {
                    System.out.println("Ese comando no existe. TIP: Escribe en mayúsculas");
                }
            }
        }
    }
    private static void mostrarComandos(){
        System.out.println("ABRIR CUENTA: AC" +
                "\nABRIR CUENTA CON SALDO: ACS" +
                "\nCONSULTAR SALDO: CS" +
                "\nINGRESAR DINERO: ID" +
                "\nRETIRAR DINERO: RD" +
                "\nCONSULTAR MOROSIDAD: CM" +
                "\nSALIR: EXIT");
    }
}
