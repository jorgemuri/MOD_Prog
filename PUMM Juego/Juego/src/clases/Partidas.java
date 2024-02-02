package clases;

import java.util.Scanner;

public class Partidas {
    //atributos

    private final boolean objetos, lupa, cuchillo, esposas, cigarro; //las configuraciones
    private boolean tieneLupa;
    private boolean tieneCuchillo;
    private boolean tieneCigarro;
    private boolean tieneEsposas;
    private int rondas, Nlupas,Ncuchillo,Nesposas,Ncigarro;
    private static int turno = 2;

    //fin atributos


    public Partidas(int objetos, int rondas, int lupa, int cuchillo, int cigarro, int esposas) {
        this.rondas = rondas;
        this.objetos = (1 == objetos); //si hay objetos
        this.lupa = (1 == lupa); //si hay lupa
        this.cuchillo = (1 == cuchillo); //si hay cuchillo
        this.cigarro = (1 == cigarro); // si hay cigarro
        this.esposas = (1 == esposas); //si hay esposas
    }

    public void EmpezarPartida(int vidaJugador1, int vidaJugador2){
        Scanner sc = new Scanner(System.in);
        int[] vidas = new int[3]; // array que guarda las vidas y si se han acabado las vidas
        vidas[0] = vidaJugador1;
        vidas[1] = vidaJugador2;
        String nombre1, nombre2;
        //pregunto los nombres de los jugadores
        System.out.print("Nick del jugador 1 (una única palabra):");
        nombre1 = sc.next();
        System.out.print("Nick del jugador 2 (una única palabra):");
        nombre2 = sc.next();
        // si fuera 1 termina la partida (indica si se le han acabado las vidas a alguno)
        System.out.println("HA EMPEZADO LA PARTIDA. ¡¡¡ SUERTE !!!");
        int index = 0;
        while (this.rondas>0 && (vidas[2] == 0)){
            index ++;
            int[] vidasaux = ronda(vidas, nombre1, nombre2);
            System.out.println("------------------------------------------");
            System.out.println("\nNUEVA RONDA: (" + index + ")\n");
            System.out.println("------------------------------------------");
            vidas[0] = vidasaux[0];
            vidas[1] = vidasaux[1];
            vidas[2] = vidasaux[2];
            this.rondas--;
        }
        if (this.rondas < 0){ // si se ha acabado la partida por fin de rondas
            if(vidas[0] > vidas[2]){
                System.out.println("HA GANADO EL JUGADOR 1");
            }
            else if (vidas[0] < vidas[1]){
                System.out.println("HA GANADO EL JUGADOR 2");
            }
            else {
                System.out.println("HABEIS QUEDADO EMPATE, BIEN JUGADO");
            }
        }
        System.out.println("LA PARTIDA HA FINALIZADO, GRACIAS POR JUGAR");
    }

