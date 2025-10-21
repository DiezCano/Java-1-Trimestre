package Repaso;

import java.util.Scanner;

public class AlgoritmoRepaso {
    public static void main(String[] args) {

        //Pide un número por teclado y comprueba si es o no primo
        //Un número es primo si SOLO es divisible por 1 y por el mismo
        //Ejemplo: 19

        //Modo de hacerlo:
        //Indicador esPrimo=true
        //Bucle desde el 2 hasta el número - 1
        //Si el número es divisible por alguno de esos, esPrimo=false

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int numero = sc.nextInt();
        boolean EsPrimo = true;


        for (int i = 2; i <= numero -1; i++) {
            if (numero % i == 0) {
                EsPrimo = false;
            }
        }

        if (EsPrimo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }


    }
}
