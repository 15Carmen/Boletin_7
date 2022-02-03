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

        static final double MaxFrecuencia = 108f;
        final double MinFrecuencia = 80f;
        final double SaltoFrecuencia = 0.5f;
        private double frecuencia;

        //constructor
    /**
     * creamos el objeto del constructor con la frecuencia minima
     *
     */

    public SintonizadorFM () {
        this.frecuencia = MinFrecuencia;
    }

    /**
     * cada vez que aumento la frecuencia aumenta un salto
     * Si llego a la frecuencia máxima, vuelvo a la frecuencia mínima
     * precondición: llamamos al método up, porque así nos lo indica el ejercicio
     */

    public void up(){
        this.frecuencia += SaltoFrecuencia;
        if (this.frecuencia > MaxFrecuencia){
            this.frecuencia = MinFrecuencia;
        }
    }

    /**
     * cada vez que disminuyo la frecuencia disminuyo un salto
     * Si llego a la frecuencia mínima, vuelvo a la frecuencia máxima
     * precondición: llamamos al método down, porque así nos lo indica el ejercicio
     */

    public void down(){
        this.frecuencia -= SaltoFrecuencia;
        if (this.frecuencia < MinFrecuencia){
            this.frecuencia=MaxFrecuencia;
        }
    }

    public String toString(){
        String display;
        display = "actualmente el sintonizador marca: "+ this.frecuencia;
        return display;
    }

}


