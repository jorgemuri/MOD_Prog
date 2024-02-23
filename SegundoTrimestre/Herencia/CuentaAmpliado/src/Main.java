import miPaquete.Cuenta;
import miPaquete.CuentaCorriente;
import miPaquete.CuentaEmpresa;
import miPaquete.CuentaPersonal;

import java.util.Scanner;

public class Main {
    static String verde = "\u001B[32m";
    static String reset = "\u001B[0m";
    static String amarillo = "\u001B[33m";

    public static void main(String[] args) {
        Cuenta[] cuentas = new Cuenta[10];
        int indice = 0;
        int[] listaIdentificadores = new int[10];

        boolean salir = false;
        System.out.println("BIENVENIDO AL PROGRAMA DEL BANCO Y DE LAS CUENTAS");
        System.out.println("---------------------------------------------------");
        while (!salir){
            int respuesta =mostrarMenu();
            switch (respuesta){
                case 1:
                    crearCuenta(cuentas,indice,listaIdentificadores); // creo cuenta sin saldo
                    indice++; // actualizo el índice del array.
                    System.out.println("Se ha creado la cuenta correctamente");
                    break;
                case 2:
                   crearCuentaSaldo(cuentas,indice,listaIdentificadores);
                    indice++; // actualizo el índice del array
                    System.out.println("Se ha creado correctamente");
                    break;
                case 3:
                    consultarSaldo(cuentas,indice);
                    System.out.println("Se ha creado correctamente");
                    break;
                case 4:
                    ingresarDinero(cuentas,indice);
                    break;
                case 5:
                    retirarDinero(cuentas,indice);
                    break;
                case 6:
                    consultarMorosidad(cuentas,indice);
                    break;
                case 7:
                    actualizarCuentaCorriente(cuentas);
                    break;
                case 8:
                    aplicarInteres(cuentas);
                    break;
                case 9:
                    System.out.println("Gracias por usar el programa.");
                    salir=true;
                    break;
            }
        }
    }
    private static int mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1. Abrir cuenta.
                2. Abrir cuenta con saldo.
                3. Consultar saldo.
                4. Ingresar dinero.
                5. Retirar dinero.
                6. Consultar morosidad.
                7. Actualizar cuenta corriente.
                8. Aplicar interes a cuenta remunerada.
                9. Salir
                """);
        return sc.nextInt();
    }
    private static void crearCuenta(Cuenta[] cuentas, int indice, int[] listaIdentificadores){
        int identificador;
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");

        System.out.print("Dime el identificador de la cuenta: ");
        identificador = sc.nextInt();
        if(!comprobarIdentificador(listaIdentificadores,identificador)){ // compruebo el identificador
            System.out.println("El identificador ya existe.");
            return; // el identificador ya existe
        }
        listaIdentificadores[indice] = identificador; // guardo el identificador para que no se pueda usar

        System.out.println("¿Qué tipo de cuenta quieres crear?");
        System.out.println("""
                1. Cuenta corriente
                2. Cuenta remunerada
                """);
        int respuesta = sc.nextInt();
        if (respuesta==1){ /* CUENTA CORRIENTE */
            float[] recibos = new float[5];

            for (int i = 0; i< recibos.length;i++){
                System.out.print("Dime la cantidad de dinero del recibo."+amarillo+ "(si es 0 para. Maximo 5): "+reset);
                float recibo = sc.nextFloat();
                if (recibo == 0f){
                    i = 4;
                }
                else {
                    recibos[i] = recibo;
                }
            }
            System.out.print("Dime el nombre del titual: ");
            String nombreTitual = sc.next();
            cuentas[indice] = new CuentaCorriente(identificador,recibos,nombreTitual); // creo la cuenta corriente
        }

        else { /* CUENTA REMUNERADA */
            System.out.print("Dime el interés: ");
            float interes = sc.nextFloat();
            System.out.println("¿Qué tipo de cuenta remunerada quieres?");
            System.out.println("""
                    1. Cuenta personal
                    2. Cuenta empresa
                    """);
            int respuesta2 = sc.nextInt();
            if (respuesta2==1){ // CUENTA PERSONAL
                cuentas[indice] = new CuentaPersonal(identificador,interes); // creo la cuenta personal
            }
            else { // CUENTA EMPRESA
                cuentas[indice] = new CuentaEmpresa(identificador,interes);
            }
        }
    }
    private static void crearCuentaSaldo(Cuenta[] cuentas, int indice, int[] listaIdentificadores){
        int identificador;
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");

        System.out.print("Dime el identificador de la cuenta: ");
        identificador = sc.nextInt();
        if(!comprobarIdentificador(listaIdentificadores,identificador)){ // compruebo el identificador
            System.out.println("El identificador ya existe.");
            return; // el identificador ya existe
        }
        listaIdentificadores[indice] = identificador; // guardo el identificador para que no se pueda usar

        System.out.print("Dime el saldo de la cuenta: ");
        float saldo = sc.nextFloat();

        System.out.println("¿Qué tipo de cuenta quieres crear?");
        System.out.println("""
                1. Cuenta corriente
                2. Cuenta remunerada
                """);
        int respuesta = sc.nextInt();
        if (respuesta==1){ /* CUENTA CORRIENTE */
            float[] recibos = new float[5];

            for (int i = 0; i< recibos.length;i++){
                System.out.print("Dime la cantidad de dinero del recibo. (si es 0 para. Maximo 5): ");
                float recibo = sc.nextFloat();
                if (recibo == 0f){
                    i = 4;
                }
                else {
                    recibos[i] = recibo;
                }
            }
            System.out.print("Dime el nombre del titual: ");
            String nombreTitual = sc.next();
            cuentas[indice] = new CuentaCorriente(identificador,saldo,recibos,nombreTitual); // creo la cuenta corriente
        }

        else { /* CUENTA REMUNERADA */
            System.out.print("Dime el interés: ");
            float interes = sc.nextFloat();
            System.out.println("¿Qué tipo de cuenta remunerada quieres?");
            System.out.println("""
                    1. Cuenta personal
                    2. Cuenta empresa
                    """);
            int respuesta2 = sc.nextInt();
            if (respuesta2==1){ // CUENTA PERSONAL
                cuentas[indice] = new CuentaPersonal(identificador,saldo,interes); // creo la cuenta personal
            }
            else { // CUENTA EMPRESA
                cuentas[indice] = new CuentaEmpresa(identificador,saldo,interes);
            }
        }
    }
    private static void consultarSaldo(Cuenta[] cuentas, int indice){
        Scanner sc = new Scanner(System.in);
        mostrarIdentificadores(cuentas,indice); // muestro identificadores
        int respuesta = sc.nextInt();
        System.out.println("El saldo de la cuenta es: " +verde+ cuentas[respuesta].getSaldo()+"€" +reset);
    }
    private static boolean comprobarIdentificador(int[] listaIdentificadores, int identificador){
        for (int i = 0; i < listaIdentificadores.length;i++){
            if (listaIdentificadores[i]==identificador){ // compruebo si ya existe el identificador.
                System.out.println("No puedes crear una cuenta con este identificador.");
                return false;
            }
        }
        return true;
    }
    private static void retirarDinero(Cuenta[] cuentas, int indice){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De qué cuenta quieres retirar dinero?");
        mostrarIdentificadores(cuentas,indice); // muestro identificadores
        int respuesta = sc.nextInt();
        System.out.print("¿Cuánto dinero quieres retirar?: ");
        float importe = sc.nextFloat();
        float saldo= cuentas[respuesta].retirar(importe);
        System.out.println("Tu saldo actual es: " +verde+ saldo+"€"+reset);
    }
    private static void ingresarDinero(Cuenta[] cuentas, int indice){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De qué cuenta quieres operar?");
        mostrarIdentificadores(cuentas,indice); // muestro identificadores
        int respuesta = sc.nextInt();
        System.out.print("¿Cuánto dinero quieres ingresar?: ");
        float importe = sc.nextFloat();
        float saldo= cuentas[respuesta].ingresar(importe);
        System.out.println("Tu saldo actual es: " +verde+ saldo+"€"+reset);
    }
    private static void consultarMorosidad(Cuenta[] cuentas, int indice){
        Scanner sc = new Scanner(System.in);
        if (indice==0){
            System.out.println("No tienes cuentas");
        }
        else {
            System.out.print("¿De qué cuenta quieres consultar su morosidad?: ");
            mostrarIdentificadores(cuentas, indice);
            int respuesta = sc.nextInt();
            if(cuentas[respuesta].esMorosa()){
                System.out.println("Esta cuenta es morosa.");
            }
            else {
                System.out.println("Esta cuenta no es morosa.");
            }
        }
    }
    private static void actualizarCuentaCorriente(Cuenta[] cuentas){
        Scanner sc = new Scanner(System.in);
        boolean existeCuentaCorriente = false;
        for (int i = 0; i < cuentas.length; i++){
            if (cuentas[i] instanceof CuentaCorriente){
                existeCuentaCorriente = true;
                System.out.println(i+". Identificador de la cuenta corriente: " +amarillo+ cuentas[i].getIdentificador()+reset);
            }
        }
        if (!existeCuentaCorriente){
            System.out.println("No existe ninguna cuenta corriente");
        }
        else {
            System.out.print("Elige una cuenta: ");
            int respuesta = sc.nextInt();
            if (cuentas[respuesta] instanceof CuentaCorriente){
                ((CuentaCorriente) cuentas[respuesta]).actualizarCuenta();
            }
            System.out.println("El nuevo saldo de la cuenta es: " +verde+ cuentas[respuesta].getSaldo()+"€"+reset);
        }
    }
    private static void aplicarInteres(Cuenta[] cuentas){
        Scanner sc = new Scanner(System.in);
        boolean existeCuentaRemunerada = false;
        //muestro las cuentas remuneradas
        for (int i = 0; i < cuentas.length; i++){
            if (cuentas[i] instanceof CuentaCorriente || cuentas[i] instanceof  CuentaPersonal ||cuentas[i] instanceof CuentaEmpresa){
                existeCuentaRemunerada = true;
                System.out.println(i+". Identificador de la cuenta remunerada es: " + cuentas[i].getIdentificador());
            }
        }
        if (!existeCuentaRemunerada){
            System.out.println("No existe ningun tipo de cuenta remunerada");
        }
        else {
            System.out.print("Elige una cuenta: ");
            int respuesta = sc.nextInt();
            if (cuentas[respuesta] instanceof CuentaPersonal){
                ((CuentaPersonal) cuentas[respuesta]).aplicarInteres();
            }
            else if (cuentas[respuesta] instanceof CuentaEmpresa){
                ((CuentaEmpresa) cuentas[respuesta]).aplicarInteres();
            }
            System.out.println("El nuevo saldo es: " + cuentas[respuesta].getSaldo());
        }
    }
    private static void mostrarIdentificadores(Cuenta[] cuentas, int indice){
        for (int i = 0; i < indice; i++){
            System.out.println(i + ". Identificador de la cuenta: " + cuentas[i].getIdentificador());
        }
    }
}