    private int[] ronda(int[] vidas, String nombre1, String nombre2){
        Scanner sc = new Scanner(System.in);
        int[] balas =  anadirBalas(); // posicion 0 --> Balas rojas. Posicion 1 --> balas azules
        int balasRojas = balas[0], balasAzules = balas[1];
        int balasTotales = balasRojas + balasAzules;
        boolean seJuegaRoja;
        int vida1 = vidas[0];
        int vida2 = vidas[1];
        System.out.printf("\n-----> Hay %d balas rojas y %d balas azules\n", balasRojas, balasAzules);
        //bucle de cada turno
        while (balasTotales >0){  // selecciono la bala que se juega
            boolean usaEsposas = false;
            boolean dobleDamage = false;
            if(turno % 2 == 0){
                System.out.println("\nTurno de "+ nombre1 + "\n");
                System.out.println("Te quedan " + vida1 + " vidas");
            }
            else {
                System.out.println("\nTurno de " + nombre2 + "\n");
                System.out.println("Te quedan " + vida2 + " vidas");
            }
            int probabilidadRoja = balasAzules + 1;

            if (balasAzules <= 0){
                seJuegaRoja = true;
            } else if (balasRojas <= 0) { // se juega azul
                seJuegaRoja = false;
            } else {
                if(1 == ((int) (Math.random()*(probabilidadRoja + 1)))){ // si hay 0 balas azules sera si o si bala roja
                    // se juega bala roja
                    seJuegaRoja = true;
                    balasRojas--;
                }
                else {// se juega bala azul
                    seJuegaRoja = false;
                    balasAzules--;
                }
            }

            if(this.objetos){ //doy objetos si están activados
                boolean[] objetosEnPartida = darobjetos();
                for (int i = 0; i < objetosEnPartida.length; i++) { // hago un for para añadir los objetos.
                    if (objetosEnPartida[i]) {
                        switch (i) {
                            case 0 -> this.Nlupas++; // tiene lupa
                            case 1 -> this.Ncuchillo++; // tiene cuchillo
                            case 2 -> this.Ncigarro++; // tiene cigarro
                            case 3 -> this.Nesposas++;   // tiene esposas
                        }
                    }
                }

                System.out.printf("Tienes %d lupas, %d cuchillos, %d cigarros y %d esposas.\n", this.Nlupas,this.Ncuchillo,this.Ncigarro, this.Nesposas);
                if(this.Nesposas + this.Ncigarro + this.Ncuchillo + this.Nlupas != 0){
                    System.out.print("¿Quiéres usar algún objeto? (s/n): ");
                    if(sc.next().equals("s")){
                        boolean dentro = true;
                        while (dentro){
                            System.out.print("""
                                    ¿Cuál quieres usar?
                                    1. Lupa
                                    2. Cuchillo
                                    3. Cigarro
                                    4. Esposa
                                    """);
                            int respuesta = sc.nextInt();
                            switch (respuesta){
                                case 1:  // se juega lupa
                                    if(this.Nlupas > 0){
                                        this.Nlupas--;
                                        if(seJuegaRoja){
                                            System.out.println("La bala que está en el cargador es de color roja");
                                            dentro = usarMasObjetos(sc);
                                        }
                                        else {System.out.println("La bala que está en el cargador es de color azul");
                                            dentro = usarMasObjetos(sc);
                                        }
                                    }
                                    else {
                                        System.out.println("No tienes lupas");
                                        dentro = usarMasObjetos(sc);
                                    }
                                    break;
                                case 2: // se juega cuchillo
                                    if(this.Ncuchillo>0){
                                        this.Ncuchillo--;
                                        System.out.println("La escopeta ha sido recortada. (DOBLE DAÑO)");
                                        dobleDamage = true;
                                        dentro = usarMasObjetos(sc);
                                    }
                                    else {
                                        System.out.println("No tienes cuchillos");
                                        dentro = usarMasObjetos(sc);
                                    }
                                    break;
                                case 3: // se juega cigarro
                                    if(turno % 2 == 0){ // vida para jugador 1
                                        if(this.Ncigarro>0){
                                            this.Ncigarro--;
                                            vida1++;
                                            System.out.printf("Ahora tienes %d vidas\n",vida1);
                                            dentro = usarMasObjetos(sc);
                                        }
                                        else {
                                            System.out.println("No tienes cigarros");
                                            dentro = usarMasObjetos(sc);
                                        }
                                    }
                                    else { // vida para jugador 2
                                        if(this.Ncigarro>0){
                                            this.Ncigarro--;
                                            vida2++;
                                            System.out.printf("Ahora tienes %d vidas\n", vida2);
                                            dentro = usarMasObjetos(sc);
                                        }
                                        else {
                                            System.out.println("No tienes cigarros");
                                            dentro = usarMasObjetos(sc);
                                        }
                                    }
                                    break;
                                case 4: // se juega esposa
                                    if (this.Nesposas>0){
                                        System.out.println("HAS USADO LAS ESPOSAS");
                                        this.Nesposas--;
                                        usaEsposas = true;
                                        dentro = usarMasObjetos(sc);
                                    }
                                    else {
                                        System.out.println("No tienes esposas");
                                        dentro = usarMasObjetos(sc);
                                    }
                                    break;
                                default: System.out.println("Escribe un dato válido");
                                    break;
                            }
                        }
                    }
                }
            }
            //momento de disparar
            System.out.println("""
                    ¿A quién quiéres disparar?
                    1. Contringante
                    2. A ti mismo""");
            System.out.print(">>>");
            boolean dentro = true;
            while(dentro){
                int numero = sc.nextInt(); // para leer la respuesta del jugador
                if(numero == 1){ // disparo al contringante
                    dentro = false;
                    System.out.println("HAS DISPARADO AL CONTRINGANTE");
                    if(seJuegaRoja){ // se juega roja
                        int damage = 1;
                        if(dobleDamage){ // miro si la escopeta está recortada
                            damage = 2;
                        }
                        if(turno % 2 == 0){  // partida del jugador principal
                            vida2 = vida2 - damage;
                            System.out.printf("LE HAS DADO. A "+nombre2+" le quedan: %d vidas\n\n", vida2);
                        }
                        else { // partida del jugador 2
                            vida1 = vida1 - damage;
                            System.out.printf("LE HAS DADO. A " + nombre1 + " le quedan: %d vidas\n\n", vida1);
                        }
                    }
                    else { // se juega azul
                        System.out.println("LA BALA ERA AZUL\n");
                    }
                }
                else if(numero == 2){ //disparo a ti mismo
                    dentro = false;
                    System.out.println("TE HAS DISPARADO A TI MISMO");
                    if(seJuegaRoja){ // se juega bala roja
                        System.out.println("PUMMM");
                        int damage = 1;
                        if(dobleDamage){ // miro si la escopeta está recortada
                            damage = 2;
                        }
                        if (turno % 2 == 0){ // partida del jugador principal
                            vida1 = vida1 - damage;
                            System.out.printf("TE QUEDAN %d vidas\n", vida1);
                        }
                        else {  // partida del jugador 2
                            vida2 = vida2 - damage;
                            System.out.printf("TE QUEDAN %d vidas\n", vida2);
                        }
                    }
                    else{ // se juega bala azul
                        System.out.println("LA BALA ERA AZUL\n");
                        System.out.println("TIENES UN TURNO DOBLE");
                        turno--; // doble turno
                    }
                }
                else {
                    System.out.println("ERROR: Escribe el índice válido.");
                }
            }

            //momento de ver si hay alguno muerto
            if (vida1 < 0){
                System.out.println("PUMMM  HA GANADO EL JUGADOR 2");
                vidas[2] = 1;
                return vidas;
            } else if (vida2 < 0) {
                System.out.println("PUMMM  HA GANADO EL JUGADOR 1");
                vidas[2] = 1;
                return vidas;
            }
            if (usaEsposas){
                turno++;
            }
            turno++;
            balasTotales--;
        }
        return vidas;
    }
    private int[] anadirBalas(){
        int balasRojas = 0;
        int balasAzules = 0;

        for (int i = 0; i < 4; i++){  //añado las balas rojas
            if (( 1 == (int) (Math.random()*3))){
                balasRojas++;
            }
        }
        if (balasRojas == 0){ // si no hay balas rojas, que haya mínimo 1
            balasRojas = 1;
        }
        for (int i = 0; i < (7 - balasRojas); i++){   //añado las balas azules
            if (( 1 == (int) (Math.random()*3))){
                balasAzules++;
            }
        }
        if(balasAzules == 0){ // si no hay balas azules, que haya mínimo una
            balasAzules =  1;
        }
        int[] balas = new int[2];
        balas[0] = balasRojas;
        balas[1] = balasAzules;
        return balas;
    }
    private boolean[] darobjetos() {
        int numeroObjetos = (int) (Math.random() * 3); // numero de objetos que se van a dar (máximo 2)
        for (int i = 0; i < numeroObjetos; i++) {
            int idObejeto = (int) (Math.random() * 5);
            switch (idObejeto) {
                case 1: //si es 0 entonces
                    if (this.lupa && !this.tieneLupa) { // dar lupa
                        this.tieneLupa = true;
                    }
                    break;
                case 2:
                    if (this.cuchillo && !this.tieneCuchillo) { // dar cuchillo
                        this.tieneCuchillo = true;
                    }
                    break;
                case 3:
                    if (1 == (1 + (int) (Math.random() * 2))){
                        if (this.cigarro && !this.tieneCigarro) { // dar cigarro
                            this.tieneCigarro = true;
                        }
                    }
                    break;
                case 4:
                    if (this.esposas && !this.tieneEsposas) { // dar esposas
                        this.tieneEsposas = true;
                    }
                    break;
                default:
                    break;
            }
        }
        boolean[] objetosEnPartida = new boolean[4];
        objetosEnPartida[0] = tieneLupa;
        objetosEnPartida[1] = tieneCuchillo;
        objetosEnPartida[2] = tieneCigarro;
        objetosEnPartida[3] = tieneEsposas;
        return objetosEnPartida;
    }
    private boolean usarMasObjetos(Scanner sc){
        if(this.Nesposas + this.Ncigarro + this.Ncuchillo + this.Nlupas != 0){
            System.out.print("\n¿Quiéres usar algún objeto más? (s/n): ");
            return sc.next().equals("s"); // si es si, devuelve true y si no, devuelve false
        }
        else {
            System.out.println("No te queda ningun objeto");
            return false;
        }
    }

}

/*ARREGLAR PARA QUE SE PUEDA JUGAR SIN OBJETOS*/