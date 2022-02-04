package Actividad_10;

public class Main {

    public static void main(String[] args) {

        Gato gatete1=new Gato("Antonia", "rosa", "sphynx", 4);
        Gato gatete2=new Gato("Chispa", "negro", "scottish fold",9);

        //comparamos a los dos gatitos

        System.out.println("Ordenamos a los gatitos por orden alfabético");

        if (gatete1.compareToNombres(gatete2)<0) {
            System.out.println(gatete1);
            System.out.println(gatete2);
        }else{
            System.out.println(gatete2);
            System.out.println(gatete1);
        }

        System.out.println("\nOrdenamos a los gatitos de mayor a menor edad");


        if (gatete1.compareToEdad(gatete2)<0) {
            System.out.println(gatete2);
            System.out.println(gatete1);
        }else{
            System.out.println(gatete2);
            System.out.println(gatete1);
        }
    }
}
