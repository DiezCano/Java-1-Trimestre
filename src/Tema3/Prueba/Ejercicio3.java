package Tema3.Prueba;

import java.util.Scanner;

public class Ejercicio3 {

    public static void inicializarTablero(char[][] tablero) {
        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                tablero[i][j] = '~';
            }
        }
    }

    /**
     * Pinta la matriz en pantalla
     * @param matriz
     */
    public static void mostrarTablero(char[][] matriz, boolean mostrarBarcos) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                if (mostrarBarcos && matriz[i][j] == 'B') {
                    System.out.printf("%2c", matriz[i][j]);
                } else if (!mostrarBarcos && matriz[i][j] == 'B') {
                    System.out.printf("%2c", '~');
                } else {
                    System.out.printf("%2c", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void colocarBarco(char[][] tablero, int tamano) {
        int direccion; // 0 -> horizontal, 1 -> vertical
        int fila, columna;
        boolean solapado = false;

        do {
            fila = (int)(Math.random()*8);
            columna = (int)(Math.random()*8);
            direccion = (int)(Math.random()*2);

            if (direccion == 0) { //Horizontal
                //Comprobar que no se salga del tablero
                if (columna <= 7 - tamano) {
                    //Comprobar que no se solapen
                    solapado = false;
                    for (int i = 0; i < tamano; i++) {
                        if (tablero[fila][columna + i] == 'B') {
                            solapado = true;
                        }
                    }

                    //Si no se solapa, continuar
                    if (!solapado) {
                        //Colocar barco
                        for (int i = 0; i < tamano; i++) {
                            tablero[fila][columna + i] = 'B';
                        }
                        break; //Barco colocado
                    }
                }
            } else {
                //Comprobar que no se salga del tablero
                if (fila <= 7-tamano) { //Vertical
                    //Comprobar que no se solapen
                    solapado = false;
                    for (int i = 0; i < tamano; i++) {
                        if (tablero[fila + i][columna] == 'B') {
                            solapado = true;
                        }
                    }

                    //Si no se solapa, continuar
                    if (!solapado) {
                        for (int i = 0; i < tamano; i++) {
                            tablero[fila + i][columna] = 'B';
                        }
                        break; //Barco colocado
                    }
                }
            }
        } while( true );

    }

    public static boolean todosBarcosHundidos(char[][] tablero) {
        boolean todosHundidos = true;
        for(int i=0; i < tablero.length; i++) {
            for(int j=0; j < tablero[i].length; j++) {
                if (tablero[i][j] == 'M') {
                    todosHundidos = false;
                    break;
                }
            }
        }
        return todosHundidos;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int disparos = 20;
        char[][] tablero = new char[8][8];
        int dispFila, dispColumna;

        inicializarTablero(tablero);

        colocarBarco(tablero, 2);
        colocarBarco(tablero, 2);
        colocarBarco(tablero, 2);

        mostrarTablero(tablero,true);

        while(disparos > 0) {

            try {
                System.out.println("Introduce fila del disparo:");
                dispFila = Integer.parseInt(sc.nextLine());
                System.out.println("Introduce columna del disparo:");
                dispColumna = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Coordenadas incorrectas");
                continue;
            }

            try {
                if (tablero[dispFila][dispColumna] == 'M') {
                    System.out.println("TOCADO!");
                    tablero[dispFila][dispColumna] = 'X';
                } else if (tablero[dispFila][dispColumna] == '~') {
                    System.out.println("AGUA");
                    tablero[dispFila][dispColumna] = 'O';
                } else if (tablero[dispFila][dispColumna] == 'X' || tablero[dispFila][dispColumna] == 'O') {
                    System.out.println("YA DISPARASTE AHI");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordenadas fuera de rango");
                continue;
            }

            mostrarTablero(tablero, false);

            //Condición de victoria
            if (todosBarcosHundidos(tablero)) {
                System.out.println("GANASTE");
                break;
            }

            disparos--;
            System.out.println("Disparos restantes: " + disparos);
        }

        if (disparos == 0) {
            System.out.println("PERDISTE");
        }

    }
}
