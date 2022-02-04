package Actividad_3;

public class Main {

    /**
     * Actividad 3.-
     * Crear un enumerado que contenga estos valores {COCHE, CAMION, BARCO, TREN,
     * AVION} y muestre su número de orden y haga comparaciones indicando quién puede ser más
     * rápido que otro. Por ejemplo: “BARCO es más rápido que COCHE” o “COCHE es más lento que
     * TREN” o “CAMIÓN es igual de rápido que CAMIÓN”
     */

    //en la clase enum no solo enumeramos los medios de transporte, sino que también
    public enum VEHICULO
    {
        COCHE("COCHE NUEVO",1),
        CAMION("CAMION",2), BARCO("BARCO",3),
        TREN("TREN",4),AVION("AVION",5);

        private String descripcion;
        private int posicion;

        private VEHICULO (String descripcion, int posicion){
            this.descripcion = descripcion;
            this.posicion = posicion;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public int getPosicion() {
            return posicion;
        }

    }
    public static void main(String[] args) {
        // TODO code application logic here
        VEHICULO A = null;//coche
        VEHICULO B=null;//camion
        VEHICULO C = null;//barco
        VEHICULO D=null;//tren
        VEHICULO E=null;//camion

        System.out.println(A.CAMION);
        System.out.println(A.CAMION.posicion);

        if(C.BARCO.posicion>A.COCHE.posicion){
            System.out.println(C.BARCO +" es más rápido que "+A.COCHE.descripcion);
        }
        if(A.BARCO.posicion>A.COCHE.posicion){
            System.out.println(A.BARCO +" es más rápido que "+A.COCHE);
        }

        if(A.CAMION.posicion<=A.CAMION.posicion){
            System.out.println(A.CAMION +" es igual de rápido que "+A.CAMION);
        }
        System.out.println(A.CAMION);
        System.out.println(A.CAMION.posicion);
    }

}

