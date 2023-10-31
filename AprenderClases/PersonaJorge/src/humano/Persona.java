package humano;

public class Persona {

    //Atributos

    private String nombre;
    private int edad;
    private float peso;
    private String profesion;
    private float recorrido;

    //Fin Atributos

    /*MÉTODOS*/

    public Persona (String nombre){
        this.edad = 45;
        this.peso = 75.9f;
        this.profesion = "Desempleado";
        this.nombre = nombre;
    }

    public void caminar(float distancia){
        this.recorrido += distancia;
    }

    public float engordar(float peso){
        this.peso += peso;
        return this.peso;
    }

    /* Métodos para mostrar*/

    public String getNombre() { return nombre; }

    public float getPeso() { return peso; }

    public float getRecorrido() { return recorrido; }

    public int getEdad() { return this.edad; }


   /* FIN DE MÉTODOS */
}
