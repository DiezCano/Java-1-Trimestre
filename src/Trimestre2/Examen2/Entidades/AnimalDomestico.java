package Trimestre2.Examen2.Entidades;

import Trimestre2.Examen2.Servicios.Propietario;
import Trimestre2.Examen2.modelo.TipoAnimal;
import Trimestre2.Examen2.modelo.TipoConsulta;

import java.time.LocalDate;

public class AnimalDomestico extends Animales {

    private Boolean castrado;
    private Boolean tieneChip;

    public AnimalDomestico(String nombre, TipoAnimal tipo, String raza, LocalDate fechaNacimiento, double peso, Propietario propietario, Boolean castrado, Boolean tieneChip) {
        super(nombre, tipo, raza, fechaNacimiento, peso, propietario);
        this.castrado = castrado;
        this.tieneChip = tieneChip;
    }

    public Boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(Boolean castrado) {
        this.castrado = castrado;
    }

    public Boolean getTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(Boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AnimalDomestico{");
        sb.append("castrado=").append(castrado);
        sb.append(", tieneChip=").append(tieneChip);
        sb.append('}');
        return sb.toString();
    }

    public void calcularCosteConsulta(TipoConsulta tipo) {

        if (tipo == TipoConsulta.REVISION){

        }
        if (tipo == TipoConsulta.VACUNA){

        }
        if (tipo == TipoConsulta.CIRUGIA){

        }
        if (tipo == TipoConsulta.URGENCIA){

        }

    }

}
