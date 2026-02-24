package Trimestre2.Tema6;

public class Series {
    private String titulo;
    private String NumeroTemporadas;
    private String Genero;
    private Boolean prestado;
    private String creador;

    public Series(String titulo, String creador, Boolean prestado, String genero, String numeroTemporadas) {
        this.titulo = titulo;
        this.creador = creador;
        this.prestado = prestado;
        this.Genero = genero;
        this.NumeroTemporadas = numeroTemporadas;
    }

    public Series(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Series(String titulo, String numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.NumeroTemporadas = numeroTemporadas;
        this.Genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public String getNumeroTemporadas() {
        return NumeroTemporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void setNumeroTemporadas(String numeroTemporadas) {
        NumeroTemporadas = numeroTemporadas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Series{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", NumeroTemporadas='").append(NumeroTemporadas).append('\'');
        sb.append(", Genero='").append(Genero).append('\'');
        sb.append(", prestado=").append(prestado);
        sb.append(", creador='").append(creador).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
