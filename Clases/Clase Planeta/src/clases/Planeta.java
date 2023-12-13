package clases;

public class Planeta {
    /*Propiedades*/

    final private String nombre;
    final private int cantidadSatelites, diametro, distanciaSol;
    final private double volumen, masa;
    private enum tiposplanetas{ENANO, TERRESTRE, GASEOSO}
    private tiposplanetas tipo;

    /*Fin propiedades*/

    /*Métodos*/
   public Planeta (String nombre, int satelites, double masa, double volumen, int diametro, int distancia){
       this.nombre = nombre;
       this.cantidadSatelites = satelites;
       this.masa = masa;
       this.volumen = volumen;
       this.diametro = diametro;
       this.distanciaSol = distancia;

       /*Selecciono si es un planeta gaseoso, terrestre...*/
       switch (this.nombre.toLowerCase()) {
           case "tierra", "venus", "marte":
               this.tipo = tiposplanetas.TERRESTRE;
               break;
           case "júpiter", "saturno", "urano", "neptuno":
               this.tipo = tiposplanetas.GASEOSO;
               break;
           case "mercurio":
               this.tipo = tiposplanetas.ENANO;
               break;
           default:
               System.out.println("has introducido un nombre no válido");
               break;
       }
   }

   /*To string*/
    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", cantidadSatelites=" + cantidadSatelites +
                ", diametro=" + diametro +
                ", distanciaSol=" + distanciaSol +
                ", volumen=" + volumen +
                ", masa=" + masa +
                ", tipo=" + tipo +
                '}';
    }

    public double calcularDensidad(){
       return (this.masa / this.volumen);
    }

    public boolean esExterior(){
        double cinturonasteroide = 3.4 * 149597870 ; //km
        if (this.distanciaSol > (cinturonasteroide)){
            return true;
        }
        else return false;
    }
    /*Fin métodos*/
}