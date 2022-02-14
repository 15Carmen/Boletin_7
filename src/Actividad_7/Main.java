package Actividad_7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numerador, denominador;

        System.out.println("Introduzca el numerador de la fracción");
        numerador = sc.nextInt();

        //precondición: el denominador tiene que ser distinto de cero

        System.out.println("Introduzca el denominador de la fracción distinto de 0");
        denominador = sc.nextInt();

        while (denominador ==0){
            System.out.println("Por favor, lee lo que decimos: introduzca el denominador distinto de 0");
            denominador= sc.nextInt();
        }

        //Creamos la fracción

        Fraccion fraccioncilla = new Fraccion(numerador,denominador);
        System.out.println("La fracción que has introducido es: ");
        System.out.println(fraccioncilla);

        //multiplicamos la fracción por 2
        fraccioncilla.multiplicarNumero(2);
        System.out.println("Multiplico la fracción por 2: ");
        System.out.println(fraccioncilla);

        //dividimos la fracción entre -2
        fraccioncilla.dividirNumero(-2);
        System.out.println("Divido la fracción entre -2: ");
        System.out.println(fraccioncilla);

        //multiplicamos la fracción por 1/3
        Fraccion fraccioncilla2 = new Fraccion(1,3);
        fraccioncilla.multiplicarFraccion(fraccioncilla2);
        System.out.println("Multiplico la fracción por 1/3: ");
        System.out.println(fraccioncilla);

        //dividimos la fracción por 1/3
        fraccioncilla.dividirFraccion(fraccioncilla2);
        System.out.println("Divido la fracción por 1/3: ");
        System.out.println(fraccioncilla);

        //invertimos la fracción de signo
        fraccioncilla.invertirSigno();
        System.out.println("La fracción con el signo cambiado es: ");
        System.out.println(fraccioncilla);
    }
}
