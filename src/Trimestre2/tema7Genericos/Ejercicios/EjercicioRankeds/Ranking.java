package Trimestre2.tema7Genericos.Ejercicios.EjercicioRankeds;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ranking {

    private Set<Jugador> jugadores;
    private TreeSet<Jugador> jugadoresOrdenados;
    int posicion = 1;


    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public TreeSet<Jugador> getJugadoresOrdenados() {
        return jugadoresOrdenados;
    }

    public void pintarJugadores() {
        for (Jugador j : jugadores) {
            IO.println(j);
        }
    }

    public void pintarRanking() {
        for(Jugador jugador: jugadores ) {
            IO.println(jugador);
        }
    }







}
