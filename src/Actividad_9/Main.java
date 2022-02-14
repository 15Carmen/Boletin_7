package Actividad_9;

public class Main {
    public static void main(String[] args) {

        PersonaC persona1 =new PersonaC("8763259",15,"Josemi",new PesoAlturaC(60,185));
        PersonaC persona2 = (PersonaC) persona1.cloneSup();

        System.out.println("La persona original es: "+ persona1.toString());
        System.out.println("La persona clonada superficialmente es: "+ persona2.toString());
        System.out.println("\nAhora vamos a cambiar los atributos al objeto clonado superficialmente");

        persona2.setDni("7373648");
        persona2.setEdad(23);
        persona2.setNombre("Carla");
        persona2.getPesoAltura().setAltura(165);
        persona2.getPesoAltura().setPeso(50);

        System.out.println("Las características de la personona original y del clon actualmente son: ");
        System.out.println("persona original: "+ persona1.toString());
        System.out.println("persona clonada: "+ persona2.toString());

        PersonaC persona3 = (PersonaC) persona1.cloneDeep();
        System.out.println("\nAhora vamos a comparar a la persona con una persona clonada profundamente");
        System.out.println("La persona clonada profundamente es: "+ persona3.toString());
        System.out.println("\nAhora cambiamos los atributos al objeto clonado profundamente");
        persona3.setDni("0987654");
        persona3.setNombre("Lola");
        persona3.setEdad(25);
        persona3.getPesoAltura().setAltura(175);
        persona3.getPesoAltura().setPeso(58);
        System.out.println("La persona original es: "+ persona1.toString());
        System.out.println("La persona clonada profundamente es: "+ persona3.toString());
    }
}
