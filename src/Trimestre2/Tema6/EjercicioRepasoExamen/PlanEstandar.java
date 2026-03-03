package Trimestre2.Tema6.EjercicioRepasoExamen;

import java.time.LocalDate;

public class PlanEstandar extends  Plan {

    private String Empresa;
    private Double SuplementoPorPersona;

    public PlanEstandar(String titulo, Participante proponente, Double presupuestoEstimado, LocalDate fechaRealizacion, LocalDate fechaPropuesta, CategoriaPlan categoria, String descripcion, String empresa, Double suplementoPorPersona) {
        super(titulo, proponente, presupuestoEstimado, fechaRealizacion, fechaPropuesta, categoria, descripcion);
        Empresa = empresa;
        SuplementoPorPersona = suplementoPorPersona;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public Double getSuplementoPorPersona() {
        return SuplementoPorPersona;
    }

    public void setSuplementoPorPersona(Double suplementoPorPersona) {
        SuplementoPorPersona = suplementoPorPersona;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PlanEstandar{");
        sb.append("Empresa='").append(Empresa).append('\'');
        sb.append(", SuplementoPorPersona=").append(SuplementoPorPersona);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getResumenEconomico() {
        return "";
    }


}
