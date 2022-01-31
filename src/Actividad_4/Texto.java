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

    public String getCaracteres() {
        return caracteres;
    }

    public Texto(int limite){
        if(limite==0)this.limite=1;
        this.limite=limite;
        this.caracteres="";
    }
    public int countVocal(){
        int contador=0;
        String vocales[]={"a","e","i","o","u"};

        for(int pos=0;pos<this.caracteres.length();pos++){
            char car=this.caracteres.charAt(pos);
            for(int i=0;i<vocales.length;i++){
                //obtiene el primer caracter de la cadena
                char vocal=vocales[i].charAt(0);
                if(car==vocal)
                    contador++;
            }
        }
        return contador;
    }

    public void addStringFirst(String cadena){

    }
    public void addStringLast(String cadena){


    }
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