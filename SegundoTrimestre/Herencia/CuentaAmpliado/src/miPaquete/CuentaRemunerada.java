package miPaquete;

public class CuentaRemunerada extends Cuenta{
    private final float interes;

    public CuentaRemunerada(int identificador, float interes) {
        super(identificador);
        this.interes = interes;
    }

    public CuentaRemunerada(int identificador, float saldo, float interes) {
        super(identificador, saldo);
        this.interes = interes;
    }
    public void aplicarInteres(){
        setSaldo(getSaldo()-(getSaldo()*(interes/100f)));
    }
}
