package clases;

public class Planeta {
    /*Propiedades*/

    private String nombre = "";
    private int cantidadSatelites, diametro, distanciaSol;
    private double volumen, masa;
    private enum tiposplanetas{ENANO, TERRESTRE, GASEOSO}

    /*Fin propiedades*/

    /*Métodos*/
   public Planeta (String nombre, int satelites, double masa, double volumen, int diametro, int distancia){
       this.nombre = nombre;
       this.cantidadSatelites = satelites;
       this.masa = masa;
       this.volumen = volumen;
       this.diametro = diametro;
       this.distanciaSol = distancia;

       tipoPlaneta(this.nombre);
   }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", cantidadSatelites=" + cantidadSatelites +
                ", diametro=" + diametro +
                ", distanciaSol=" + distanciaSol +
                ", volumen=" + volumen +
                ", masa=" + masa +
                '}';
    }

    public double calcularDensidad(){
       double densidad =  this.masa / this.volumen;
       return densidad;
    }

    public boolean esExterior(){
        final double cinturonasteroide =  149597870 ; //km
        if (this.distanciaSol >cinturonasteroide){
            return true;
        }
        else return false;
    }
    private String tipoPlaneta(String nombre_planeta){
       switch (nombre_planeta){
           case "Tierra":
               break;
           case "Júpiter":
               break;
           default:break;
       }
        return null;
    }
    /*Fin métodos*/
}
