package tema1;

import java.util.Scanner;

public class TareasClases1 {
    public static void main(String[] args) {


        //Dados los catetos de un triangulo rectangulo , calcular su hipotenusa

        Scanner sc = new Scanner(System.in);

        // Declarar variables
        double cateto1, cateto2, hipotenusa;

        // Leer cateto1
        System.out.print("Introduce el cateto 1: ");
        cateto1 = sc.nextDouble();

        // Leer cateto2
        System.out.print("Introduce el cateto 2: ");
        cateto2 = sc.nextDouble();

        hipotenusa =Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("La hipotenusa es = " + hipotenusa);












    }
}
