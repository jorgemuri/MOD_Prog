
import cuenta.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comandos = "";
        boolean salir = false, NcuentaExiste = false;
        //creo un array de objetos
        Cuenta[] cuentas = new Cuenta[10];
        int[] arrayNcuentas = new int[10];
        int N_Cuenta = -1;
        int posicionCuenta = 0;
        float saldo = 0;

        while (!salir){
            NcuentaExiste = false;
            System.out.println("AYUDA: Para ver los comandos pon HELP");
            comandos = sc.next();
            //compruebo si quiere los comandos
            if (comandos.equals("HELP")){
                mostrarComandos();
            } else if (comandos.equals("EXIT")) {
                salir = true;
            } else{
                if(comandos.equals("AC")){
                    N_Cuenta++; //indice que va a ir en el array de objetos
                    //le pido el número de cuenta
                    System.out.println("Dime el número de la cuenta: ");
                    int NumeroCuenta = sc.nextInt();
                    //compruebo si el número de cuenta ya existe
                    for(int i = 0; i < arrayNcuentas.length;i++){
                        if(NumeroCuenta == arrayNcuentas[i]){
                            NcuentaExiste = true;
                        }
                    }
                    if(!NcuentaExiste){
                        if(posicionCuenta > 9){
                            //supera el límite del array
                            System.out.println("No se pueden crear más cuentas");
                        }
                        else{
                            arrayNcuentas[posicionCuenta] = NumeroCuenta;
                            posicionCuenta++;
                        }
                    }
                    cuentas[N_Cuenta] = new Cuenta(NumeroCuenta); //sin saldo

                } else if (comandos.equals("ACS")) {
                    N_Cuenta++; //indice que va a ir en el array de objetos
                    //le pido el número de cuenta
                    System.out.println("Dime el número de la cuenta: ");
                    int NumeroCuenta = sc.nextInt();
                    //compruebo si el número de cuenta ya existe
                    for(int i = 0; i < arrayNcuentas.length;i++){
                        if(NumeroCuenta == arrayNcuentas[i]){
                           NcuentaExiste = true;
                        }
                    }
                    if(!NcuentaExiste){
                        if(posicionCuenta > 10){
                            //supera el límite del array
                            System.out.println("No se pueden crear más cuentas");
                        }
                        else{
                            arrayNcuentas[posicionCuenta] = NumeroCuenta;
                            posicionCuenta++;
                        }
                    }
                    //pregunto el saldo
                    System.out.print("Dime el saldo de la cuenta: ");
                    saldo = sc.nextFloat();
                    cuentas[N_Cuenta] = new Cuenta(NumeroCuenta, saldo); //con saldo
                } else if (comandos.equals("CS")) {
                    System.out.printf("Actualmente estás en la cuenta con numero de cuenta %d\n",cuentas[N_Cuenta].getNCuenta());
                    System.out.printf("Tu saldo es %.2f\n",cuentas[N_Cuenta].getSaldo());
                } else if (comandos.equals("ID")) {
                    System.out.print("Dime el dinero a ingresar: ");
                    float importe = sc.nextFloat();
                    cuentas[N_Cuenta].Ingresar(importe);
                } else if (comandos.equals("RD")) {
                    System.out.print("Dime el dinero que quieres retirar: ");
                    float importe = sc.nextFloat();
                    cuentas[N_Cuenta].Retirar(importe);
                } else if (comandos.equals("CM")) {
                    //consultar morosidad
                    if(cuentas[N_Cuenta].esMorosa()){
                        System.out.println("Esta cuenta es morosa");
                    }
                } else if (comandos.equals("NCS")) {
                    System.out.printf("La cuenta seleccionada es: %d\n", cuentas[N_Cuenta].getNCuenta());
                } else if (comandos.equals("SC")) {
                    System.out.println("Estas son tus cuentas: ");
                    for (int i = 0; i < cuentas.length; i++){ //les muestro las cuentas existentes
                        if(cuentas[i] != null){
                            System.out.printf("%d. %d\n",i, cuentas[i].getNCuenta());
                        }
                    }
                    System.out.print("Pon el índice para seleccionar la cuenta: ");
                    N_Cuenta = sc.nextInt();
                } else {
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
                "\nNÚMERO DE LA CUENTA SELECCIONADA: NCS" +
                "\nSELECCIONAR CUENTA: SC" +
                "\nSALIR: EXIT");
    }
}
