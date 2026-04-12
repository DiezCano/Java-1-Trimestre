package EjercicioGimnasio;

import java.time.LocalTime;

public class Actividad implements Comparable<Actividad> {

    private String codigo;
    private String nombre;
    private String descripcion;
    private String monitor;
    private DiaSemana diaSemana;
    private LocalTime horaInicio;
    private int duracionMinutos;
    private int aforoMaximo;

    public Actividad(String codigo, String nombre, String descripcion, String monitor, DiaSemana diaSemana, int duracionMinutos, LocalTime horaInicio, int aforoMaximo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.monitor = monitor;
        this.diaSemana = diaSemana;
        this.duracionMinutos = duracionMinutos;
        this.horaInicio = horaInicio;
        this.aforoMaximo = aforoMaximo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Override
    public int compareTo(Actividad a) {
        int cmp = this.diaSemana.compareTo(a.diaSemana);
        if (cmp == 0) {
            return this.horaInicio.compareTo(a.horaInicio);
        }
        return cmp;
    }

    @Override
    public boolean equals(Object o) {
        Actividad a = (Actividad) o;
        return this.codigo.equals(a.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }

    @Override
    public String toString() {
        return nombre + " (" + diaSemana + " " + horaInicio + ")";
    }



}
