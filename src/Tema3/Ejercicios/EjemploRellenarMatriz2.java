package Tema3.Ejercicios;

public class EjemploRellenarMatriz2 {


public static double maximo(double [][] m) {
    double maximo = m[0][0];
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[i].length; j++) {
            if (m[i][j] > maximo) {
                maximo = m[i][j];
            }
        }
    }
    return maximo;
}
    public static double minimo(double [][] m) {
        double minimo = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > minimo) {
                    minimo = m[i][j];
                }
            }
        }
        return minimo;
    }
    public static void pintarMatriz(double[][] m) {
        for(int i=0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                System.out.printf("%5.2f | ", m[i][j]);
            }
            System.out.println();  // 3.14 //Pinto el salto de línea al terminar la fila
        }
    }

    public static void main(String[] args) {

        //Rellenar matriz de doubles 10x10 con números aleatorios entre 0.0 y 1.0
        //Encontrar el valor máximo y mínimo de la matriz

        double[][] matriz = new double[10][10];

        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                matriz[i][j] = Math.random();
            }
        }
        pintarMatriz(matriz);
        System.out.println("Maximo del matriz es: " + maximo(matriz));
        System.out.println("Minimo del matriz es:  " + minimo(matriz) );
    }
}
