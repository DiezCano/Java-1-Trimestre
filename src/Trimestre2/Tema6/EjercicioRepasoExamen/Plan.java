package Trimestre2.Tema6.EjercicioRepasoExamen;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public abstract class Plan {

    private Long ID;
    private String titulo;
    private String Descripcion;
    private CategoriaPlan categoria;
    private LocalDate FechaPropuesta;
    private LocalDate FechaRealizacion;
    private Double PresupuestoEstimado;
    private EstadoPlan estado = EstadoPlan.ABIERTO;
    private Participante proponente;

    public Plan(String titulo, Participante proponente, Double presupuestoEstimado, LocalDate fechaRealizacion, LocalDate fechaPropuesta, CategoriaPlan categoria, String descripcion) {
        this.titulo = titulo;
        this.proponente = proponente;
        PresupuestoEstimado = presupuestoEstimado;
        FechaRealizacion = fechaRealizacion;
        FechaPropuesta = fechaPropuesta;
        this.categoria = categoria;
        Descripcion = descripcion;
    }

    public void validarFechas(LocalDate fechaPropuesta, LocalDate fechaRealizacion) {
        if (fechaRealizacion.isBefore(fechaPropuesta)) {
            throw new IllegalArgumentException(
                    "La fecha de realización no puede ser anterior a la fecha propuesta"
            );
        }

    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public CategoriaPlan getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaPlan categoria) {
        this.categoria = categoria;
    }

    public LocalDate getFechaPropuesta() {
        return FechaPropuesta;
    }

    public void setFechaPropuesta(LocalDate fechaPropuesta) {
        FechaPropuesta = fechaPropuesta;
    }

    public LocalDate getFechaRealizacion() {
        return FechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        FechaRealizacion = fechaRealizacion;
    }

    public EstadoPlan getEstado() {
        return estado;
    }

    public void setEstado(EstadoPlan estado) {
        this.estado = estado;
    }

    public Participante getProponente() {
        return proponente;
    }

    public void setProponente(Participante proponente) {
        this.proponente = proponente;
    }

    public Double getPresupuestoEstimado() {
        return PresupuestoEstimado;
    }

    public void setPresupuestoEstimado(Double presupuestoEstimado) {
        PresupuestoEstimado = presupuestoEstimado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Plan{");
        sb.append("PresupuestoEstimado=").append(PresupuestoEstimado);
        sb.append(", FechaRealizacion=").append(FechaRealizacion);
        sb.append(", categoria=").append(categoria);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return Objects.equals(ID, plan.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }

    public int getDiasHastaRealizacion() {
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), this.FechaRealizacion);
    }

    public abstract String getResumenEconomico();



}
