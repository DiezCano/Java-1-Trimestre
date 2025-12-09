package Tema3.Prueba;

public class Ejercicio2 {


    public static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int[] contarColores(int n) {
        int[] colores = new int[3];
        int tirada = -1;

        while(n > 0) {
            tirada = generarAleatorio(0, 36);
            n--;
            if (tirada == 0) {
                colores[2]++;
            } else if (tirada % 2 != 0 && (tirada >= 1 && tirada <= 10 || tirada >= 19 && tirada <= 28)
                    || tirada % 2 == 0 && (tirada >= 11 && tirada <= 18 || tirada >= 29 && tirada <= 36) ){
                colores[0]++;
            } else {
                colores[1]++;
            }
        }

        return colores;
    }

    public static void main(String[] args) {

        int tirada = -1;
        int contadorTiradas = 0;
        int sumaTiradas = 0;

        while(true) {
            tirada = generarAleatorio(0, 36);
            System.out.print(tirada + " --> ");

            contadorTiradas++;
            sumaTiradas += tirada;

            if (tirada == 0) {
                System.out.println("Verde");
                break;
            } else if (tirada % 2 != 0 && (tirada >= 1 && tirada <= 10 || tirada >= 19 && tirada <= 28)
                    || tirada % 2 == 0 && (tirada >= 11 && tirada <= 18 || tirada >= 29 && tirada <= 36) ){
                System.out.println("Rojo");
            } else {
                System.out.println("Negro");
            }

        }

        System.out.println("Se hicieron " + contadorTiradas + " hasta salir el 0");
        System.out.println("La suma de todas las tiradas es " + sumaTiradas);

        System.out.println();
        System.out.println("50 Tiradas");
        int[] colores = contarColores(50);
        System.out.println("Rojos: " + colores[0] + " Negros: " + colores[1] +
                " Verdes: " + colores[2]);

        System.out.println();
        System.out.println("200 Tiradas");
        colores = contarColores(2000);
        System.out.println("Rojos: " + colores[0] + " Negros: " + colores[1] +
                " Verdes: " + colores[2]);





    }
}
