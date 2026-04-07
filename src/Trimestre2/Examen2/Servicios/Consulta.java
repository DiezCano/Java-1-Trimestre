package Trimestre2.Examen2.Servicios;

import Trimestre2.Examen2.Entidades.Animales;
import Trimestre2.Examen2.modelo.Facturable;
import Trimestre2.Examen2.modelo.TipoConsulta;

import java.time.LocalDate;

public class Consulta implements Facturable {

    private Animales animal;
    private String veterinario;
    private LocalDate fecha;
    private TipoConsulta tipo;
    private String diagnostico;
    private String tratamiento;
    private Double precioTotal;

    public Consulta(Animales animal, String veterinario, LocalDate fecha, TipoConsulta tipo, String diagnostico, String tratamiento) {
        this.animal = animal;
        this.veterinario = veterinario;
        this.fecha = fecha;
        this.tipo = tipo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public Animales getAnimal() {
        return animal;
    }

    public void setAnimal(Animales animal) {
        this.animal = animal;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public TipoConsulta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConsulta tipo) {
        this.tipo = tipo;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Consulta{");
        sb.append("animal=").append(animal);
        sb.append(", veterinario='").append(veterinario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", tipo=").append(tipo);
        sb.append(", diagnostico='").append(diagnostico).append('\'');
        sb.append(", tratamiento='").append(tratamiento).append('\'');
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }

}
