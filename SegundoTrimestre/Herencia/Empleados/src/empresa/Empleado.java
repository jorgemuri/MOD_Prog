package empresa;

public abstract class Empleado {

    /*Atributos*/
    private String Nombre;
    private int Edad;
    private float Salario;
    private final float PLUS = 100f;
    private static int NumeroEmpleados;

    /*Metodos*/

    public static int getnumeroEmpleados(){
        return NumeroEmpleados;
    }
    public Empleado(String nombre, int edad, float salario) {
        Nombre = nombre;
        Edad = edad;
        Salario = salario;
        NumeroEmpleados++;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Salario=" + Salario +
                ", PLUS=" + PLUS +
                '}';
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    public float getPLUS() {
        return PLUS;
    }

    public int getEdad() {
        return Edad;
    }

    public abstract void aplicarPlus();

}
