import electrodomesticos.Electrodomestico;
import electrodomesticos.Lavadora;
import electrodomesticos.Television;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[6];

        electrodomesticos[0] = new Lavadora("philips",'A',100.5f,1000.9f, Electrodomestico.colores.gris,15.0f);
        electrodomesticos[1] = new Television("xiaomi", 'H',40f,400, Electrodomestico.colores.rojo,40f,true);
        electrodomesticos[2] = new Lavadora("samsung",'D',60f,600f, Electrodomestico.colores.negro,50f);
        electrodomesticos[3] = new Lavadora("Pedro Pica Ropa",'L',5f,10000.99992f, Electrodomestico.colores.azul,1000f);
        electrodomesticos[4] = new Television("lg",'E',5f,200.99f, Electrodomestico.colores.negro,20f,false);
        electrodomesticos[5] = new Television("visualThinking",'F',30.678f,350.00f, Electrodomestico.colores.rojo,31.9f,true);

        for (int i = 0; i < electrodomesticos.length; i++){ //actualizo los precios
            electrodomesticos[i].precioFinal();
        }

        System.out.println();

        for (int i = 0; i < electrodomesticos.length; i++){ // muestro sus características
            System.out.println(electrodomesticos[i]);
        }

        System.out.println();

        float sumaPrecioLavadoras = 0f, sumaPrecioTelevisores = 0f;
        for (int i = 0; i < electrodomesticos.length; i++){ // muestro precio total de todas las lavadoras juntas y televisores.
            if (electrodomesticos[i] instanceof Lavadora){
                sumaPrecioLavadoras+=electrodomesticos[i].getPrecio();
            }
            else {
                sumaPrecioTelevisores+=electrodomesticos[i].getPrecio();
            }
        }
        System.out.println("El precio total de las lavadoras es: " +sumaPrecioLavadoras);
        System.out.println("El precio total de los televisores es: " +sumaPrecioTelevisores);

        System.out.println();

        float aux1 = 0f, aux2 = 0f;
        for (int i = 0; i < electrodomesticos.length; i++){ // muestro las características del más caro
            if (electrodomesticos[i] instanceof Lavadora){
                if (electrodomesticos[i].getPrecio() > aux1){
                    aux1 = electrodomesticos[i].getPrecio();
                }
            }
            else {
                if (electrodomesticos[i].getPrecio() > aux2){
                    aux2 = electrodomesticos[i].getPrecio();
                }
            }
        }
        for (int i = 0; i<electrodomesticos.length;i++){ // muestro todas las características
            if (electrodomesticos[i] instanceof Lavadora){
               if (electrodomesticos[i].getPrecio() == aux1){
                   System.out.println(electrodomesticos[i]);
               }
            }
            else{
                if (electrodomesticos[i].getPrecio() == aux2){
                    System.out.println(electrodomesticos[i]);
                }
                ((Television)electrodomesticos[i]).instalarNetflix(); // además instalo netflix en las teles que son compatibles.
                System.out.println();
            }
        }
    }
}
