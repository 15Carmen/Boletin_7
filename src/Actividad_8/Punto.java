package Actividad_8;

public class Punto {
    /*
     *  Actividad 8.-
     *  Implementar una clase Punto cuyos datos miembros sean las coordenadas de un punto del plano.
     * Estos datos han de ser privados. Para esta clase se piden los siguientes métodos y
     * constructores:
     *
     *  El constructor Punto() recibe como argumento dos números reales, a y b, y construye un
     *    nuevo punto de la clase Punto cuyas coordenadas son a y b.
     *
     *  Los métodos de acceso getX() y getY(), sin argumentos, que devuelven las coordenadas de
     *    un objeto Punto.
     *
     *  Los métodos modificadores setX() y setY(), que reciben un argumento y modifican el valor
     *    de la correspondiente coordenada de un objeto Punto.
     *
     *  El método igual(), que comprueba si un objeto de la clase Punto es igual a otro dado que se
     *    pasa como argumento.
     *
     *  El método distancia(), sin argumentos, que calcula la distancia de un objeto de la clase
     *    Punto al origen de coordenadas.
     *
     *  El método distancia(), que calcula la distancia de un objeto de la clase Punto a otro que se
     *    proporciona como argumento.
     */

        private double x,y;

        public Punto (double a, double b){
            this.x = a;
            this.y = b;
        }

        //getter
        public double getX(){
            return this.x;
        }
        public double getY(){
            return this.y;
        }

        //setter
        public void setX(double a){
            this.x=a;
        }
        public void setY(double b){
            this.y=b;
        }

        //metodo igual
        public boolean igual(Punto q){
            boolean resultado=false;
            if (this.x==q.x && this.y==q.y){
                resultado=true;
            }
            return resultado;
        }

        /**La distancia entre dos puntos es igual a la longitud del segmento que los une. Por lo tanto,
         en matemáticas, para determinar la distancia entre dos puntos diferentes se deben
         calcular los cuadrados de las diferencias entre sus coordenadas y luego hallar la
         raíz de la suma de dichos cuadrados.
         La fórmula de la distancia entre dos puntos es:
         d(A,B) = RAIZ CUADRADA ((x2-x1)^2+(y2-y1)^2)
         */

        public double distanciaPunto() {
            double resultado = Math.sqrt(Math.pow((this.x),2) + Math.pow((this.y),2));
            System.out.println("x al cuadrado es " + Math.pow((this.x),2));
            return resultado;
        }

        public double distanciaPunto(Punto z) {
            double resultado = Math.sqrt(Math.pow((this.x-z.x),2) + Math.pow((this.y- z.y),2));
            return resultado;
        }
        public String toString(){
            String display;
            return display = "la cordenada X del punto es: "+this.x+ " la coordenada y del punto es:"+ this.y;
        }
}

