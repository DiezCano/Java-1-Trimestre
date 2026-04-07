package Trimestre2.Examen2.Servicios;

import Trimestre2.Examen2.Entidades.Animales;
import Trimestre2.Examen2.Entidades.Persona;

import java.util.ArrayList;

public class Propietario extends Persona {

    private String direccion;
    ArrayList<Animales> animales;

    public Propietario(String nombre, String apellidos, String dni, String telefono, String email, String direccion, String perro) {
        super(nombre, apellidos, dni, telefono, email);
        this.direccion = direccion;
        this.animales = animales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Animales> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animales> animales) {
        this.animales = animales;
    }

    public void addAnimal(Animales a){

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Propietario{");
        sb.append("direccion='").append(direccion).append('\'');
        sb.append(", animales=").append(animales);
        sb.append('}');
        return sb.toString();
    }

}
