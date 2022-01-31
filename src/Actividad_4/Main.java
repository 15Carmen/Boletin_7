package Actividad_4;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Texto miCadena=new Texto(6);
        //miCadena.addTextFirst("pdsdsd");
        miCadena.addTextFirst("f");
        miCadena.addTextFirst("r");
        miCadena.addTextFirst("a");
        miCadena.addTextLast("p");
        miCadena.addTextFirst("u");
        System.out.println(miCadena.getCaracteres());
        System.out.println(miCadena.countVocal());
    }
}
