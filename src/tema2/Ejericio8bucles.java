package tema2;

import java.util.Scanner;

public class Ejericio8bucles {
    public static void main(String[] args) {

        //Pide 10 palabras por teclado y dime cuantas de ellas
        //tienen longitud mayor de 5 caracteres
        //cadena.length() devuelve la longitud de la cadena

        String palabra ="Hola";
        System.out.println(palabra.length());

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int num =1;


        while (num <= 10) {
            System.out.println("Dime una palabra " + num);
            palabra = sc.nextLine();
            System.out.println(palabra + " -> " + palabra.length());
            num++;
        }



    }
}
