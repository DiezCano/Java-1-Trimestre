package Trimestre2.PracticaEvaluable;

public class Apoyo extends Jugador {

    private int curacionesPorPartida;
    private float eficienciaAsistencia;

    public Apoyo(int puntos, String alias, Integer id, int curacionesPorPartida, float eficienciaAsistencia) {
        super(puntos, alias, id);
        this.curacionesPorPartida = curacionesPorPartida;
        this.eficienciaAsistencia = eficienciaAsistencia;
    }

    public int getCuracionesPorPartida() {
        return curacionesPorPartida;
    }

    public void setCuracionesPorPartida(int curacionesPorPartida) {
        this.curacionesPorPartida = curacionesPorPartida;
    }

    public float getEficienciaAsistencia() {
        return eficienciaAsistencia;
    }

    public void setEficienciaAsistencia(float eficienciaAsistencia) {
        this.eficienciaAsistencia = eficienciaAsistencia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Apoyo{");
        sb.append("curacionesPorPartida=").append(curacionesPorPartida);
        sb.append(", eficienciaAsistencia=").append(eficienciaAsistencia);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String imprimirRol() {
        return "Apoyo";
    }



}
