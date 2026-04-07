package Trimestre2.Examen2.Servicios;

import Trimestre2.Examen2.Entidades.Animales;
import Trimestre2.Examen2.modelo.EstadoAnimal;

import java.util.ArrayList;

public class ClaseClinica {

    private String nombre;
    private ArrayList<Propietario> propietarios;
    private ArrayList<Animales> animales;
    private ArrayList<Consulta> consultas;

    public ClaseClinica(String nombre, ArrayList<Propietario> propietarios, ArrayList<Animales> animals, ArrayList<Consulta> consultas) {
        this.nombre = nombre;
        this.propietarios = propietarios;
        this.animales = animales;
        this.consultas = consultas;
    }

    public void addPropietario(Propietario propietario){

    }

    public void addAnimal(Animales animales){

    }

    public void ListarAnimales(Animales animales){
        IO.println(animales);
    }

    public void listarConsultasDeHoy(Consulta consulta){
        IO.println(consulta);
    }

    public void buscarPropietarioPorDni(String dni){

    }

    public void BuscarAnimalPorId(Long id){

    }





}
