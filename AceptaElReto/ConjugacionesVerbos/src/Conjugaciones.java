import java.util.Scanner;

public class Conjugaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean dentro = true;
        while (dentro){
            //me dice el verbo y el tiempo verbal
            String verbo = sc.next();
            String tiempo_verbal = sc.next();
            if("T".equals(tiempo_verbal)){
                dentro = false;
            }
            else {
                char ult_letra = verbo.charAt(verbo.length()-1);
                char penult_letra = verbo.charAt(verbo.length()-2);
                String conjugacion ="" + penult_letra + ult_letra;
                if("ar".equals(conjugacion)){
                    //primera conjugación
                    //llamo a la función dependiendo del tiempo verbal
                    if("A".equals(tiempo_verbal)){
                        Presente(verbo,1);
                    } else if ("P".equals(tiempo_verbal)) {
                        Preterito(verbo,1);
                    }
                    else {
                        Futuro(verbo,1);
                    }
                }
                else if ("er".equals(conjugacion)) {
                    //segunda conjugació
                    if("A".equals(tiempo_verbal)){
                        Presente(verbo,2);
                    } else if ("P".equals(tiempo_verbal)) {
                        Preterito(verbo,2);
                    }
                    else {
                        Futuro(verbo,2);
                    }
                }
                else {
                    //tercera conjugación
                    if("A".equals(tiempo_verbal)){
                        Presente(verbo,3);
                    } else if ("P".equals(tiempo_verbal)) {
                        Preterito(verbo,3);
                    }
                    else {
                        Futuro(verbo,3);
                    }
                }
            }
        }
    }
    private static void Presente(String verbo,int conjugacion){
        //le quito las últimas dos letras de la conjugacion
        String verboSinConjugar = "";
        for(int i = 0; i < verbo.length() - 2; i++){
            char letra = verbo.charAt(i);
            verboSinConjugar = verboSinConjugar + letra;
        }
        //en primera conjugacion
        if(conjugacion == 1){
            System.out.println("yo " + verboSinConjugar + "o");
            System.out.println("tu " + verboSinConjugar + "as");
            System.out.println("el " + verboSinConjugar + "a");
            System.out.println("nosotros " + verboSinConjugar + "amos");
            System.out.println("vosotros " + verboSinConjugar + "ais");
            System.out.println("ellos " + verboSinConjugar + "an");
        } else if (conjugacion == 2) {
            System.out.println("yo " + verboSinConjugar + "o");
            System.out.println("tu " + verboSinConjugar + "es");
            System.out.println("el " + verboSinConjugar + "e");
            System.out.println("nosotros " + verboSinConjugar + "emos");
            System.out.println("vosotros " + verboSinConjugar + "eis");
            System.out.println("ellos " + verboSinConjugar + "en");
        }
        else {
            System.out.println("yo " + verboSinConjugar + "o");
            System.out.println("tu " + verboSinConjugar + "es");
            System.out.println("el " + verboSinConjugar + "e");
            System.out.println("nosotros " + verboSinConjugar + "imos");
            System.out.println("vosotros " + verboSinConjugar + "is");
            System.out.println("ellos " + verboSinConjugar + "en");
        }
    }

    private static void Preterito(String verbo,int conjugacion){
        //le quito las últimas dos letras de la conjugacion
        String verboSinConjugar = "";
        for(int i = 0; i < verbo.length() - 2; i++){
            char letra = verbo.charAt(i);
            verboSinConjugar = verboSinConjugar + letra;
        }
        //en primera conjugacion
        if(conjugacion == 1){
            System.out.println("yo " + verboSinConjugar + "e");
            System.out.println("tu " + verboSinConjugar + "aste");
            System.out.println("el " + verboSinConjugar + "o");
            System.out.println("nosotros " + verboSinConjugar + "amos");
            System.out.println("vosotros " + verboSinConjugar + "asteis");
            System.out.println("ellos " + verboSinConjugar + "aron");
        } else if (conjugacion == 2) {
            System.out.println("yo " + verboSinConjugar + "i");
            System.out.println("tu " + verboSinConjugar + "iste");
            System.out.println("el " + verboSinConjugar + "io");
            System.out.println("nosotros " + verboSinConjugar + "imos");
            System.out.println("vosotros " + verboSinConjugar + "isteis");
            System.out.println("ellos " + verboSinConjugar + "ieron");
        }
        else {
            System.out.println("yo " + verboSinConjugar + "i");
            System.out.println("tu " + verboSinConjugar + "iste");
            System.out.println("el " + verboSinConjugar + "io");
            System.out.println("nosotros " + verboSinConjugar + "imos");
            System.out.println("vosotros " + verboSinConjugar + "isteis");
            System.out.println("ellos " + verboSinConjugar + "ieron");
        }
    }

    private static void Futuro(String verbo,int conjugacion){
        //le quito las últimas dos letras de la conjugacion
        String verboSinConjugar = "";
        for(int i = 0; i < verbo.length() - 2; i++){
            char letra = verbo.charAt(i);
            verboSinConjugar = verboSinConjugar + letra;
        }
        //en primera conjugacion
        if(conjugacion == 1){
            System.out.println("yo " + verboSinConjugar + "are");
            System.out.println("tu " + verboSinConjugar + "aras");
            System.out.println("el " + verboSinConjugar + "ara");
            System.out.println("nosotros " + verboSinConjugar + "aremos");
            System.out.println("vosotros " + verboSinConjugar + "areis");
            System.out.println("ellos " + verboSinConjugar + "aran");
        } else if (conjugacion == 2) {
            System.out.println("yo " + verboSinConjugar + "ere");
            System.out.println("tu " + verboSinConjugar + "eras");
            System.out.println("el " + verboSinConjugar + "era");
            System.out.println("nosotros " + verboSinConjugar + "eremos");
            System.out.println("vosotros " + verboSinConjugar + "ereis");
            System.out.println("ellos " + verboSinConjugar + "eran");
        }
        else {
            System.out.println("yo " + verboSinConjugar + "ire");
            System.out.println("tu " + verboSinConjugar + "iras");
            System.out.println("el " + verboSinConjugar + "ira");
            System.out.println("nosotros " + verboSinConjugar + "iremos");
            System.out.println("vosotros " + verboSinConjugar + "ireis");
            System.out.println("ellos " + verboSinConjugar + "iran");
        }
    }
}
