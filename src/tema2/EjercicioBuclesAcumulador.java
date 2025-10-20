package tema2;

import java.util.Scanner;

public class EjercicioBuclesAcumulador {
    public static void main(String[] args) {

        //Pide 5 numeros por teclado y guarda en una variable la suma de lso
        //que sean impares

        int sumaImpares = 0;
        int suma;


        for (int num = 0; num < 5; num++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dame los 5 primeros numeros ");
            num = sc.nextInt();
            if (num % 2  != 0) {
                sumaImpares += num;
            }
            System.out.println("Los impares son " + sumaImpares);
        }




    }
}
