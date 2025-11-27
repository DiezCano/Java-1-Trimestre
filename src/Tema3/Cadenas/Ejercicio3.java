package Tema3.Cadenas;

public class Ejercicio3 {
    public static String StringmitadCadena(String cad) {
        return cad.substring(0, cad.length() /2);
    }
    public static String MitadCadenaFinal(String cad) {
        return cad.substring(cad.length() /2, cad.length());
    }
    public static void main(String[] args) {

        String cadena ="Esto es una locura rubius son 200";
        System.out.println(StringmitadCadena(cadena));





    }
}
