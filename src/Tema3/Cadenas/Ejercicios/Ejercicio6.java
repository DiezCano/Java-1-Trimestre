package Tema3.Cadenas.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        /**
         * Diseña un programa en Java que solicite al usuario una cadena de
         * caracteres y muestre por pantalla un conteo de cuántas vocales,
         * consonantes y espacios en blanco contiene la cadena introducida.
         */
        String cadena = "Javi o paras o me explota la cabeza por favor :";
        int ContadorVocales = 0, ContadorConsonantes = 0, ContadorEspacios = 0;


        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i'
                    || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u' || cadena.charAt(i) == 'á'
                    || cadena.charAt(i) == 'é' || cadena.charAt(i) == 'í' || cadena.charAt(i) == 'ó'
                    || cadena.charAt(i) == 'ú') {
                ContadorVocales++;
            } else if ( cadena.charAt(i) == ' ') {
                ContadorEspacios++;
            } else if ( cadena.charAt(i) == ',') {
                continue;
            } else  {
                ContadorConsonantes++;
            }
        }
        System.out.println(ContadorVocales);
        System.out.println(ContadorConsonantes);
        System.out.println(ContadorEspacios);
    }
}
