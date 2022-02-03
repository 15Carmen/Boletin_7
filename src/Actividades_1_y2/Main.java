package Actividades_1_y2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vehiculo coche1 = new Vehiculo();
        Vehiculo coche2 = new Vehiculo();

        String matricula, marca;

        coche2.setMarcaString(MarcadeVehiculo.MERCEDES);
        System.out.println("Por favor, introduce la matricula del primer vehículo");
        coche1.setMatricula(sc.nextLine());
        System.out.println("Por favor, introduce la marca del segundo vehículo");

        try {
            coche1.setMarcaDeVehiculos(sc.nextLine());
            //coche1.setMarca(Modelo.valueOf(scanner.nextLine())); dos formas de hacer lo mismo
        }catch (Exception e){
            System.out.println("Marca no válida");
            //coche2.setMarcaDeVehiculos(); repasar
        }

        System.out.println("La matricula del primer vehículo es: " + coche1.getMatricula());
        System.out.println("El modelo del primer vehículo es: " + coche1.getMatricula());
        System.out.println("La matricula del segundo vehículo es: " + coche2.getMatricula());
        System.out.println("El modelo del segundo vehículo es: " + coche1.getMatricula());
    }

}

