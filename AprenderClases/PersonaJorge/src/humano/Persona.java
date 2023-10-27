package humano;

public class Persona {

    //Atributos

    private String nombre;
    private int edad;
    private float peso;
    private String profesion;
    private float recorrido;

    //Fin Atributos

    //MÉTODOS

    public String nacer(String nombre){
        edad = 0;
        peso = 2.5f;
        profesion = "Desempleado";
        this.nombre = nombre;
        return this.nombre;
    }

    public float caminar(float distancia){
        this.recorrido = this.recorrido + distancia;
        return this.recorrido;
    }

    public float engordar(float peso){
        this.peso = this.peso + peso;
        return this.peso;
    }


    //FIN DE MÉTODOS
}
