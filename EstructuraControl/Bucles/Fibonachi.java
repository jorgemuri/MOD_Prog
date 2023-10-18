public class Fibonachi {
    public static void main(String[] args) {
        int uno = 0, dos = 1, tres;

        System.out.println("El 1º es: 0");
        System.out.println("El 2º es: 1");

        //calculo la serie  de Fibonachi, desde el tercero número
        for (int i = 3; i <= 20; i ++){
            tres = uno + dos;
            uno = dos;
            dos = tres;
            System.out.printf("El %dº es: %d\n",i,tres);
        }
    }
}