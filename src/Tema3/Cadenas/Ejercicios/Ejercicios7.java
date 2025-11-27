package Tema3.Cadenas.Ejercicios;

import javax.swing.*;

public class Ejercicios7 {
    public static void main(String[] args) {

        /**
         * Diseña un programa en Java que solicite al usuario una cadena
         * en la que buscará y otra que será la cadena buscada. El programa
         * indicará cuántas veces aparece la segunda cadena en la primera.
         *
         * cadena = "El día de hoy es el más largo de mi vida."
         * subcadena = "de"
         * contador = 2
         *
         * indexOf
         *
         */

        String cadena = "El día de hoy es el más largo de mi vida.";
        String subcadena = "de";
        int contador = 0;
        int FromIndex = 0;

        while (FromIndex != -1) {
            FromIndex = cadena.indexOf(subcadena, FromIndex+1);
            if (FromIndex != -1) {
                contador++;
            }
        }
        System.out.println(contador);

        System.out.println("Subcadena: " + cadena.substring( 7, 32 ));








    }
}
