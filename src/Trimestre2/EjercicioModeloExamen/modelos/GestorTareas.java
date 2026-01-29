package Trimestre2.EjercicioModeloExamen.modelos;

import java.util.ArrayList;

public class GestorTareas {

    private String nombreUsuario;
    private ArrayList<Tarea> tareas;

    public GestorTareas(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.tareas = new ArrayList<>();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void agregarTarea(Tarea nuevaTarea) {
        tareas.add(nuevaTarea);
    }

    public void eliminarTarea(Tarea tarea) {
        tareas.remove(tarea);
    }

    public Tarea buscarTarea(int id) {
        for(Tarea tarea : tareas) {
            if ( ((TareaBase) tarea).getId().equals(id) ) {
                return tarea;
            }
        }
        return null;
    }

    //--------------Metodo de filtrado-----------------

    public ArrayList<Tarea> getTareasPorEstado(EstadoTarea estado) {
        ArrayList<Tarea> lista = new ArrayList<>();
        for(Tarea tarea : tareas) {
            if ( tarea.getEstado().equals(estado) ) {
                lista.add(tarea);
            }
        }
        return lista;
    }

    public ArrayList<Tarea> getTareasPorPrioridad(PrioridadTarea prioridad) {
        ArrayList<Tarea> lista = new ArrayList<>();
        for(Tarea tarea : tareas) {
            if ( tarea.getPrioridad().equals(prioridad) ) {
                lista.add(tarea);
            }
        }
        return lista;
    }

    public ArrayList<Tarea> getTareasPorUrgentes() {
        ArrayList<Tarea> lista = new ArrayList<>();
        for(Tarea tarea : tareas) {
            if ( tarea.getTipo().equals("URGENTE")) {
                lista.add(tarea);
            }
        }
        return lista;
    }

    public ArrayList<Tarea> getTareasPendientes(EstadoTarea pendiente) {
        return getTareasPendientes(EstadoTarea.PENDIENTE);
    }

    public void listarTareas() {
        IO.println("Tareas del usuario" + nombreUsuario);
        for(Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }





}
