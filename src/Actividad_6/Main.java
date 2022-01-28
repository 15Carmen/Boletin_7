package Actividad_6;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Main {
    /**
     *      Se desea obtener la fecha del día y pedir por teclado un número entero de segundos.
     *
     * Se solicita que se muestre la hora del día y las n siguientes horas que se diferencian en un segundo.
     *
     * Habrá que crearse la clase Hora que se seteará con la hora del sistema y que dispondrá de los
     * atributos hora, minutos y segundos
     */
    public static void main(String[] args) {

        int segundos=0;
        GregorianCalendar horaActual = new GregorianCalendar();
        Scanner sc = new Scanner(System.in);
        Hora nuevaHora = new Hora(horaActual.get(Calendar.HOUR_OF_DAY), horaActual.get(Calendar.MINUTE),
                horaActual.get(Calendar.SECOND));

        System.out.println("hora: "+nuevaHora.getHoras()+" minutos: "+nuevaHora.getMinutos()+" segundos: "
                +nuevaHora.getSegundos());


        System.out.println("Introduzca el numero de segundos a sumar a la hora actual");

        boolean error = true;

        do{
            try{
                segundos = sc.nextInt();
                error = false;
            }catch (Exception e){
                System.out.println("Introduzca un valor numérico mayor que 0");
                sc.nextLine();
            }
        }while (error);

        //ahora llamamos al metodo sumaMuestra

        nuevaHora.sumaMuestra(segundos);

    }



}
