package electrodomesticos;

public class Electrodomestico {
    private static String[] coloresPosibles = {"blanco","negro","rojo","azul","gris"};
    private static char[] letrasPosibles = {'A','B','C','D','E','F'};
    private String marca;
    colores color;
    public enum colores {blanco,negro,rojo,azul,gris};
    private char consumoEnergetico;
    private float peso, precio;

    public Electrodomestico(String marca, char consumoEnergetico, float peso, float precio, colores color) {
        this.marca = marca;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico); // compruebo si la letra está bien.
    }

    public void precioFinal(){
        //compruebo la letra
        switch (consumoEnergetico){
            case 'A' ->
                precio = precio + 100.00f;
            case 'B' ->
                precio = precio + 80.00f;
            case 'C' ->
                precio = precio + 60.00f;
            case 'D' ->
                precio = precio + 50.00f;
            case 'E' ->
                precio = precio + 30.00f;
            case 'F' ->
                precio = precio + 10.00f;
        }
        //compruebo el peso
        if(peso<=19 && peso>0){
            precio+=10.00f;
        } else if (peso>19 && peso<=49) {
            precio+=50.00f;
        }
        else if (peso>49 && peso<=79) {
            precio+=80.00f;
        }
        else if (peso>=80) {
            precio+=100.00f;
        }
        else {
            System.out.println("Los peso no puede ser negativo");
        }

    }

    private char comprobarConsumoEnergetico(char letra){
        for (int i = 0; i < letrasPosibles.length; i++){
            if (letrasPosibles[i] == letra){
                return letra; // Sí encuentra la letra devuelve la letra
            }
        }
        return 'F'; // si no encuentra nada se devuelve la letra F
    }

    @Override
    public String toString() {
        return "ELECTRODOMESTICO  [" +
                "MARCA='" + marca + '\'' +
                ", CONSUMO ENERGÉTICO='" + consumoEnergetico + '\'' +
                ", COLOR='" + color + '\'' +
                ", PESO=" + peso + '\'' +
                ", PRECIO=" + precio +
                ']';
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }
}
