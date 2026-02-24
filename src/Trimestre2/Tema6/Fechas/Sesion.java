package Trimestre2.Tema6.Fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Sesion {

   private String Curso;
   private LocalDate FechaInicio;
   private LocalDate FechaFinal;

    public Sesion(String curso, LocalDate fechaInicio, LocalDate fechaFinal) {
        Curso = curso;
        FechaInicio = fechaInicio;
        FechaFinal = fechaFinal;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        FechaFinal = fechaFinal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GestiodeFechas{");
        sb.append("Curso='").append(Curso).append('\'');
        sb.append(", FechaInicio=").append(FechaInicio);
        sb.append(", FechaFinal=").append(FechaFinal);
        sb.append('}');
        return sb.toString();
    }

    public Period calcularDuracion() {
        return Period.between(FechaInicio, FechaFinal);
    }

    public boolean estaActivo(LocalDate fecha) {
        return !fecha.isBefore(FechaInicio) && !fecha.isAfter(FechaFinal);
    }

    public long diasRespectoInicio(LocalDate fechaActual) {
        if (fechaActual.isBefore(FechaInicio)) {
            return ChronoUnit.DAYS.between(fechaActual, FechaInicio);
        } else {
            return ChronoUnit.DAYS.between(FechaInicio, fechaActual);
        }
    }
}
