package persona;

public class Persona {

    /*Propiedades*/
    private String nombre, dni="";
    private final String apellidos;
    private int edad;
    private final int anioNacimiento;

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
        final String cadenaletrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        String dni_noletra = Integer.toString(dni);
        this.dni = dni_noletra + cadenaletrasDNI.charAt(resto);
    }

    private void calcularEdad(int anioNacimiento){
        final int anioactual = 2023;
        this.edad = anioactual - anioNacimiento;
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
