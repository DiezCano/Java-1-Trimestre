package Tema3.Cadenas;

public class Ejercicio4 {
    public static void main(String[] args) {

        String texto = "    Esto es    un texto     mal hecho    ";
        System.out.println(texto);


        //Este es para quitar espacios al principio y al final
        texto = texto.trim();
        System.out.println(texto);

        //Quitar espacios intermedios
        texto = texto.replaceAll(" +" , " ");
        System.out.println(texto);





    }
}
