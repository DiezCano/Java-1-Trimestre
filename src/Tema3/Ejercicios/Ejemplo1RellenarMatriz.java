package Tema3.Ejercicios;

public class Ejemplo1RellenarMatriz {
    static void main() {
        double[][] matriz = new double[4][4];

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = (Math.random()*100);
            }
        }

    }
}
