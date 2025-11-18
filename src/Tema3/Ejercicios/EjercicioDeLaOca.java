package Tema3.Ejercicios;

import java.util.Scanner;

public class EjercicioDeLaOca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] casillas = new String[63];
        int[] ocas = {1, 5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59};
        int[] puentes = {6,12};
        int[] dados = {26,53};
        int muerte = 58;

        //int pozo = 31; --> hasta quee pase otro
        //int carcel = 52; --> caiga otro
        //int laberinto = 42; --> cuatro turnos

        //Fichas jugadores, la posicion en la que esta cada jugador
        int[] jugadores = {-1,-1,-1,-1};


        int tirada = 0;

        while(true) {

            for  (int i=0; i< jugadores.length; i++) {
                System.out.println("Jugador " + (i+1) + ":" + jugadores[i]);
                tirada = tirada ();
                System.out.println("Tirada: " + tirada);
            }

            tirada = tirada();
            System.out.println("Tirada: " + tirada);

            //Mover jugador
            jugadores[0] = jugadores[0] + tirada;

            //Comprobar donde esta
            if (jugadores[0]+1  == muerte) {
                System.out.println("Game Over");
                jugadores[0] = -10;
            }
            if (jugadores[0]+1 == dados[0]) {
                jugadores[0] = dados[1]-1;
            }
            if (jugadores[0]+1 == dados[0]) {
                jugadores[0] = dados[0]-1;
            }
            //Puentes
            if (jugadores[0]+1 == puentes[0]) {
                jugadores[0] = puentes[0]-1;
            }
            if (jugadores[0]+1 == puentes[1]) {
                jugadores[0] = puentes[0]-1;
            }
            //OCA
            for (int i = 0; i < ocas.length; i++) {
                if (jugadores[0]+1 == ocas[i]) {
                    jugadores[0] = ocas[i +1]-1;
                }
            }

        }
    }

}
