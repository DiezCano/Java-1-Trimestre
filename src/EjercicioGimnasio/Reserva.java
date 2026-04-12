package EjercicioGimnasio;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva {

    private Socio socio;
    private Actividad actividad;
    private LocalDate fechaReserva;
    private boolean asistio = false;

    public Reserva(Socio socio, Actividad actividad, LocalDate fechaReserva) {
        this.socio = socio;
        this.actividad = actividad;
        this.fechaReserva = fechaReserva;
    }

    public Socio getSocio() {
        return socio;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void confirmarAsistencia() {
        asistio = true;
    }

    public boolean estaActiva() {
        return !fechaReserva.isBefore(LocalDate.now());
    }

    @Override
    public boolean equals(Object o) {
        Reserva r = (Reserva) o;
        return socio.equals(r.socio)
                && actividad.equals(r.actividad)
                && fechaReserva.equals(r.fechaReserva);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socio, actividad, fechaReserva);
    }

    @Override
    public String toString() {
        return socio + " -> " + actividad + " (" + fechaReserva + ")";
    }

}
