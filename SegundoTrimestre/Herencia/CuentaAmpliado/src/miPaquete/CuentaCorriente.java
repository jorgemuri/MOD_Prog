package miPaquete;

public class CuentaCorriente extends Cuenta{
    private final float[] recibos;
    private final String titular;

    public CuentaCorriente(int identificador, float[] recibos, String titular) {
        super(identificador);
        this.recibos = recibos;
        this.titular = titular;
    }

    public CuentaCorriente(int identificador, float saldo, float[] recibos, String titular) {
        super(identificador, saldo);
        this.recibos = recibos;
        this.titular = titular;
    }

    public void actualizarCuenta(){
        float importe = 0f;
        for (int i = 0; i < recibos.length; i++){
            importe+=recibos[i];
        }
        setSaldo(getSaldo()-importe);
    }
}
