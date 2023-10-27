package Pepe;

public class Persona {
    // Propiedades

    private String nombre;
    private int edad;
    private float peso;
    private String genero;

        // Métodos

    void nacer(){
        edad = 0;
        nombre = "María";
        peso = 3.5f;
        genero = "Mentirosa";
    }
    void dormir(){
        peso = peso + 3f;
    }
    float engordar(float aumento){
        this.peso = this.peso + peso;
        peso = peso + aumento;
        return this.peso;
    }

    String devolvernombre(){
        return nombre;
    }
    float devolverpeso(){
        return peso;
    }
}
