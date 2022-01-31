package Actividad_1;

/**
 * Actividad 1.-
 * Se solicita crear una clase, la vamos a llamar Vehículo que va a tener un enumerado)
 * MarcaDeVehiculo) para las distintas marcas. Los valores de las marcas van a ser BMW, MERCEDES,
 * AVENSIS, TOYOTA, SEAT, NISSAN y AUDI. La clase va a tener como atributos la matrícula (tipo String)
 * y la marca (tipo MarcaDeVehiculo) y los métodos getters y setters de los atributos. Escribe un
 * pequeño programa de prueba donde se solicite por consola la matrícula y la marca y verifiques que
 * los métodos funcionan correctamente.
 * El método Setter valorará antes de hacer el Set que la marca introducida es válida y se corresponde
 * con un valor del enumerado
 */

/**
 * Actividad 2.-
 *       Modificación del anterior
 *
 * 1. Cambiar el nombre del método getMarca y llamarlo getMarcaString
 * 2. Crea un método getMarca que devuelva un objeto de tipo MarcaDeVehiculo
 * 3. Cambia el nombre del método setMarca y llamarlo setMarcaString
 * 4. Crea un método setMarca que reciba un objeto de tipo MarcaDeVehiculo y en base al valor
 * recibido establezca el atributo correspondiente
 * 5. En el main, tras mostrar los datos del vehiculo con los métodos anteriores, modifica la marca
 * operando con valores de MarcaDeVehiculo directamente.
 * El objetivo de todo esto es ver cómo se puede trabajar sin String usando directamente objetos del
 * tipo enumerado
 */
    enum Modelo {BMW, MERCEDES, AVENSIS, TOYOTA, SEAT, NISSAN, AUDI, MARCA_NO_VALIDA}

public class Vehiculo {


    private Modelo marca;
    private String matricula;

    public Modelo getMarcaString() {
        return marca;
    }

    public Modelo getMarca() {
        Modelo modelo = null;
        this.marca=modelo;
        return modelo;
    }

    public void setMarcaString(Modelo marca) {
        this.marca = marca;
    }

    public void setMarcaDeVehiculos (String modelo){
        modelo=modelo.toUpperCase();
        switch (modelo){
            case "BMW": this.marca=Modelo.BMW;
                break;
            case "MERCEDES": this.marca=Modelo.MERCEDES;
                break;
            case "AVENSIS": this.marca=Modelo.AVENSIS;
                break;
            case "TOYOTA": this.marca=Modelo.TOYOTA;
                break;
            case "SEAT": this.marca=Modelo.SEAT;
                break;
            case "NISSAN": this.marca=Modelo.NISSAN;
                break;
            case "AUDI": this.marca=Modelo.AUDI;
                break;
            default: this.marca=Modelo.MARCA_NO_VALIDA;
                break;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


}
