package Actividad_4;

public class Main {

    public static void main(String[] args) {

        Texto miCadena=new Texto(6);

        miCadena.addTextFirst("f");
        miCadena.addTextLast("r");
        miCadena.addTextFirst("a");
        miCadena.addTextLast("p");
        miCadena.addTextFirst("u");
        miCadena.addTextLast("e");

        System.out.println(miCadena.getCaracteres());
        System.out.println("Mi cadena de texto tiene: " + miCadena.countVocal() + " vocales");
    }
}
