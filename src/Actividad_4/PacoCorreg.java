package Actividad_4;

public class PacoCorreg {



    public class TextoClase {

        private final int TAMAÑO;
        private String cadena;
        private final String VOCALES="aeiouáéíóúü";
        //Constructor básico.
        public TextoClase(int tamaño){
            this.TAMAÑO=tamaño;
            this.cadena="";
        }

        public int getTAMAÑO() {
            return TAMAÑO;
        }

        public String getCadena() {
            return cadena;
        }

        public void setCadena(String cadena) {
            this.cadena = cadena;
        }

        public String getVOCALES() {
            return VOCALES;
        }

        //Añadir un caracter por delante si hay espacio.
        public void añadirCaracterPrincipio (char caracter){
            if (this.cadena.length()+1<=this.TAMAÑO){
                this.cadena=caracter+this.cadena;
            }
        }

        //Añadir un caracter al final si hay espacio.
        public void añadirCaracterFinal (char caracter){
            if (this.cadena.length()+1<=this.TAMAÑO){
                this.cadena=this.cadena+caracter;
            }
        }

        //Añadir una cadena por delante si hay espacio.
        public void añadirCadenaPrincipio (String cadena) {
            if (this.cadena.length() + cadena.length()<= this.TAMAÑO) {
                this.cadena = cadena + this.cadena;
            }
        }

        //Añadir una cadena al final si hay espacio.
        public void añadirCadenaFinal (String cadena){
            if (this.cadena.length() + cadena.length()<=this.TAMAÑO){
                this.cadena=this.cadena+cadena;
            }
        }

        //Método para contar las vocales de la cadena
        public int contarVocales (){
            int contador=0;
            for (int i=0;i<this.cadena.length();i++){
                if (esVocal(this.cadena.charAt(i))){
                    contador += 1;
                }
            }
            return contador;
        }

        //Metodo interno para comparar las vocales
        public boolean esVocal (char caracter){
            boolean resultado=false;
            if (VOCALES.indexOf(caracter)!=-1){
                resultado=true;
            }
            return resultado;
        }

        //Metodo de David
        public int contarVocales2 (){
            int contador=0;
            for (int i=0;i<VOCALES.length();i++){
                contador=contador+(esVocal2(VOCALES.charAt(i), 0));
            }
            return contador;
        }

        //Metodo interno para comparar las vocales David metodo recursivo
        public int esVocal2 (char caracter, int posicion){
            if (this.cadena.indexOf(caracter, posicion)==-1){
                return 0;
            }
            return (1+(esVocal2(caracter, this.cadena.indexOf(caracter, posicion)+1)));
        }
    }

}
