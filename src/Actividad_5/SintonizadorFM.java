package Actividad_5;

public class SintonizadorFM {

    /**
     * Actividad 5.-
     * Se quiere definir una clase (SintonizadorFM) que permita controlar un sintonizador
     * digital de emisoras FM; concretamente, se desea dotar al controlador de una interfaz que permita
     * subir (up) o bajar (down) la frecuencia, en saltos de 0,5 MHz y mostrar la frecuencia en un
     * momento dado Display. El rango de frecuencias va a oscilar entre 80 y 108 MHz, y al inicio, el
     * controlador sintonice 80MHz. Si durante una operación de subida o bajada, se sobrepasan los
     * límites, la frecuencia sintonizada debe pasar al extremo contrario. Escribir un programa principal
     * básico para probar su funcionamiento.
     */

    //Parámetros

    private class Sintonizador{
        private static final double MaxFrecuencia = 108f;
        private final double MinFrecuencia = 80f;
        private final double SaltoFrecuencia = 0.5f;
        private double frecuencia = MinFrecuencia;
    }



}
