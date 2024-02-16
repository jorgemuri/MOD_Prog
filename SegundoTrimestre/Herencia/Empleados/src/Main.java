import empresa.*;
import java.util.Scanner;

public class Main {
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5]; // array de objetos empleados
        int respuesta = 0;
        while (respuesta != -1){
            mostrarMenu();
            respuesta = sc.nextInt();
            switch (respuesta){
                case 1: // añado un comercial
                    anadirEmpleado(1,empleados,Empleado.getnumeroEmpleados());
                    break;
                case 2: // añado un empleado
                    anadirEmpleado(2,empleados,Empleado.getnumeroEmpleados());
                    break;
                case 3: // aplico Plus
                    aplicarPlus(empleados);
                    break;
                case 4: // ver empleados
                    mostrarEmpleados(empleados);
                    break;
                default:
                    break;
            }
        }
    }
    private static void mostrarMenu(){
        System.out.println(ROJO + "1. " + VERDE+ "Añadir un comercial\n" + ROJO + "2. " + VERDE + "Añadir un repartidor\n"+
                ROJO + "3. " + VERDE + "Aplicar plus\n" + ROJO +"4. " + VERDE + "Ver empleados\n" + ROJO + "-1 " + VERDE + "Salir");
    }
    private static void anadirEmpleado(int TipoEmpleado, Empleado[] empleados, int indice){
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");

        System.out.print("Dime el nombre del empleado:");
        String nombre = sc.next();
        System.out.print("Dime la edad del empleado: ");
        int edad = sc.nextInt();
        System.out.print("Dime el salario del empleado: ");
        float salario = sc.nextFloat();

        if (TipoEmpleado == 1){ // añado comercial
            System.out.print("Dime la comisión: ");
            double comision = sc.nextDouble();
            empleados[indice] = new Comercial(nombre,edad,salario,comision);
        } else if (TipoEmpleado == 2) { // añado Repartidor
            System.out.print("Dime la zona en la que trabaja el repartidor: ");
            String zona = sc.next();
            empleados[indice] = new Repartidor(nombre,edad,salario,zona);
        }
    }
    private static void aplicarPlus(Empleado[] empleados){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                A quien le quieres aplicar el plus:\s
                1. Comercial.
                2. Repartidor""");
        if(sc.nextInt() == 1) {
            boolean existe = false;
            System.out.println("¿Qué comercial quieres seleccionar?");
            if (Empleado.getnumeroEmpleados() != 0) {
                for (int i = 0; i < Empleado.getnumeroEmpleados(); i++) {
                    if (empleados[i] instanceof Comercial) {
                        System.out.println(i + ". " + empleados[i]);
                        existe = true;
                    }
                }
                if (!existe) {
                    System.out.println("No existe ningún comercial.");
                } else {
                    System.out.print(">>>");
                    int indiceEmpleado = sc.nextInt();
                    empleados[indiceEmpleado].aplicarPlus(); // aplico el plus
                    System.out.println("El nuevo salario es: " + empleados[indiceEmpleado].getSalario());
                }
            } else {
                System.out.println("No hay empleados");
            }
        }
        else {
            boolean existe = false;
            for (int i = 0; i < Empleado.getnumeroEmpleados();i++){
                if(empleados[i] instanceof Repartidor){
                    System.out.println(i+ ". "+empleados[i]);
                    existe = true;
                }
            }
            if(!existe){
                System.out.println("No existe ningún repartidor.");
            }
            else {
                System.out.print(">>>");
                int indiceEmpleado = sc.nextInt();
                empleados[indiceEmpleado].aplicarPlus(); // aplico el plus
                System.out.println("El nuevo salario es: "+empleados[indiceEmpleado].getSalario());
            }
        }
        System.out.println();
    }
    private static void mostrarEmpleados(Empleado[] empleados){
        if (Empleado.getnumeroEmpleados() == 0){
            System.out.println("No hay empleados");
        }
        else {
            for(int i = 0; i < Empleado.getnumeroEmpleados();i++){
                System.out.println(AMARILLO +empleados[i]);
            }
        }
        System.out.println();
    }
}
