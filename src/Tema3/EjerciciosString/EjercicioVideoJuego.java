package Tema3.EjerciciosString;

import java.util.Scanner;

public class EjercicioVideoJuego {

    public static void pintar(String[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println((i+1) + " -> " + array[i]);
        }
    }

    /**
     * Número aleatorio entre 0 y maximo-1
     * @param maximo
     * @return
     */
    public static int numeroAleatorio(int maximo) {
        return (int) (Math.random() * maximo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arma, enemigo;

        String[] armas = { "Espada del Caos", "Arco del Triunfo",
                "Báculo sagrado", "Dagas de la Luz" };
        //int[] usosArmas = { 2, 5, 1, 8 };
        int[] pdArmas = { 25, 10, 20, 15 };
        String[] enemigos = {"Orco", "Elfo oscuro", "Enano loco", "Dragón blanco"};
        int[] psEnemigos = { 60, 120, 50, 100 };

        for(int i=0; i < armas.length; i++) {
            System.out.println(armas[i] + " - " + pdArmas[i]);
        }

        int enemigosDerrotados = 0;
        boolean maquina=false;

        while(!maquina) {
            //Golpear
            System.out.println("Elige arma (1-4)");
            pintar(armas);
            arma = Integer.parseInt(sc.nextLine());

            //No golpear a un enemigo muerto
            do {
                enemigo = numeroAleatorio(enemigos.length);
            } while (psEnemigos[enemigo] <= 0);

            //Quitar salud a ese enemigo
            psEnemigos[enemigo] -= pdArmas[arma - 1];
            System.out.println("Enemigo " + enemigos[enemigo] + " tiene " + psEnemigos[enemigo] + " HP");

            //Comprobar salud del enemigo
            if (psEnemigos[enemigo] <= 0) {
                System.out.println("Has derrotado al enemigo " + enemigos[enemigo]);
            }

            //Mostrar enemigos y su salud
            for (int i = 0; i < enemigos.length; i++) {
                if (psEnemigos[i] <= 0) {
                    System.out.println(enemigos[i] + " ha sido derrotado");
                } else {
                    System.out.println(enemigos[i] + " - " + psEnemigos[i]);
                }
            }

            //Si hay al menos dos enemigos derrotados que termine el bucle
            enemigosDerrotados=0;
            for(int i=0; i < psEnemigos.length; i++) {
                if (psEnemigos[i] <= 0) {
                    enemigosDerrotados++;
                }
                if (enemigosDerrotados >= 2) {
                    maquina=true;
                    break;
                }
            }

        }


    }



}
