package circulo;

public class Circulo {
    private static int numCirculos;
    private double radio, longCircunferencia, area;
    private static final double PI = Math.PI;

    public static int getNumCirculos() {
        return numCirculos;
    }

    public double getRadio() {
        return radio;
    }

    public double getLongCircunferencia() {
        return longCircunferencia;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", longCircunferencia=" + longCircunferencia +
                ", area=" + area +
                '}';
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.longCircunferencia = (2*PI*this.radio); //calculo la longitud de la circunfenecia ya que se, que es igual al 2*PI*r
        this.area = calcularArea(radio); // calculo el área de la circunferencia ya que la fórmula es PI * r^2
        numCirculos++;
    }
    public static double calcularArea(double radio){
        return (PI*(radio*radio));
    }
}
