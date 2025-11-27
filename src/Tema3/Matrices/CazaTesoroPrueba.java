package Tema3.Matrices;
import java.util.Scanner;

public class CazaTesoroPrueba {
    public static void main(String[] args) {

        class JuegoTesoro {

            private char[][] tablero = new char[10][10];
            private int tesoroX;
            private int tesoroY;

            public JuegoTesoro() {
                // 1. Inicializar tablero con '-'
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        tablero[i][j] = '-';
                    }
                }

                // 2. Colocar tesoro en posición aleatoria
                tesoroX = (int) (Math.random() * 10);
                tesoroY = (int) (Math.random() * 10);
                tablero[tesoroX][tesoroY] = 'T';  // Se guarda internamente, pero no se muestra al jugador
            }

            // Distancia Manhattan
            private int distancia(int x1, int y1, int x2, int y2) {
                return Math.abs(x1 - x2) + Math.abs(y1 - y2);
            }

            public void jugar() {
                Scanner sc = new Scanner(System.in);

                int intentos = 15;
                int distanciaAnterior = Integer.MAX_VALUE;

                System.out.println("¡Bienvenido al juego del tesoro!");
                System.out.println("Tienes 15 intentos para encontrar el tesoro.");
                System.out.println("Introduce coordenadas entre 0 y 9.");

                while (intentos > 0) {

                    System.out.println("\nIntentos restantes: " + intentos);

                    System.out.print("Ingresa coordenada X: ");
                    int x = sc.nextInt();

                    System.out.print("Ingresa coordenada Y: ");
                    int y = sc.nextInt();

                    // Validación de coordenadas
                    if (x < 0 || x > 9 || y < 0 || y > 9) {
                        System.out.println("Coordenadas fuera de rango, intenta de nuevo.");
                        continue;
                    }

                    // 7. Comprobar si encontró el tesoro
                    if (x == tesoroX && y == tesoroY) {
                        System.out.println("\n🎉 ¡Felicidades! ¡Encontraste el tesoro! 🎉");
                        return;
                    }

                    // 5. Calcular distancia Manhattan
                    int distanciaActual = distancia(tesoroX, tesoroY, x, y);

                    if (distanciaActual < distanciaAnterior) {
                        System.out.println("👉 Estás más cerca del tesoro.");
                    } else if (distanciaActual > distanciaAnterior) {
                        System.out.println("👈 Estás más lejos del tesoro.");
                    } else {
                        System.out.println("➖ Estás a la misma distancia que antes.");
                    }

                    distanciaAnterior = distanciaActual;
                    intentos--;
                }

                // Si se quedan sin intentos
                System.out.println("\n💀 Te has quedado sin intentos. ¡Has perdido!");
                System.out.println("El tesoro estaba en: (" + tesoroX + ", " + tesoroY + ")");
            }
        }





    }
}
