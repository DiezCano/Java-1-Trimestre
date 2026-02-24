package Trimestre2.EjercicioModeloExamen.modelos;

import java.time.LocalDate;

public abstract class TareaBase implements Tarea {


    private static Integer contadorId = 1;

    protected Integer id;
    protected String titulo;
    protected String descripcion;
    protected PrioridadTarea prioridad;
    protected EstadoTarea estado;
    protected LocalDate fechaCreacion;
    protected LocalDate fechaCompletada;

    public TareaBase(String titulo, String descripcion, PrioridadTarea prioridad) {
        this.id = TareaBase.contadorId++;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = EstadoTarea.PENDIENTE;
        this.fechaCreacion = LocalDate.now(); //Fecha en el momento de la creacion
        this.fechaCompletada = null;
    }

    //------Setters--------

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(PrioridadTarea prioridad) {
        this.prioridad = prioridad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //------Getters-----------

    public static Integer getContadorId() {
        return contadorId;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public PrioridadTarea getPrioridad() {
        return prioridad;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaCompletada() {
        return fechaCompletada;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TareaBase{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", prioridad=").append(prioridad);
        sb.append(", estado=").append(estado);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", fechaCompletada=").append(fechaCompletada);
        sb.append('}');
        return sb.toString();
    }

    //-----------Metodos------------

    public void ejecutar() {
        this.estado = EstadoTarea.COMPLETADA;
        this.fechaCompletada = LocalDate.now();
    }

    @Override
    public abstract String getTipo();

    @Override
    public void mostrarDetalle() {
        IO.println(this);
    }




}
