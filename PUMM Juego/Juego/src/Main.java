import clases.Partidas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO AL JUEGO");
        boolean salir = false;
        int indice_partida = -1, vida1 = 5, vida2 = 5;
        int[] confi; // confihuraciones
        Partidas[] partidas = new  Partidas[5]; // array de partidas
        while (!salir) {
        System.out.println("1. JUGAR\n2. REGLAS\n3. CONFIGURACIÓN\n4. SALIR");
        System.out.print(">>>");
        int selector = sc.nextInt();
            switch (selector) {
                case 1 -> {
                if(indice_partida < 0){
                    System.out.println("Configura una partida antes");
                }
                else {
                    partidas[indice_partida].EmpezarPartida(vida1,vida2);
                }
                }
                case 2 -> mostrarReglas(sc);
                case 3 -> {
                confi = configuracion(sc);
                indice_partida++;
                partidas[indice_partida] = new Partidas(confi[1],confi[0],confi[2],confi[3],confi[4],confi[5]);
                    System.out.printf("Has configurado la partida %d, cada configuración sera una nueva partida hata un máximo de 5\n", indice_partida);

                }
                case 4 -> {
                    salir = true;
                    System.out.println("¡¡¡Gracias por jugar al juego!!!");
                }
                default -> {
                    System.out.println("¡¡¡Gracias por jugar al juego!!!");
                    salir = true;
                }
            }
        }
    }
    private static void mostrarReglas(Scanner sc){
        boolean dentro = true;
        while (dentro){
            System.out.println("Sobre qué quieres saber?");
            System.out.println("1. FUNCIONAMIENTO DEL JUEGO\n2. OBJETOS\n3. SALIR DE LAS NORMAS\n");
            int selector = sc.nextInt();
            switch (selector){
                case 1 -> {
                    System.out.println("""
                            EL funcionamiento del juego consiste en una partida entre usted y la máquina,
                            y gana aquel que consiga permanecer vivo.
                            Hay una serie de rondas, y cada ronda tiene sus turnos, en los cuales se pueden tomar diferentes decisiones.
                            Las dos más importantes son coger la escopeta y disparar, bien al enemigo o a ti mismo, pero no siempre sale la bala
                            pues al principio de cada ronda se te muestran las diferentes balas que va a haber en la ronda.
                            Pueden ser de dos tipos, rojas las cuales funcionan, y azules, que nunca llegan a salir disparadas por la escopeta.
                            Una vez se toma la opción de disparar, se acaba tu turno y le toca al oponente, pero en un mismo turno se pueden usar
                            todos los objetos que se quiera. (LOS OBJETOS QUE NO SE USEN, LOS PODRÁ UTILIZAR EL CONTRINGANTE)
                            Hay una serie de vidas que al perderlas todas, mueres automaticamente.""");
                    System.out.println("¿Quiéres saber algo más? (s/n)");
                    String respuesta = sc.next();
                    switch (respuesta){
                        case "s" ->{}
                        case "n" ->dentro = false;
                        default ->System.out.println("Escribe s o n");
                    }
                }
                case 2 ->{
                    boolean dentro2 = true;
                    while (dentro2) {
                        System.out.println("""
                                LISTA DE LOS OBJETOS

                                1. LUPA
                                2. CUCHILLO
                                3. CIGARRO
                                4. ESPOSAS
                                5. ATRÁS""");
                        System.out.println("¿Sobre que quieres saber? (pon el índice)");
                        int respuesta = sc.nextInt();
                        switch (respuesta) {
                            case 1 -> {
                                System.out.println("La lupa consiste simplemente en ver si la bala que está en el\n" +
                                        "cargador de la escopeta es roja o azul.");
                                dentro2 = preguntarSaberMas(sc); // función que pregunta si quiere seguir o no
                            }
                            case 2 -> {
                                System.out.println("El cuchillo corta la bocacha de la escopeta y hace que salga un\n" +
                                        "tiro a bocajarro mucho más potente y provoca 2 de daño");
                                dentro2 = preguntarSaberMas(sc);
                            }
                            case 3 -> {
                                System.out.println("Al usar el cigarro, regeneran una vida automaticamente");
                                dentro2 = preguntarSaberMas(sc);
                            }
                            case 4 -> {
                                System.out.println("Cuando usas las esposas, haces que tu oponente pierda un turno");
                                dentro2 = preguntarSaberMas(sc);
                            }
                            case 5 -> dentro2 = false;
                            default -> System.out.println("Pon un número valido.");
                        }
                    }
                }
                case 3 -> dentro = false;
                default -> System.out.println("Pon un número valido");
            }
        }
    }
    private static boolean preguntarSaberMas(Scanner sc){
        System.out.print("¿Quieres saber algo más? (s/n):  ");
        String respuesta2 = sc.next();
        switch (respuesta2){
            case "s" -> {
                return true;
            }
            case "n" -> {
                return false;
            }
            default -> {System.out.println("Pon s o n");
            return true;}
        }
    }
    private static void jugar(Scanner sc){
        int ronda; //contador de la ronda actual
        String turno; //variable que almacena el turno actual

    }
    private static int[] configuracion(Scanner sc){
        int objetos,rondas,lupa,cuchillo,cigarro,esposas;
        String respuesta;
        int[] configuracion = new int[6];

        System.out.print("¿Cuantas rondas quieres que se jueguen?\n AVISO: Cada ronda la juega un solo jugador. Tiene que ser un número par por favor: (8-20)");
        rondas = sc.nextInt();
        System.out.print("¿Quieres jugar con objetos o sin objetos? (1 -> sí, 2 -> no): ");
        objetos = sc.nextInt(); // almaceno si quiere objetos o no
        if (objetos == 1){ //pregunto que objetos quiere
            System.out.print("\n¿Quieres que se juegue la lupa? (s/n): "); //si quiere la lupa
            respuesta = sc.next();
            if(respuesta.equals("s")){
                lupa = 1;
            }
            else{
                lupa = 0;
            }
            System.out.print("\n¿Quieres que se juegue el cuchillo? (s/n): "); //si quiere el cuchillo
            respuesta = sc.next();
            if(respuesta.equals("s")){
                cuchillo = 1;
            }
            else{
                cuchillo = 0;
            }
            System.out.print("\n¿Quieres que se juegue el cigarro? (s/n): "); // si quiere el cigarro
            respuesta = sc.next();
            if(respuesta.equals("s")){
                cigarro = 1;
            }
            else{
                cigarro = 0;
            }
            System.out.print("\n¿Quieres que se jueguen las esposas? (s/n): "); // si quiere las esposas
            respuesta = sc.next();
            if(respuesta.equals("s")){
                esposas = 1;
            }
            else{
                esposas = 0;
            }
            // añado los datos al array
            configuracion[0] = rondas;
            configuracion[1] = objetos;
            configuracion[2] = lupa;
            configuracion[3] = cuchillo;
            configuracion[4] = cigarro;
            configuracion[5] = esposas;
        }
        return configuracion;
    }
}
