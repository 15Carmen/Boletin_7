package Actividad_6;

public class Hora {

    private int horas;
    private int minutos;
    private int segundos;



    public Hora (int horas, int minutos, int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }

    //getter

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }


    //setter

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    //metodo para sumar los segundos a la hora actual

    public void sumaMuestra (int n){
      for (int i=0; i<n; i++){
          this.segundos++;
          suma();
          System.out.println("hora: " + horas + " minutos: "+ minutos + " segundos: "+segundos);
      }
    }

    public void suma (){

        segundos++;
        if  (segundos>59) {
            segundos = 0;
            minutos++;

            if (minutos > 59) {
            minutos = 0;
            horas++;

                if (horas > 23) {
                    horas = 0;

                }
            }
        }
    }
}
