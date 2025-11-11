package Tema3;

import java.util.Scanner;

public class MuestraDePalabras {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        int numeroPalabras=0;
        System.out.println("Dime el número de palabras que quieres: ");
        numeroPalabras = Integer.parseInt(sc.nextLine());

        //Crear un array de Strings del tamaño numeroPalabras
        String[] palabras = new String[numeroPalabras];

        //Pedimos por teclado cada palabra
        for(int i=0; i < numeroPalabras; i++) {
            System.out.println("Dime palabra para guardar:");
            palabras[i] = sc.nextLine();
        }

        //Pintar las palabras
        for(int i=0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

    }
}
