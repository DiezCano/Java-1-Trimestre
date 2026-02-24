package Trimestre2.PracticaEvaluable;

import java.util.ArrayList;

public class Equipo {

    private String Nombre;
    private String Pais;
    private static int TotalPuntos;
    private static ArrayList<Jugador> jugadores;

    public Equipo(String Nombre, String pais) {
        this.Nombre = this.Nombre;
        this.Pais = this.Pais;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getTotalPuntos(int idBusq) {
        return TotalPuntos;
    }

    public void setTotalPuntos(int totalPuntos) {
        TotalPuntos = totalPuntos;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public void imprimirDatosEquipo() {
        System.out.println("Nombre del equipo: " + Nombre);
        System.out.println("País: " + Pais);
        System.out.println("Total de puntos: " + TotalPuntos);
    }

    public static void nuevoJugador(Jugador jugador) {
        jugador.add(jugador);
    }

    public static void calcularTotalPuntos() {
        TotalPuntos = 0;

        for (Jugador j : jugadores) {
            TotalPuntos += j.getPuntos();
        }
    }

    public static void listarJugadores() {

        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores en el equipo.");
            return;
        }

        for (Jugador j : jugadores) {
            System.out.println("Alias: " + j.getAlias() +
                    " | Puntos: " + j.getPuntos());
        }
    }

    public static void buscarJugadorPorId(int id) {

        for (Jugador j : jugadores) {
            if (j.getId() == id) {
                System.out.println(j.toString());
                return;
            }
        }
        System.out.println("No existe ningún jugador con el ID " + id);
    }

}
