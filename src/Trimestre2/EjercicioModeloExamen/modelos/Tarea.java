package Trimestre2.EjercicioModeloExamen.modelos;

public interface Tarea {

    void ejecutar();
    PrioridadTarea getPrioridad();
    EstadoTarea getEstado();
    String getDescripcion();
    String getTipo();
    void mostrarDetalle();


}
