import java.util.Arrays;
import java.util.Scanner;

public class LigaPadel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ligas[] = new String[1];
        String liga = "";
        int index = 0;
        boolean esFIN = false;
        while(!esFIN){
            liga = sc.next();
            if (liga == "FIN"){
                esFIN = true;
            }
            if (ligas.length <= index){
                String nuevasligas[] = Arrays.copyOf(ligas, index);
                for (int i = 0; i < nuevasligas.length - 1; i++ ){
                    System.out.println(nuevasligas[i]);
                }
            }
            else{
                ligas[index] = liga;
            }
            index++;
        }



    }
}
