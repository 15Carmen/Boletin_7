package Actividad_10;

    /*
     * Actividad 10.-
     * Implementar una clase Gato con las siguientes características:
     *
     *  Atributos (String) nombre, color, raza, (Int) edad
     *
     *  Constructores necesarios
     *
     *  Que implemente dos método CompareTo para compararlos por nombre y por edad
     *
     *  Haced un programa principal sencillo que cree dos gatos y pruebe los métodos de
     * comparación.
     */

    public class Gato{

        private String nombre;
        private String color;
        private String raza;
        private int edad;

        //constructor

        public Gato(String nombre, String color, String raza, int edad) {
            this.nombre = nombre;
            this.color = color;
            this.raza = raza;
            this.edad = edad;
        }

        //getter

        public String getNombre() {
            return nombre;
        }

        public String getColor() {
            return color;
        }

        public String getRaza() {
            return raza;
        }

        public int getEdad() {
            return edad;
        }

        //metodos para comparar los gatos.
        //hacemos la compración con un compareTo


        public int compareToNombres(Gato gatito) {
            return (this.nombre).compareTo(gatito.getNombre());
        }
        public int compareToEdad(Gato gatito) {
            return this.edad-gatito.edad;
        }

        public String toString(){
            return "Nombre: "+ this.nombre+ " Raza: "+ this.raza+ " Color: "+ this.color + " Edad: "+ this.edad;
        }

    }
