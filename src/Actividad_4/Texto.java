package Actividad_4;

public class Texto {

    /**
     * Actividad 4.-
     * Diseñar la clase Texto que gestiona una cadena de caracteres con algunas
     * características:
     *  La cadena de caracteres tendrá una longitud máxima que se indicará en el constructor
     *  Se podrá añadir un carácter al principio o al final siempre que exista espacio disponible
     *  Se podrá añadir una cadena al principio o al final siempre que exista espacio disponible
     *  Se debe contar cuántas vocales hay en el texto.
     *  Mediante los métodos iremos creando el texto.
     * Ayuda:
     *  Para saber la longitud de la cadena de caracteres se usará el método length()
     *  Para buscar en una cadena de caracteres un carácter en concreto usar indexOf(carácter),
     * devuelve -1 si no lo encuentra
     */


    private String caracteres;
    private int limite;


    /**
     * Usamos un metodo getter para poder imprimir los caracteres que indiquemos
     * @return
     */
    public String getCaracteres() {
        return caracteres;
    }

    /**
     *
     * constructor
     * @param limite
     */
    public Texto(int limite){

        this.limite=limite;
        this.caracteres="";

        if(limite==0){
            this.limite=1;
        }
    }

    /**
     * metodo para contar vocales
     * precondicion: usamos un contador para acumular el número de vocales que tenga la palabra
     * @return contador
     */
    public int countVocal(){
        int contador=0;
        String vocales[]={"a","e","i","o","u"};

        for(int posicion=0;posicion<this.caracteres.length();posicion++){

            char car=this.caracteres.charAt(posicion);

            for(int i=0;i<vocales.length;i++){

                //obtiene el primer caracter de la cadena
                char vocal=vocales[i].charAt(0);

                if(car==vocal){
                    contador++;
                }
            }
        }
        return contador;
    }

    /**
     * metodo para añadir una cadena de texto al principio
     * @param cadena
     */
    public void addStringFirst(String cadena){

    }

    /**
     * metodo para añadir una cadena de texto al final
     *
     */
    public void addStringLast(String cadena){

    }

    /**
     * metodo para añadir texto al principio de la cadena
     * @param cadena
     */
    public void addTextFirst(String cadena){
        if(cadena.length()!=1){
            return;
        }
        if(cadena.length()==1){
            if(this.caracteres.length()<this.limite){
                this.caracteres=cadena+this.caracteres;
            }
        }
    }

    /**
     * metodo para añadir texto al final de la cadena
     * @param cadena
     */
    public void addTextLast(String cadena){
        if(cadena.length()!=1){
            return;
        }
        if(cadena.length()==1){
            if(this.caracteres.length()<this.limite){
                this.caracteres+=cadena;
            }
        }
    }
}