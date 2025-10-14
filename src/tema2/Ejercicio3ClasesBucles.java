package tema2;

import java.util.Scanner;

public class Ejercicio3ClasesBucles {
    public static void main(String[] args) {

        //Adivinar un numero generado por el pc entre (1-100)
        //Pedir por teclado un numero entre 1- 100, y el programa
        //nos responde si el numero introducido es igual (fin), mayor
        //o menor que el numero generado a acertar
        //Extra: 7 intentos maximo

        int numeroAAdivinar = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numero = 0;

        do {
            System.out.println(" Dime un numero entre 1 y 100 ");
            numeroAAdivinar = sc.nextInt();
            if (numero > numeroAAdivinar) {
                contador++;
                System.out.println("Te has pasado de numero, mas pequeño");
            } else if (numero < numeroAAdivinar) {

            }
        } while (numero != numeroAAdivinar);

    }
}
