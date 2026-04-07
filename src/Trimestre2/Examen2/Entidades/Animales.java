package Trimestre2.Examen2.Entidades;

import Trimestre2.Examen2.Servicios.Propietario;
import Trimestre2.Examen2.modelo.EstadoAnimal;
import Trimestre2.Examen2.modelo.TipoAnimal;

import java.time.LocalDate;
import java.util.Objects;

public class Animales {

    private Long id;
    private String nombre;
    private TipoAnimal tipo;
    private String raza;
    private LocalDate FechaNacimiento;
    private double peso;
    private EstadoAnimal estado = EstadoAnimal.ALTA;
    private Propietario propietario;

    public Animales(String nombre, TipoAnimal tipo, String raza, LocalDate fechaNacimiento, double peso, Propietario propietario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        FechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.propietario = propietario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Animal{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", raza='").append(raza).append('\'');
        sb.append(", FechaNacimiento=").append(FechaNacimiento);
        sb.append(", peso=").append(peso);
        sb.append(", estado=").append(estado);
        sb.append(", propietario=").append(propietario);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animales animal = (Animales) o;
        return Objects.equals(id, animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
