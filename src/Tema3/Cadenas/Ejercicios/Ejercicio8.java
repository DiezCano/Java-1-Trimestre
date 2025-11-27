package Tema3.Cadenas.Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        /**
         * Crea un programa en Java que solicite al usuario dos cadenas de caracteres y que devuelva la
         * primera cadena, pero transformando en mayúsculas la parte que coincide con la segunda
         * cadena introducida. Por ejemplo, si se introducen las cadenas "Esta es mi amiga Ana" y
         * amiga" devolverá "Esta es mi AMIGA Ana".
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cadena: ");
        String cadena = sc.nextLine();
        System.out.println("La palabra buscada: ");
        String palabra = sc.nextLine();

        System.out.println(cadena.replace(palabra, palabra.toUpperCase()));
    }
}
