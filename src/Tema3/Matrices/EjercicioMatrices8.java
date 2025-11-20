package Tema3.Matrices;
public class EjercicioMatrices8 {

    public static void pintarMatrices(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf(" - ", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }
    public static void main(String[] args) {

        /**
         *Dada una matriz de 8x8 que representa un tablero de ajedrez
         * dadas las coordenadas i , j donde está el rey en el tablero
         * Dime a que posiciones del tablero se puede mover el rey
          */

        int[][] tablero = new int[8][8];

        for (int i=0; i < tablero.length; i++){
            for (int j=0; j < tablero[i].length; j++){
                tablero[i][j] = '-';
            }
            int reyX = 2, reyY = 4;
            tablero[reyX][reyY] = 'R';
        }
        pintarMatrices(tablero);
    }
}
