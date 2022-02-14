package Actividad_4;

public class Main {

    public static void main(String[] args) {

        Texto miCadena=new Texto(6);

        miCadena.addCaracterFirst("f");
        miCadena.addCaracterLast("r");
        miCadena.addCaracterFirst("a");
        miCadena.addCaracterLast("p");
        miCadena.addCaracterFirst("u");
        miCadena.addCaracterLast("e");

        System.out.println(miCadena.getCaracteres());
        System.out.println("Mi cadena de texto tiene: " + miCadena.countVocal() + " vocales");
    }
}
