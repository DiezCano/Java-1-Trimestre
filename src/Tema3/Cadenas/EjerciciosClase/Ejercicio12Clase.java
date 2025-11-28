package Tema3.Cadenas.EjerciciosClase;

public class Ejercicio12Clase {
    public static void main(String[] args) {

        /**
         * Encontrar la palabra de mayor longitud de este texto: "No se me ocurre ninguna frase larga".
         */

        String texto = "No se me ocurre ninguna frase larga";

        // Dividir el texto en palabras usando espacio como separador
        String[] palabras = texto.split(" ");

        String palabraMasLarga = "";

        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        System.out.println("La palabra más larga es: " + palabraMasLarga);
    }
}