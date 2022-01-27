package Actividad_1;

enum MarcaDeVehiculo{BMW, MERCEDES, AVENSIS, TOYOTA, SEAT, NISSAN, AUDI}

public class Vehiculo {

    private MarcaDeVehiculo marca;
    private String matricula;

    public MarcaDeVehiculo getMarcaString(){
        return marca;
    }

    public MarcaDeVehiculo getMarca(){
        MarcaDeVehiculo modelo = null;
        this.marca=modelo;
        return modelo;
    }

}
