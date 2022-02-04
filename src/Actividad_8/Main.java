package Actividad_8;

public class Main {

    public static void main (String args[]) {

        //creamos el punto
        Punto puntito = new Punto(14, 23);

        //ponemos el display con toString
        System.out.println(puntito);

        //ponemos el display con los getter
        System.out.println("La cordenada X del primer punto es: "+ puntito.getX());
        System.out.println ("La coordenada Y del primer punto es:"+ puntito.getY());;

        //calculamos la distancia al origen
        System.out.println("la distancia del punto al origen es = "+ puntito.distanciaPunto());

        //calculamos la distancia del punto a otro que le paso de referencia
        System.out.println("La distancia entre el punto introducido y el punto (12, 28) es: "
                + puntito.distanciaPunto(new Punto(12,28)));

    }
}

