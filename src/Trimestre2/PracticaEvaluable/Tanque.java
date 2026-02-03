package Trimestre2.PracticaEvaluable;

public class Tanque extends Jugador {

    private double defensaPromedio;
    private double dañoRecibido;

    public Tanque(int puntos, String alias, Integer id, double dañoRecibido, double defensaPromedio) {
        super(puntos, alias, id);
        this.dañoRecibido = dañoRecibido;
        this.defensaPromedio = defensaPromedio;
    }

    public double getDefensaPromedio() {
        return defensaPromedio;
    }

    public void setDefensaPromedio(double defensaPromedio) {
        this.defensaPromedio = defensaPromedio;
    }

    public double getDañoRecibido() {
        return dañoRecibido;
    }

    public void setDañoRecibido(double dañoRecibido) {
        this.dañoRecibido = dañoRecibido;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tanque{");
        sb.append("defensaPromedio=").append(defensaPromedio);
        sb.append(", dañoRecibido=").append(dañoRecibido);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String imprimirRol() {
        return "";
    }
}
