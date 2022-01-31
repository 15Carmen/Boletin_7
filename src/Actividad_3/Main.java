package Actividad_3;

public class Main {

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

