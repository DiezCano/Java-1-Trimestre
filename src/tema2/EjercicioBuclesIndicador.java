package tema2;

import java.util.Scanner;

    class EjerciciosBuclesIndicador {
    public static void main(String[] args) {

        //Pide 5 numeros por teclado y dime si "alguno" de ellos
        //es multiplo de 5

        Scanner sc = new Scanner(System.in);
        int numero;
        boolean esMultiplo = false;

        for (int i=0; i < 5; i++) {
            System.out.println("Dime un numero");
            numero = sc.nextInt();

            if (numero % 5 == 0) {
                esMultiplo = true;
            }
        }

        if (esMultiplo) { // Has introdcido al menos 1 numero multiplo de 5
            System.out.println("Algun numero es Multiplo de 5 ");
        } else  { // No has metido ningun multiplo de 5 , no ha entrado al if en todo el bucle
            System.out.println("Ningun no es Multiplo de 5");
        }

    }
}
