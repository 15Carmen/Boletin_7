package Actividades_1_y2;

/*
  Actividad 1.-
  Se solicita crear una clase, la vamos a llamar Vehículo que va a tener un enumerado)
  MarcaDeVehiculo) para las distintas marcas. Los valores de las marcas van a ser BMW, MERCEDES,
  AVENSIS, TOYOTA, SEAT, NISSAN y AUDI. La clase va a tener como atributos la matrícula (tipo String)
  y la marca (tipo MarcaDeVehiculo) y los métodos getters y setters de los atributos.

  Escribe un pequeño programa de prueba donde se solicite por consola la matrícula y la marca y verifiques que
  los métodos funcionan correctamente.

  El método Setter valorará antes de hacer el Set que la marca introducida es válida y se corresponde
  con un valor del enumerado.
 */

/*
  Actividad 2.-
        Modificación del anterior

  1. Cambiar el nombre del método getMarca y llamarlo getMarcaString
  2. Crea un método getMarca que devuelva un objeto de tipo MarcaDeVehiculo
  3. Cambia el nombre del método setMarca y llamarlo setMarcaString
  4. Crea un método setMarca que reciba un objeto de tipo MarcaDeVehiculo y en base al valor
  recibido establezca el atributo correspondiente
  5. En el main, tras mostrar los datos del vehiculo con los métodos anteriores, modifica la marca
  operando con valores de MarcaDeVehiculo directamente.
  El objetivo de todo esto es ver cómo se puede trabajar sin String usando directamente objetos del
  tipo enumerado
 */

    /**
    * Creamos una clase enum para poner todas las marcas de coches
    */
    enum MarcadeVehiculo {BMW, MERCEDES, AVENSIS, TOYOTA, SEAT, NISSAN, AUDI, NO_VALIDA}

public class Vehiculo {

    /**
     * Los atributos de la clase Vehiculo son marca que es un enum Marcadevehiculo y matricula que es tipo String
     */
    private MarcadeVehiculo marca;
    private String matricula;

    //constructores

    /**
     *hacemos los constructores por defecto
     *
     */

    public Vehiculo() {
        this.marca = MarcadeVehiculo.NO_VALIDA;
        this.matricula = "";

    }

    //getter and setter

    public String  getMarcaString() {

        return marca.name().toUpperCase();
    }

    public MarcadeVehiculo getMarca() {
        MarcadeVehiculo modelo = null;
        this.marca=modelo;
        return modelo;
    }

    public void setMarcaString(MarcadeVehiculo marca) {
        this.marca = marca;
    }

    /**
     * usamos un switch para validar la marca del coche que se tiene que modificar
     */
    public void setMarcaDeVehiculos (String modelo){
        modelo=modelo.toUpperCase();
        switch (modelo) {
            case "BMW" -> this.marca = MarcadeVehiculo.BMW;
            case "MERCEDES" -> this.marca = MarcadeVehiculo.MERCEDES;
            case "AVENSIS" -> this.marca = MarcadeVehiculo.AVENSIS;
            case "TOYOTA" -> this.marca = MarcadeVehiculo.TOYOTA;
            case "SEAT" -> this.marca = MarcadeVehiculo.SEAT;
            case "NISSAN" -> this.marca = MarcadeVehiculo.NISSAN;
            case "AUDI" -> this.marca = MarcadeVehiculo.AUDI;
            default -> this.marca = MarcadeVehiculo.NO_VALIDA;
        }
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }



}
