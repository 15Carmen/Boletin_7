package Actividad_5;

public class Main {

    public static void main(String[] args) {

        SintonizadorFM sintonizador = new SintonizadorFM();

        //subimos la frecuencia

        sintonizador.up();
        System.out.println("Al subir la frecuencia, " + sintonizador + " MHz");


        //bajamos la frecuencia

        sintonizador.down();
        System.out.println("Al bajar la frecuencia, " + sintonizador + " MHz");

        //bajar de nuevo la frecuencia

        sintonizador.down();
        System.out.println("Al bajar la frecuencia, " + sintonizador + " MHz");

    }
}
