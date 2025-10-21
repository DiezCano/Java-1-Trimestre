package Repaso;

import java.util.Scanner;

public class Repaso1Java {
    public static void main(String[] args) {

        //Realizar un algoritmo que pida numeros (se pediria por teclado la
        // cantidad de numeros a introducir). El programa debe informar de
        //cuantos numeros introducidos son mayores que 0,
        //menores que 0 (e iguales a 0)

        int numero;
        int numeroDos;
        int contador = 0, contadorDos = 0, contadorTres = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos Numeros quieres hacer: ");
        numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println("Cuantos Numeros que desea realizar: " + i );
            numeroDos = sc.nextInt();

            if (numeroDos > 0) {
                System.out.println("Es mayor que 0: " + ++contador);
            } else if ( numeroDos < 0 ) {
                System.out.println("Es menor que 0: "  + ++contadorDos);
            } else if ( numeroDos == 0 ) {
                System.out.println("Es igual que 0: " + ++contadorTres);
            }
        }


    }
}
