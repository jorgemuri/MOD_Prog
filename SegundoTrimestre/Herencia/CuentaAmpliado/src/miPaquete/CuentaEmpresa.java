package miPaquete;

public class CuentaEmpresa extends CuentaRemunerada{
    public CuentaEmpresa(int identificador, float interes) {
        super(identificador, interes);
    }

    public CuentaEmpresa(int identificador, float saldo, float interes) {
        super(identificador, saldo, interes);
    }

    @Override
    public void aplicarInteres() {
        super.aplicarInteres();
        setSaldo(getSaldo()-(getSaldo()*0.05f));
    }
}
