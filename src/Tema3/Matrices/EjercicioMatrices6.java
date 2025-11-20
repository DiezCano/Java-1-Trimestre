package Tema3.Matrices;

public class EjercicioMatrices6 {

    public static void pintarMatrices(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {
        //Dibuja una matriz 8x8 con un patron de tablero de ajedrez usando "X" blancas y "O" negras

        char[][] matriz = new char[8][8];



    }
}
