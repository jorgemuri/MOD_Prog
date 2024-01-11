
import cuenta.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comandos;
        boolean salir = false, NcuentaExiste;
        //creo un array de objetos
        Cuenta[] cuentas = new Cuenta[10];
        int[] arrayNcuentas = new int[10];
        int N_Cuenta = -1;
        int posicionCuenta = 0;
        float saldo;

        System.out.println("AYUDA: Para ver los comandos pon HELP");
        while (!salir){
            System.out.print(">>>");
            NcuentaExiste = false;
            comandos = sc.next();
            comandos = comandos.toUpperCase();
            //compruebo si quiere los comandos
            if (comandos.equals("HELP")){
                mostrarComandos();
            } else if (comandos.equals("EXIT")) {
                salir = true;
            } else{
                switch (comandos) {
                    case "AC" -> {
                        N_Cuenta++; //indice que va a ir en el array de objetos

                        //le pido el número de cuenta
                        System.out.println("Dime el número de la cuenta: ");
                        int NumeroCuenta = sc.nextInt();
                        //compruebo si el número de cuenta ya existe
                        for (int i = 0; i < arrayNcuentas.length; i++) {
                            if (NumeroCuenta == arrayNcuentas[i]) {
                                NcuentaExiste = true;
                            }
                        }
                        if (!NcuentaExiste) {
                            if (posicionCuenta > 9) {
                                //supera el límite del array
                                System.out.println("No se pueden crear más cuentas");
                            } else {
                                arrayNcuentas[posicionCuenta] = NumeroCuenta;
                                posicionCuenta++;
                            }
                            cuentas[N_Cuenta] = new Cuenta(NumeroCuenta); //sin saldo
                        }
                        else {
                            System.out.println("El número de cuenta ya existe");
                            N_Cuenta--;
                        }
                    }
                    case "ACS" -> {
                        N_Cuenta++; //indice que va a ir en el array de objetos

                        //le pido el número de cuenta
                        System.out.println("Dime el número de la cuenta: ");
                        int NumeroCuenta = sc.nextInt();
                        //compruebo si el número de cuenta ya existe
                        for (int i = 0; i < arrayNcuentas.length; i++) {
                            if (NumeroCuenta == arrayNcuentas[i]) {
                                NcuentaExiste = true;
                            }
                        }
                        if (!NcuentaExiste) {
                            if (posicionCuenta > 10) {
                                //supera el límite del array
                                System.out.println("No se pueden crear más cuentas");
                            } else {
                                arrayNcuentas[posicionCuenta] = NumeroCuenta;
                                posicionCuenta++;
                            }
                        }
                        //pregunto el saldo
                        System.out.print("Dime el saldo de la cuenta: ");
                        saldo = sc.nextFloat();
                        cuentas[N_Cuenta] = new Cuenta(NumeroCuenta, saldo); //con saldo

                    }
                    case "CS" -> {
                        if(N_Cuenta >= 0){
                            System.out.printf("Actualmente estás en la cuenta con numero de cuenta %d\n", cuentas[N_Cuenta].getNCuenta());
                            System.out.printf("Tu saldo es %.2f€\n", cuentas[N_Cuenta].getSaldo());
                        }
                        else {
                            System.out.println("No tienes ninguna cuenta creada, usa el comando AC o ACS");
                        }
                        break;
                    }
                    case "ID" -> {
                        System.out.print("Dime el dinero a ingresar: ");
                        float importe = sc.nextFloat();
                        cuentas[N_Cuenta].Ingresar(importe);
                        break;
                    }
                    case "RD" -> {
                        System.out.print("Dime el dinero que quieres retirar: ");
                        float importe = sc.nextFloat();
                        cuentas[N_Cuenta].Retirar(importe);
                    }
                    case "CM" -> {
                        //consultar morosidad
                        if (cuentas[N_Cuenta].esMorosa()) {
                            System.out.println("Esta cuenta es morosa");
                        } else {
                            System.out.println("Esta cuenta no es morosa");
                        }
                    }
                    case "NCS" -> System.out.printf("La cuenta seleccionada es: %d\n", cuentas[N_Cuenta].getNCuenta());
                    case "SC" -> N_Cuenta = seleccioarCuennta(cuentas, sc);
                    case "ST" -> System.out.printf("El saldo total del banco es %.2f€\n", Cuenta.getSaldoTotal());
                    case "NCC" -> System.out.printf("El número de cuentas creadas en el banco son: %d\n", Cuenta.getTotalCuentas());
                    default -> System.out.println("Ese comando no existe. SI necestias ayuda escribe HELP, da igual si escribes en mayúscula o en minúscula");
                }
            }
        }
    }
    private static void mostrarComandos(){
        System.out.println("""
                ABRIR CUENTA: AC
                ABRIR CUENTA CON SALDO: ACS
                CONSULTAR SALDO: CS
                INGRESAR DINERO: ID
                RETIRAR DINERO: RD
                CONSULTAR MOROSIDAD: CM
                NÚMERO DE LA CUENTA SELECCIONADA: NCS
                SELECCIONAR CUENTA: SC
                SALDO TOTAL DEL BANCO: ST
                NÚMERO DE CUENTAS CREADAS: NCC
                SALIR: EXIT""");
    }
    private static int seleccioarCuennta(Cuenta[] cuentas, Scanner sc){
        System.out.println("Estas son tus cuentas: ");
        for (int i = 0; i < cuentas.length; i++) { //les muestro las cuentas existentes
            if (cuentas[i] != null) {
                System.out.printf("%d. %d\n", i, cuentas[i].getNCuenta());
            }
        }
        System.out.print("Pon el índice para seleccionar la cuenta: ");
        int N_Cuenta = sc.nextInt();
        if(N_Cuenta >= 0 && N_Cuenta <= 9){//CUIDADO, ES 9 PORQUE ASI LO TENGO PUESTO YO
            System.out.printf("\nHas seleccionado la cuenta con número de cuenta %d \n", cuentas[N_Cuenta].getNCuenta());
            return N_Cuenta;
        }
        else {
            System.out.println("\nEse número de cuenta no existe, se ha selecionado la primera cuenta que creaste automaticamente.\n La que tiene el índice 0");
            return 0;
        }
    }
}