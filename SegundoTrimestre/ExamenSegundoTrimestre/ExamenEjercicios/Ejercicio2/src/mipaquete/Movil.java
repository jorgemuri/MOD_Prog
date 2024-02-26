package mipaquete;

public class Movil {
    private final int Numero;
    private int Tiempo;
    private final float Tarifa;
    private float Gasto;

    /*Métodos*/

    public Movil(int numero, float tarifa) {
        Numero = numero;
        Tarifa = tarifa;
    }

    public int getTiempo() {
        return Tiempo;
    }
    public float getTarifa() {
        return Tarifa;
    }
    public float getGasto() {
        return Gasto;
    }
    public void setGasto(float gasto) {
        Gasto = gasto;
    }

    public void setTiempo(int tiempo) {
        Tiempo = tiempo;
    }

    public void llamar(Movil objeto, int tiempo){
        System.out.println("Has llamado durante "+tiempo+"segundos");
        Gasto = Gasto+(Tarifa*tiempo);
        objeto.setGasto(getGasto()+(getTarifa()*tiempo));
        Tiempo+=tiempo;
        objeto.setTiempo(getTiempo()+tiempo);

    }
    public void mostrarDatos(){
        int minutos, segundos;
        minutos = Tiempo/60;
        segundos= Tiempo%60;
        System.out.println("\nEl número del teléfono es: "+Numero);
        System.out.println("El tiempo total de uso es: "+minutos+" minutos y "+segundos+" segundos"); //MAL RETOCAR
        System.out.println("El precio total facturado es: "+ Gasto+"€");
    }
}
