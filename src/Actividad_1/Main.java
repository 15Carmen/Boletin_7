package Actividad_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehiculo coche1 = new Vehiculo();
        Vehiculo coche2 = new Vehiculo();
        String matricula;
        String marca;
        coche2.setMarcaString(Modelo.MERCEDES);
        System.out.println("Por favor, introduce la matricula del vehículo");
        coche1.setMatricula(scanner.nextLine());
        System.out.println("Por favor, introduce la marca del vehículo");
        try {
            coche1.setMarcaDeVehiculos(scanner.nextLine());
            //coche1.setMarca(Modelo.valueOf(scanner.nextLine())); dos formas de hacer lo mismo
        }catch (Exception e){
            System.out.println("Marca no válida");
            //coche2.setMarcaDeVehiculos(); repasar
        }
        System.out.println("La matricula del coche 1 es: " + coche1.getMatricula());
        System.out.println("El modelo del coche 1 es: " + coche1.getMatricula());
        System.out.println("La matricula del coche 2 es: " + coche2.getMatricula());
        System.out.println("El modelo del coche 2 es: " + coche1.getMatricula());
    }

}

