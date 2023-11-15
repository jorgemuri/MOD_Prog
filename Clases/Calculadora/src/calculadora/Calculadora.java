package calculadora;

public class Calculadora {

    /*Propiedades*/
    private int resultado;

    /*Fin propiedades*/

    /*Métodos*/

    public Calculadora() {
    }
    public Calculadora(int operando) {
        this.resultado = operando;
    }

    public int sumar(int n){
        this.resultado = n + this.resultado;
        return this.resultado;
    }
    public int restar(int n){
        this.resultado = this.resultado - n;
        return this.resultado;
    }
    public int multiplicar(int n){
        this.resultado = n * this.resultado;
        return this.resultado;
    }
    public int dividir(int n){
        if(n == 0){
            System.out.println("No se puede dividir por 0.");
            return 0;
        }
        this.resultado = this.resultado / n;
        return this.resultado;
    }
    public void factorial(){
        int i = this.resultado;
        while(i > 1){
            i--;
            this.resultado = this.resultado * i;
        }
    }
    public void inicializar(){
        this.resultado = 0;
    }

    public int getResultado() {
        return this.resultado;
    }
    /* Fin métodos*/

}
