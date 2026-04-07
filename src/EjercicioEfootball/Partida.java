package EjercicioEfootball;

import java.time.LocalDateTime;

public class Partida {

    private int id;
    private String jugador;
    private String rival;
    private String modoJuego;
    private String equipoLocal;
    private int golesLocal;
    private int golesVisitante;
    private String duracion;
    private LocalDateTime fecha;
    private int estrellasGanadas;

    public Partida(int id, String jugador, String rival,
                   String modoJuego, String equipoLocal, String duracion,
                   LocalDateTime fecha, int estrellasGanadas,
                   int golesVisitante, int golesLocal) {

        this.id = id;
        this.jugador = jugador;
        this.rival = rival;
        this.modoJuego = modoJuego;
        this.equipoLocal = equipoLocal;
        this.duracion = duracion;
        this.fecha = fecha;
        this.estrellasGanadas = estrellasGanadas;
        this.golesVisitante = golesVisitante;
        this.golesLocal = golesLocal;
    }

    public int getId() {
        return id;
    }

    public int getEstrellasGanadas() {
        return estrellasGanadas;
    }

    public String getJugador() {
        return jugador;
    }

    public String getRival() {
        return rival;
    }

    public String getModoJuego() {
        return modoJuego;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }
}
