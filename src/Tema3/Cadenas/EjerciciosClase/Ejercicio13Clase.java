package Tema3.Cadenas.EjerciciosClase;

public class Ejercicio13Clase {
    public static void main(String[] args) {

        /**
         *Crear una cadena de texto formada por tres cadenas "una", "dos" y "tres" usando
         * StringBuilder. Añade separadores entre ellas y muestra la cadena resultante.
         */

        StringBuilder sb = new StringBuilder("Uno");
        sb.append(" - ");
        sb.append(" Dos ");
        sb.append(" - ");
        sb.append(" Tres ");

        System.out.println(sb);

    }
}
