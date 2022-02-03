package Actividades_1_y2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String matricula, marca;
        Vehiculo coche1 = new Vehiculo();


        coche1.setMarcaString(MarcadeVehiculo.NO_DETERMINADA);
        System.out.println("Por favor, introduce la matricula del primer vehículo");
        coche1.setMatricula(sc.nextLine());
        System.out.println("Por favor, introduce la marca del segundo vehículo");

        try {
            coche1.setMarcaDeVehiculos(sc.nextLine());
        }catch (Exception e){
            System.out.println("Esta marca no es válida");
        }

        System.out.println("La matricula del primer vehículo es: " + coche1.getMatricula());
        System.out.println("El modelo del primer vehículo es: " + coche1.getMarca());
    }

}

