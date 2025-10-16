package tema2;

import java.util.Scanner;

public class EjercicioBucles6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long numero;
        long contador;

        System.out.println("Dime un numero entero" );
        numero = sc.nextLong();

        contador = 0;
        while (numero / 10 != 0) {
            numero = numero / 10;

            contador++;
        }

        System.out.println("El numero tiene " + contador + " digitos ");


    }
}
