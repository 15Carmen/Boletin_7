package Actividad_7;

public class Fraccion {

    /**
     * Actividad 7.-
     * Crea la clase Fracción. Los atributos, en principio, serán numerador y denominador.
     *
     * El numerador y denominador se introducirán por pantalla. No es necesario usar Try pero sí
     * controlar que el denominador no sea negativo.
     *
     * Se crearán métodos para simplificar la fracción, multiplicarla y dividirla por un número
     * y por una fracción e invertirle el signo.
     *
     * Para simplificar la fracción ayudaros del método Math.min que devuelve el mínimo de dos
     * números (el tipo devuelto es el mismo tipo de los números que compara)
     */

    private int numerador;
    private int denominador;
    private int signo;

    //constructor
    public Fraccion(int numerador, int denominador) {
        /*
        this.numerador = numerador;
        this.denominador = denominador;
        this.signo = signo;
        */

        this.numerador = Math.abs(numerador);
        this.denominador = Math.abs(denominador);
        this.signo = calcularSigno (numerador,denominador);
    }

    //calculo el signo de mi fracción
    public int calcularSigno (int numerador, int denominador) {

        int resultado = 1;
        if (numerador < 0 || denominador < 0) {
            if (!( numerador < 0 && denominador < 0 )) {
                resultado = -1;
            }
        }
        return resultado;
    }

    //creamos un método para multiplicar la fracciín por una fracción
    public void multiplicarPor(Fraccion f) {
        Fraccion fraccion= new Fraccion(Math.abs(this.numerador*f.numerador),Math.abs(this.denominador*f.denominador));
        fraccion.signo = calcularSigno(f.numerador, f.denominador);
        fraccion=simplificar(fraccion);
        this.numerador=fraccion.numerador;
        this.denominador=fraccion.denominador;
        this.signo *= fraccion.signo;

    }

    //creamos un método para multiplicar lla fracción por un número
    public void multiplicarPor(int num) {
        this.numerador=this.numerador*Math.abs(num);
        if (num<0){
            this.signo *=-1;
        }
    }

    public void dividirPor(int num) {
        this.numerador=this.numerador/Math.abs(num);
        if (num<0){
            this.signo *=-1;
        }

    }
    public void dividirPor(Fraccion f) {
        Fraccion fraccion= new Fraccion(Math.abs(this.numerador*f.denominador),Math.abs(this.denominador*f.numerador));
        fraccion.signo = calcularSigno(f.numerador, f.denominador);
        fraccion=simplificar(fraccion);
        this.numerador=fraccion.numerador;
        this.denominador=fraccion.denominador;
        this.signo *= fraccion.signo;

    }
    public Fraccion simplificar (Fraccion f){
        Fraccion fraccion = new Fraccion(f.numerador,f.denominador);
        for (int i = 2; i<=Math.min(f.numerador, f.denominador);i++) {
            if (( f.numerador % i == 0 ) && ( f.denominador % i == 0 )) {
                f.numerador /= i;
                f.denominador /= i;
            }
        }
        fraccion.denominador= f.denominador;
        fraccion.numerador= f.numerador;
        return fraccion;
    }

    public void invertirSigno() {
        this.signo *= -1;
    }

    public String toString(){
        String resultado;
        char signo=' ';
        if (this.signo== 1)
        {
            signo = '+';
        }
        else
        {signo = '-';
        }

        resultado=("La fracción es: " + signo + this.numerador + "/ "+ this.denominador);
        return resultado;

    }
}
