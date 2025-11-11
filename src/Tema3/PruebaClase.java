package Tema3;

public class PruebaClase {
    public static void main() {
        
        //Crea un array de 10 números de tipo double y píntalos en orden inverso
        double[] numeros = {3.4, 5.5, 2.9, 5.6, 7.8, 9.1, 3.3, 1.2, 4.5, 6.7};
        
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
}
