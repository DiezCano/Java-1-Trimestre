package Trimestre2.Tema6.Fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Curso {

    private LocalDate HoraInicio;
    private LocalDate HoraFinal;

    public void Sesion(LocalTime horaInicio, LocalTime horaFin) {
        this.HoraInicio = HoraInicio;
        this.HoraFinal = HoraFinal;
    }

    public Curso(LocalDate horaInicio, LocalDate horaFinal) {
        HoraInicio = horaInicio;
        HoraFinal = horaFinal;
    }

    public LocalDate getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(LocalDate horaInicio) {
        HoraInicio = horaInicio;
    }

    public LocalDate getHoraFinal() {
        return HoraFinal;
    }

    public void setHoraFinal(LocalDate horaFinal) {
        HoraFinal = horaFinal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GestionHorarios{");
        sb.append("HoraInicio=").append(HoraInicio);
        sb.append(", HoraFinal=").append(HoraFinal);
        sb.append('}');
        return sb.toString();
    }

    public Duration calcularDuracion() {
        return Duration.between(HoraInicio, HoraFinal);
    }
}
