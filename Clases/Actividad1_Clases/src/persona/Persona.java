package persona;

public class Persona {

    /*Propiedades*/
    private String nombre = "", apellidos="",dni="";
    private int anioNacimiento;

    /*Fin propiedades*/

    /*Métodos*/

    public Persona(String nombre, String apellidos, String dni, int anioNacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.anioNacimiento = anioNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                '}';
    }

    /*Fin métodos*/
}
