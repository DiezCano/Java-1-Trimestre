package Tema3.Cadenas.EjerciciosClase;

public class Ejercicio14Clase {

    /**
     * Cifrado César. Crea un algoritmo de encriptación que reciba una frase y
     * una clave numérica. Sumará en código ASCII esa clave a cada letra de la frase.
     * Implementa también una función para desencriptar.
     *
     * "Esto es un secreto, el examen va a ser complicado"
     * Clave 3
     * "Hv..."
     *
     * String -> charAt -> char
     * char <-> int  char + 3 --> sumar al código ASCII 3
     *
     */

    public static String encriptar(String frase, int clave) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            resultado += (char) (c + clave);
        }
        return resultado;
    }

    public static String desencriptar(String fraseEncriptada, int clave) {
        String resultado = "";
        for (int i = 0; i < fraseEncriptada.length(); i++) {
            char c = fraseEncriptada.charAt(i);
            resultado += (char) (c - clave);
        }
        return resultado;
    }

    public static void main(String[] args) {
        String texto = "Hola mundo";
        int clave = 3;

        String encriptado = encriptar(texto, clave);
        System.out.println("Encriptado: " + encriptado);

        String desencriptado = desencriptar(encriptado, clave);
        System.out.println("Desencriptado: " + desencriptado);
    }
}