package Actividad_4;

public class Paco {

    public class Texto {

        StringBuffer cadena=new StringBuffer();

        /**
         * Constructor que modifica la longitud inicial de la cadena.
         * @param cadena La cadena a la que le queremos cambiar la longitud.
         * @param a Entero que es la nueva longitud de la cadena dada.
         */
        public Texto(StringBuffer cadena, int a) {
            this.cadena.setLength(a);
        }

        /**
         * Inserta un caracter al principio de la cadena que recice de fuera si cabe.
         * @param a Caracter a añadir.
         * @return Devuelve la cadena con el caracter al principio.
         */
        public StringBuffer caracterInicio (char a){
            if ((this.cadena.length()-1)>=0){
                this.cadena.insert(0, a);
            }
            System.out.println("El carácter no cabe en la cadena.");
            return this.cadena;
        }

        /**
         * Inserta un caracter al final de la cadena que recice de fuera si cabe.
         * @param a Caracter a añadir.
         * @return Devuelve la cadena con el caracter al final.
         */
        public StringBuffer caracterFinal (char a) {
            if ((this.cadena.length()-1)>=0) {
                this.cadena.insert(this.cadena.length() - 1, a);
            }
            System.out.println("El carácter no cabe en la cadena.");
            return this.cadena;
        }

        /**
         * Iserta una cadena al principio si cabe.
         * @param a El String a insertar.
         * @return Cadena de vuelta concatenada con la dada.
         */
        public StringBuffer caradenaInicio (String a){
            if (this.cadena.length()-a.length()>=0){
                this.cadena.insert(0, a);
            }
            System.out.println("La cadena introducida no cabe.");
            return this.cadena;
        }

        /**
         * Inserta una cadena al final si cabe.
         * @param a El String a insertar.
         * @return Cadena de vuelta concatenada con la dada.
         */
        public StringBuffer cadenaFinal (String a) {
            if (this.cadena.length()-a.length()>=0) {
                this.cadena.insert(this.cadena.length()-a.length(), a);
            }
            System.out.println("La cadena introducida no cabe.");
            return this.cadena;
        }

        /**
         * Método que cuenta las vocales de la cadena.
         * @return Devuelve el número de vocales de la cadena.
         */
        public int contarVocales (){
            int vocales=0;
            String cadena;
            cadena=this.cadena.toString();
            cadena=cadena.toLowerCase();
            if (cadena.contains("a")||cadena.contains("e")||cadena.contains("i")||cadena.contains("o")||cadena.contains("u")){
                vocales+=1;
            }
        /*if (this.cadena.indexOf("a")!=(-1)||this.cadena.indexOf("e")!=(-1)||this.cadena.indexOf("i")!=(-1)
                ||this.cadena.indexOf("o")!=(-1)||this.cadena.indexOf("u")!=(-1)){
            vocales+=1;
        }*/
            return vocales;
        }

    }

}
