package Tema3.Prueba;

public class Ejercicio1 {

    public static String encriptar(String texto) {
        StringBuffer sb = new StringBuffer(texto);
        StringBuffer salida = new StringBuffer();
        //1. Cambiar vocales
        for(int i=0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            switch (letra) {
                case 'a','A': sb.setCharAt(i, '4'); break;
                case 'e','E': sb.setCharAt(i, '3'); break;
                case 'i','I': sb.setCharAt(i, '1'); break;
                case 'o','O': sb.setCharAt(i, '0'); break;
                case 'u','U': sb.setCharAt(i, '9'); break;
            }
        }

        //2. Invertir palabras
        String[] palabras = sb.toString().split(" ");
        for(int i=0; i < palabras.length; i++) {
            salida.append(new StringBuffer(palabras[i]).reverse()).append(" ");
        }

        //3. Devolver texto encriptado
        return salida.toString();
    }

    public static void main(String[] args) {

        String textoEncriptado;
        String texto = "Buenos dias Eva";
        textoEncriptado = encriptar(texto);
        System.out.println("Texto encriptado: " + textoEncriptado);

    }
}
