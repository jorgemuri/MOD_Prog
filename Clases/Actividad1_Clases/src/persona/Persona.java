package persona;

public class Persona {

    /*Propiedades*/
    private String nombre, dni="";
    private final String cadenaletrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE", apellidos;
    private int anioNacimiento, edad;

    /*Fin propiedades*/

    /*Métodos*/

    public Persona(String nombre, String apellidos, int dni, int anioNacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        calcularDni(dni);
        calcularEdad(anioNacimiento);
        this.anioNacimiento = anioNacimiento;
    }

    private void calcularDni(int dni){
        int resto = dni % 23;
        String dni_noletra = Integer.toString(dni);
        this.dni = dni_noletra + cadenaletrasDNI.charAt(resto);
    }

    private void calcularEdad(int anioNacimiento){
        this.edad = 2023 - anioNacimiento;
    }
    public void cambiarnombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                ", edad=" + edad +
                '}';
    }
    /*Fin métodos*/
}
