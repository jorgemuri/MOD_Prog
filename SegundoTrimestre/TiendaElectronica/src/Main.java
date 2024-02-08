import electronica.Movil;
import electronica.Ordenador;
import electronica.Producto;
import electronica.Televisor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[10]; // Creo el array de objetos. Máximo 10
        int respuesta = -1, i = 0;

        System.out.println("BIENVENIDO AL PROGRAMA");

        while (respuesta != 0){
            mostrarMenu();
            System.out.print(">>>");
            respuesta = preguntarEntero(); // muestro menu y pregunto la opción

            switch (respuesta){
                case 1:
                    int respuesta2 = anadirProducto();
                    String marca, modelo, procesador;
                    float precio;
                    int ram, pulgadas, hdd;
                    switch (respuesta2) {
                        case 1: // añade un teléfono móvil.

                            System.out.print("Marca: ");
                            marca = preguntarString();
                            System.out.print("Modelo: ");
                            modelo = preguntarString();
                            System.out.print("Precio: ");
                            precio = preguntarFloat();
                            System.out.print("Procesador: ");
                            procesador = preguntarString();
                            System.out.print("Total RAM: ");
                            ram = preguntarEntero();
                            System.out.print("Pulgadas: ");
                            pulgadas = preguntarEntero();

                            productos[i] = new Movil(marca, modelo, precio, procesador, ram, pulgadas); // creo el teléfono móvil
                            i++; // incremento el índice para que no haya conflicto
                            break;
                        case 2: // añade ordenador
                            System.out.print("Marca: ");
                            marca = preguntarString();
                            System.out.print("Modelo: ");
                            modelo = preguntarString();
                            System.out.print("Precio: ");
                            precio = preguntarFloat();
                            System.out.print("Procesador: ");
                            procesador = preguntarString();
                            System.out.print("Total RAM: ");
                            ram = preguntarEntero();
                            System.out.print("HDD: ");
                            hdd = preguntarEntero();

                            productos[i] = new Ordenador(marca, modelo, precio, procesador, ram, hdd); // creo el ordenador
                            i++; // incremento el índice para que no haya conflicto
                            break;
                        case 3: // añade televisor
                            System.out.print("Marca: ");
                            marca = preguntarString();
                            System.out.print("Modelo: ");
                            modelo = preguntarString();
                            System.out.print("Precio: ");
                            precio = preguntarFloat();
                            System.out.print("Pulgadas: ");
                            pulgadas = preguntarEntero();

                            productos[i] = new Televisor(marca, modelo, precio, pulgadas); // creo el ordenador
                            i++; // incremento el índice para que no haya conflicto
                            break;
                        default:
                            System.out.println("..."); // no añade ninguno
                            break;
                    }
                    break;
                case 2: // muestro la cantidad de productos que tenemos
                    System.out.println("Tenemos "+ Producto.getInventario() + " productos");
                    break;
                case 3:
                    if(i == 0){
                        System.out.println("No tenemos productos actualmente.");
                        break;
                    }
                    mostrarProductos(productos,i);
                    break;
                case 4:
                    if(i == 0){
                        System.out.println("No tenemos productos actualmente.");
                        break;
                    }
                    caracteristicasConcretas(productos,i);
                    break;
                case 5:
                    if(i == 0){
                        System.out.println("No tenemos productos actualmente.");
                        break;
                    }
                    consultarPrecio(productos,i);
                    break;
                case 6:
                    if(!ComprobarSiHayTipo(productos,i,1)){ // compruebo si hay móviles
                        System.out.println("No tenemos móviles actualmente.");
                        break;
                    }
                    llamarNumero(productos,i);
                    break;
                case 7:
                    if(!ComprobarSiHayTipo(productos,i,2)){ // compruebo si hay ordenadores
                        System.out.println("No tenemos ordenadores actualmente.");
                        break;
                    }
                    cambiarRam(productos,i);
                    break;
                case 8:
                    if(!ComprobarSiHayTipo(productos, i, 3)){ // compruebo si hay televisores
                        System.out.println("No tenemos televisores actualmente.");
                        break;
                    }
                    cambiarCanal(productos,i);
                    break;
                case 0:
                    System.out.println("Gracias por usar el programa");
                    break;
                default: // por si pone cualquier otro tipo de número
                    System.out.println("Pon un número válido");
                    break;
            }

        }

    }
    private static void mostrarMenu(){
        System.out.println("------------------------");
        System.out.println("""
                ¿Qué deseas hacer?
                
                1. Añadir un producto
                2. Numero de productos
                3. Características de todos los productos
                4. Características de un tipo de producto concreto
                5. Consultar precio de un producto
                6. Llamar a un número.
                7. Cambiar la RAM de un ordenador.
                8. Cambiar de canal un televisor.
                0. SALIR
                """);
    }
    private static int preguntarEntero(){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean salir = false;
        while (!salir){
            try {
                numero = sc.nextInt();
                salir = true;
            }
            catch (InputMismatchException e){
                System.out.println("ERROR: Mete un número entero");
                sc.next();
            }
        }
        return numero;
    }
    private static String preguntarString(){
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        System.out.print(">>>");
        return sc.next();
    }
    private static float preguntarFloat(){
        Scanner sc = new Scanner(System.in);
        float numero = 0;
        boolean salir = false;
        while (!salir){
            try {
                numero = sc.nextFloat();
                salir = true;
            }
            catch (InputMismatchException e){
                System.out.println("ERROR: Mete un número válido. Recuerda que es con ,");
                sc.next();
            }
        }
        return numero;
    }
    private static int anadirProducto(){
        System.out.println("Que producto quieres añadir?");
        listarTipos();
        System.out.print(">>>");
        return preguntarEntero();
    }
    private static void mostrarProductos(Producto[] productos, int numeroObjetos){
        for (int i = 0; i < numeroObjetos; i++){ // muestro todos los productos
            System.out.println(i + ". " + productos[i]);
        }
    }
    private static void caracteristicasConcretas(Producto[] productos, int i){
        System.out.println("¿De qué tipo quieres ver todas sus características? ");
        listarTipos();
        System.out.print(">>>");
        int tipo = preguntarEntero();
        switch (tipo){
            case 1:
                for (int indice = 0; indice < i; indice++){
                    if(productos[indice].getClass() == Movil.class){ //compruebo si es de tipo movil el objeto
                        System.out.println(productos[indice]);
                    }
                }
                break;
            case 2:
                for (int indice = 0; indice < i; indice++){
                    if(productos[indice].getClass() == Ordenador.class){ //compruebo si es de tipo Ordenador el objeto
                        System.out.println(productos[indice]);
                    }
                }
                break;
            case 3:
                for (int indice = 0; indice < i; indice++){
                    if(productos[indice].getClass() == Televisor.class){ //compruebo si es de tipo Televisor el objeto
                        System.out.println(productos[indice]);
                    }
                }
                break;
            default:
                System.out.println("...");
                break;
        }
    }
    private static void listarTipos(){ //listo los 3 tipos que de productos
        System.out.println("""
                |||||
                1. Móvil
                2. Ordenador
                3. Televisor
                4. Volver
                |||||
                """);
    }
    private static void consultarPrecio(Producto[] productos, int i){
        boolean existeProducto = false;
        System.out.println("Dime la marca del producto: ");
        String marca = preguntarString();
        System.out.println("Dime el modelo del producto: ");
        String modelo = preguntarString();
        for (int indice = 0; indice < i; indice++){
            if(((productos[indice].getMarca())).equalsIgnoreCase((marca))){ // veo si hay algún producto que tenga esa marca
                if(((productos[indice].getModelo())).equalsIgnoreCase((modelo))){ // veo si hay algún producto que tenga ese modelo
                    existeProducto = true;
                    System.out.println("Existe: " + productos[indice]);
                    System.out.printf("El precio del producto es de %.2f\n", (productos[indice].getPrecio() - productos[indice].calcularDescuento()));
                }
            }
        }
        if(!existeProducto){
            System.out.println("No existe ningún producto con esas características");
        }

    }
    private static void llamarNumero(Producto[] productos, int i){
        System.out.println("Dime la marca del movil con el que quieres llamar: ");
        String marca = preguntarString();
        System.out.println("Dime el modelo del movil con el que quieres llamar: ");
        String modelo = preguntarString();
        System.out.println("Dime el numero que quieres llamar");
        String numero = preguntarString();
        for (int indice = 0; indice < i; indice++){
            if(((productos[indice].getMarca())).equalsIgnoreCase((marca))){ // veo si hay algún producto que tenga esa marca
                if(((productos[indice].getModelo())).equalsIgnoreCase((modelo))){ // veo si hay algún producto que tenga ese modelo
                    ((Movil) productos[indice]).llamar(numero);
                }
            }
        }
    }
    private static void cambiarRam(Producto[] productos, int i){
        System.out.println("Dime la marca del ordenador con el que quieres llamar: ");
        String marca = preguntarString();
        System.out.println("Dime el modelo del ordenador con el que quieres llamar: ");
        String modelo = preguntarString();
        System.out.print("Dime la ram que quieres añadir: ");
        int ramPlus= preguntarEntero();
        for (int indice = 0; indice < i; indice++){
            if(((productos[indice].getMarca())).equalsIgnoreCase((marca))){ // veo si hay algún producto que tenga esa marca
                if(((productos[indice].getModelo())).equalsIgnoreCase((modelo))){ // veo si hay algún producto que tenga ese modelo
                    ((Ordenador) productos[indice]).ampliarRam(ramPlus);
                }
            }
        }
    }
    private static void cambiarCanal(Producto[] productos, int i){
        System.out.println("Dime la marca del televisor con el que quieres llamar: ");
        String marca = preguntarString();
        System.out.println("Dime el modelo del televisor con el que quieres llamar: ");
        String modelo = preguntarString();
        System.out.println("¿A que canal quieres cambiar? ");
        String nuevoCanal = preguntarString();
        for (int indice = 0; indice < i; indice++){
            if(((productos[indice].getMarca())).equalsIgnoreCase((marca))){ // veo si hay algún producto que tenga esa marca
                if(((productos[indice].getModelo())).equalsIgnoreCase((modelo))){ // veo si hay algún producto que tenga ese modelo
                    ((Televisor) productos[indice]).cambiarCanal(nuevoCanal);
                }
            }
        }
    }
    private static boolean ComprobarSiHayTipo(Producto[] productos, int i, int tipo){
        if(tipo == 1){ //si quiero comprobar si existe movil
            for (int indice = 0; indice < i; indice++){
                if (productos[indice].getClass() == Movil.class){
                    return true;
                }
            }
        } else if (tipo == 2) { // si quiero comprobar si existe ordenador
            for (int indice = 0; indice < i; indice++){
                if (productos[indice].getClass() == Ordenador.class){
                    return true;
                }
            }
        }
        else{ //si quiero comproar si existe tele
            for (int indice = 0; indice < i; indice++){
                if (productos[indice].getClass() == Televisor.class){
                    return true;
                }
            }
        }
        return false;
    }
}
