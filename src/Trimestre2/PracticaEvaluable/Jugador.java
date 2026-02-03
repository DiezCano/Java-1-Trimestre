package Trimestre2.PracticaEvaluable;

import java.util.Objects;

public abstract class Jugador {

    private Integer id;
    private String alias;
    private int puntos;

    public Jugador(int puntos, String alias, Integer id) {
        this.puntos = puntos;
        this.alias = alias;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("puntos=").append(puntos);
        sb.append(", alias='").append(alias).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    public void addPuntos(int puntos) {
        this.puntos += puntos;
    }

    public abstract String imprimirRol();


    public void add(Jugador jugador) {
    }
}
