package cuenta;

import java.util.Scanner;

public class Cuenta {
    private int NCuenta;
    private float Saldo;
    private static float SaldoTotal; //Variable estatica para almacenar el saldo todal de todas las cuentas
    private static  int totalCuentas;

    //Métodos
    public static float getSaldoTotal() {
        return SaldoTotal;
    }

    public static int getTotalCuentas() {
        return totalCuentas;
    }
    public Cuenta(int NCuenta) {
        this.NCuenta = NCuenta;
        Saldo = 0;
        totalCuentas++;
    }

    public Cuenta(int NCuenta, float saldo) {
        this.NCuenta = NCuenta;
        this.Saldo = saldo;
        SaldoTotal = SaldoTotal + this.Saldo;
        totalCuentas++;
    }

    public float getSaldo() {
        return Saldo;
    }
    public int getNCuenta(){
        return NCuenta;
    }

    public float Ingresar(float importe){
        this.Saldo += importe;
        SaldoTotal = SaldoTotal + importe;
        return this.Saldo;
    }
    public float Retirar(float importe){
        Scanner sc = new Scanner(System.in);
        if(this.Saldo - importe < 0){
            System.out.println("El saldo te quedaría en números rojos, ¿estás seguro de la operación?\n Pulsa 1 para confirmar.");
            if(sc.nextInt() == 1){
                this.Saldo -= importe;
                SaldoTotal = SaldoTotal - importe;
            }
        }

        return this.Saldo;
    }

    public boolean esMorosa(){
        if(this.Saldo > 0){
            return false;
        }
        else {
            return true;
        }
    }
}
