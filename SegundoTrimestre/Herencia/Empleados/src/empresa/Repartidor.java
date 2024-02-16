package empresa;

public class Repartidor extends Empleado{
    /*Atributos*/
    private String zona;

    /*Metodos*/
    public Repartidor(String nombre, int edad, float salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +"Repartidor{" +
                "zona='" + zona + '\'' +
                '}';
    }

    @Override
    public void aplicarPlus() {
        if(getEdad() <= 25 && zona.equals("zona 3")){
            float salario = getSalario() + getPLUS();
            setSalario(salario);
            System.out.println("Plus aplicado correctamente");
        }
        else System.out.println("No cumple con los requisitos");
    }
}
