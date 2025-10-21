package Repaso;

import java.util.Scanner;

public class Medias {
    public static void main(String[] args) {

        //Programa que pida numeros hasta que se introduzca un 0
        // Debe imprimir la suma y la media de todos los nummeros introducidos

        //1.Bucle Infinito
        //2. Ir pidiendo por teclado cada iteraccion un numero
        //3. Cuando el numero sea igual a 0 -> termina el bucle (break)
        //4. En un contador guardar la suma de todos los numeros
        //5. Un contador (i) para saber cuantos numeros pido por teclado
        //6. Media = acumulador / contador

        int numero = 0;
        int contador = 0;
        long suma = 0;
        int i;
        Scanner sc = new Scanner(System.in);

        for ( i = 1; true; i++) {
            System.out.println("Ingrese el numero de la operacion: ");
            numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Si sale 0 se acaba");
                break ;
            }

            //Calculos de la suma

            suma = suma + numero;
            System.out.println(suma);




        }

        System.out.println("La media es " + suma / --i);

    }
}
