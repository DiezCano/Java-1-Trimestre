package Repaso;

import java.util.Scanner;

public class Factorial {
    public static void main() {

        //    Crea una programa que pida un número y calcule su factorial
        //    El factorial de un número es el producto de todos los enteros
        //    entre 1 y el propio número y se representa por el número seguido
        //    de un signo de exclamación. Por ejemplo 5! = 1x2x3x4x5=120

        // Acumulador

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int numero;
        numero = sc.nextInt();
        long acumulador = 1;


        for (int i = 1; i <= numero; i++) {
           acumulador = acumulador * i;
        }

        System.out.println("El resultado es: " + numero + " = " + acumulador);

    }
}
