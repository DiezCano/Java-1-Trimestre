package Trimestre2.Tema6;

public class VideoJuego {
    private String titulo;
    private Integer HorasEstimadas = 100;
    private String genero;
    private String desarrolador;
    private Boolean prestado = false;

    public VideoJuego(String titulo, Boolean prestado, String desarrolador, String genero, Integer horasEstimadas) {
        this.titulo = titulo;
        this.prestado = prestado;
        this.desarrolador = desarrolador;
        this.genero = genero;
        this.HorasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, Integer horasEstimadas) {
        this.titulo = titulo;
        this.HorasEstimadas = horasEstimadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDesarrolador() {
        return desarrolador;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getHorasEstimadas() {
        return HorasEstimadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDesarrolador(String desarrolador) {
        this.desarrolador = desarrolador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        HorasEstimadas = horasEstimadas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VideoJuego{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", HorasEstimadas=").append(HorasEstimadas);
        sb.append(", genero='").append(genero).append('\'');
        sb.append(", desarrolador='").append(desarrolador).append('\'');
        sb.append(", prestado=").append(prestado);
        sb.append('}');
        return sb.toString();
    }

}
