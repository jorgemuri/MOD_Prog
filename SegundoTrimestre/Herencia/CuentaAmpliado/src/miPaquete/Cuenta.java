package miPaquete;

import java.util.Scanner;

public class Cuenta {
    private int identificador;
    private float saldo;


    public Cuenta(int identificador){
        this.identificador = identificador;
        saldo = 0f;
    }
    public Cuenta(int identificador, float saldo) {
        this.identificador = identificador;
        this.saldo = saldo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float ingresar(float importe){
        saldo+=importe;
        return saldo;
    }
    public float retirar(float importe){
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        if (saldo - importe < 0) {
            System.out.println("El saldo te quedará negativo. ¿Estás seguro de lo que haces? (si, no): ");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("si")) {
                saldo-=importe;
            }
        }
        return saldo;
    }
    public boolean esMorosa(){
        if (saldo < 0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "identificador=" + identificador +
                ", saldo=" + saldo +
                '}';
    }
}
