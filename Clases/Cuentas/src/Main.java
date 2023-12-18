
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
        Cuenta cuentas[];

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

                } else if (comandos.equals("ACS")) {

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
