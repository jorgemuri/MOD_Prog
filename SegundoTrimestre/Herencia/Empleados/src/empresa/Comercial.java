package empresa;

public class Comercial extends Empleado {
    /*Atributos*/
    private double comision;

    /*Metodos*/
    public Comercial(String nombre, int edad, float salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +"Comercial{" +
                "comision=" + comision +
                '}';
    }

    @Override
    public void aplicarPlus() {
        if(getEdad() >= 30 && comision > 200){
            float salario = getSalario() + getPLUS();
            setSalario(salario);
            System.out.println("Plus aplicado correctamente.");
        }
        else System.out.println("No cumple las condiciones.");
    }
}
