package Trimestre2.PracticaEvaluable;

public class Asesino extends Jugador{

    private float precisionPromedio;
    private int bajasPorPartida;

    public Asesino(int puntos, String alias, Integer id, float precisionPromedio, int bajasPorPartida) {
        super(puntos, alias, id);
        this.precisionPromedio = precisionPromedio;
        this.bajasPorPartida = bajasPorPartida;
    }

    public float getPrecisionPromedio() {
        return precisionPromedio;
    }

    public void setPrecisionPromedio(float precisionPromedio) {
        this.precisionPromedio = precisionPromedio;
    }

    public int getBajasPorPartida() {
        return bajasPorPartida;
    }

    public void setBajasPorPartida(int bajasPorPartida) {
        this.bajasPorPartida = bajasPorPartida;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Asesino{");
        sb.append("precisionPromedio=").append(precisionPromedio);
        sb.append(", bajasPorPartida=").append(bajasPorPartida);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String imprimirRol() {
        return "Apoyo";
    }

}
