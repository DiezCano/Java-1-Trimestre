package Trimestre2.tema7Genericos.Ejercicios.EjercicioRankeds;

import java.util.*;

public class Ranking {

    private final Set<Jugador> jugadores = new HashSet<>();

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void pintarJugadores() {
        IO.println("--- JUGADORES ---");
        for(Jugador jugador: jugadores)
            IO.println(jugador);
    }

    public void pintarRanking() {
        Set<Jugador> ranking = new TreeSet<>(Comparator.comparing(Jugador::getPuntos)
                .thenComparing(Jugador::getId));
        ranking.addAll(jugadores);

        IO.println("--- RANKING POR PUNTUACION ---");
        for(Jugador jugador: ranking)
            IO.println(jugador);
    }

    public void top(int n) {
        Set<Jugador> ranking = new TreeSet<>(Comparator.comparing(Jugador::getPuntos)
                .thenComparing(Jugador::getId));
        ranking.addAll(jugadores);

        int i = 0;
        IO.println("--- TOP " + n + " ---");
        for(Jugador jugador: ranking) {
            i++;
            if (i >= n)
                break;

            IO.println(jugador);
        }
    }

    /**
     * Añadir un jugador al ranking, si el id ya está muestra un mensaje
     * @param jugador
     */
    public void registrar(Jugador jugador) {
        if (jugadores.contains(jugador))
            IO.println("Id de jugador repetido: " + jugador.getId());
        else {
            jugadores.add(jugador);
        }
    }

    /**
     * Eliminar un jugador por su id
     * @param id
     */
    public void eliminarJugador(int id) {
        Jugador j = new Jugador("21","Davo",23);
        jugadores.remove(j);
    }

    /**
     * Cambia la puntuación de un jugador determinado por su id
     * @param id
     * @param puntuacion
     */
    public void modificarPuntuacion(int id, int puntuacion) {
        Jugador j = new Jugador("12","Lacobra",15);
        if (jugadores.contains(j)) {
            for(Jugador jugador: jugadores) {

            }
        } else {
            IO.println("Id de jugador no encontrado: " + id);
        }

    }
}
