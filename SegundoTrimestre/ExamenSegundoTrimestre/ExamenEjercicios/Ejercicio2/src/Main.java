import mipaquete.Movil;


public class Main {
    public static void main(String[] args) {

        Movil[] moviles = new Movil[3];

        moviles[0] = new Movil(924205067,0.30f);
        moviles[1] = new Movil(123456789,0.20f);
        moviles[2] = new Movil(987654321,0.25f);

        moviles[0].llamar(moviles[1],320);
        moviles[0].llamar(moviles[2],200);
        moviles[1].llamar(moviles[2],550);

        for (int i = 0; i< moviles.length;i++){
            moviles[i].mostrarDatos();
        }
    }
}
