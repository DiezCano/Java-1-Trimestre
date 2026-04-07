package Trimestre2.Examen2.Entidades;

import Trimestre2.Examen2.Servicios.Propietario;
import Trimestre2.Examen2.modelo.TipoAnimal;

import java.time.LocalDate;

public class AnimalExotico extends Animales {

    private String PaisOrigen;
    private Boolean requierePermisoCites;

    public AnimalExotico(String nombre, TipoAnimal tipo, String raza, LocalDate fechaNacimiento, double peso, Propietario propietario, String paisOrigen, Boolean requierePermisoCites) {
        super(nombre, tipo, raza, fechaNacimiento, peso, propietario);
        PaisOrigen = paisOrigen;
        this.requierePermisoCites = requierePermisoCites;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        PaisOrigen = paisOrigen;
    }

    public Boolean getRequierePermisoCites() {
        return requierePermisoCites;
    }

    public void setRequierePermisoCites(Boolean requierePermisoCites) {
        this.requierePermisoCites = requierePermisoCites;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AnimalExotico{");
        sb.append("PaisOrigen='").append(PaisOrigen).append('\'');
        sb.append(", requierePermisoCites=").append(requierePermisoCites);
        sb.append('}');
        return sb.toString();
    }




}
