package Tema3.Cadenas;

public class Ejercicio2 {
    public static void main(String[] args) {


        //Comparación de cadenas
        //obj1.equals(obj2) --> Comprobar que dos objetos son iguales
        String cad1 = "Esta tarde no voy";
        String cad2 = "Esta tarde no VOY";
        if (cad1.equalsIgnoreCase(cad2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }


    }
}
