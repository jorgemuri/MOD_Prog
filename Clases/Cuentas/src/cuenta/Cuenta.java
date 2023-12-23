package cuenta;

import java.util.Scanner;

public class Cuenta {
    private int NCuenta;
    private float Saldo;

    //Métodos
    public Cuenta(int NCuenta) {
        this.NCuenta = NCuenta;
        Saldo = 0;
    }

    public Cuenta(int NCuenta, float saldo) {
        this.NCuenta = NCuenta;
        this.Saldo = saldo;
    }

    public float getSaldo() {
        return Saldo;
    }

    public float Ingresar(float importe){
        this.Saldo += importe;
        return this.Saldo;
    }
    public float Retirar(float importe){
        Scanner sc = new Scanner(System.in);
        if(this.Saldo - importe < 0){
            System.out.println("El saldo te quedaría en números rojos, ¿estás seguro de la operación?\n Pulsa 1 para confirmar.");
            if(sc.nextInt() == 1){
                this.Saldo -= importe;
            }
        }

        return this.Saldo;
    }

    public boolean esMorosa(){
        if(this.Saldo > 0){
            //es negatica
            return  true;
        }
        else {
            //es positiva
            return false;
        }
    }
}
