package Trimestre2.Tema6.EjercicioRepasoExamen;

import java.time.LocalDate;

public class Voto {

    private Participante participante;
    private Long ID;
    private Plan plan;
    private TipoVoto voto;
    private LocalDate FechaVoto;
    private String Comentario;

    public Voto(Participante participante, Long ID, Plan plan, TipoVoto voto, LocalDate fechaVoto, String comentario) {
        this.participante = participante;
        this.ID = ID;
        this.plan = plan;
        this.voto = voto;
        FechaVoto = fechaVoto;
        Comentario = comentario;
    }

    public void registrarVoto(LocalDate fechaVoto) {
        if (fechaVoto.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha del voto no puede ser futura.");
        }

    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public TipoVoto getVoto() {
        return voto;
    }

    public void setVoto(TipoVoto voto) {
        this.voto = voto;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public LocalDate getFechaVoto() {
        return FechaVoto;
    }

    public void setFechaVoto(LocalDate fechaVoto) {
        FechaVoto = fechaVoto;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Voto{");
        sb.append("participante=").append(participante);
        sb.append(", plan=").append(plan);
        sb.append(", voto=").append(voto);
        sb.append(", FechaVoto=").append(FechaVoto);
        sb.append('}');
        return sb.toString();
    }
}
