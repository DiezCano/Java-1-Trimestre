package Trimestre2.Tema6.EjercicioRepasoExamen;

import java.time.LocalDate;

public class PlanPremium extends  Plan{

   private String Empresa;
   private Double SumplementoPorPersona;

    public PlanPremium(String titulo, Participante proponente, Double presupuestoEstimado, LocalDate fechaRealizacion, LocalDate fechaPropuesta, CategoriaPlan categoria, String descripcion) {
        super(titulo, proponente, presupuestoEstimado, fechaRealizacion, fechaPropuesta, categoria, descripcion);
    }

    public Double getSumplementoPorPersona() {
        return SumplementoPorPersona;
    }

    public void setSumplementoPorPersona(Double sumplementoPorPersona) {
        SumplementoPorPersona = sumplementoPorPersona;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    @Override
    public String getResumenEconomico() {
        return "";
    }

}
