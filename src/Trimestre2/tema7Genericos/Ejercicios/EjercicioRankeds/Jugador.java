package Trimestre2.tema7Genericos.Ejercicios.EjercicioRankeds;

import java.util.Objects;

public class Jugador implements Comparable<Jugador> {

    private String id;
    private String nickname;
    private int puntos;
    private int nivel;
    private String Pais;

    public Jugador(String id, String nickname, int puntos, int nivel) {
        this.id = id;
        this.nickname = nickname;
        this.puntos = 0;
        this.nivel = 1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nivel=").append(nivel);
        sb.append(", puntos=").append(puntos);
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(id, jugador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    @Override
    public int compareTo(Jugador otro) {
        return Integer.compare(otro.puntos, this.puntos);
    }
}
