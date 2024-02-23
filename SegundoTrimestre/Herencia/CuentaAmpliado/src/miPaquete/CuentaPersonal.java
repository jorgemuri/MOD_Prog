package miPaquete;

public class CuentaPersonal extends CuentaRemunerada{
    public CuentaPersonal(int identificador, float interes) {
        super(identificador, interes);
    }

    public CuentaPersonal(int identificador, float saldo, float interes) {
        super(identificador, saldo, interes);
    }
}
