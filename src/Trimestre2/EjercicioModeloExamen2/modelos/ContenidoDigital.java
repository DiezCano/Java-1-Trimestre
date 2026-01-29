package Trimestre2.EjercicioModeloExamen2.modelos;

import java.util.Objects;
import java.util.UUID;

public abstract class ContenidoDigital  extends Libro{

    protected Integer size; // MB

    public ContenidoDigital(String title, String author, Integer year, Integer size) {
        super(title,author,year);
        this.size = size;
    }

    public ContenidoDigital(ContenidoDigital otro) {
        super(otro);
        this.size = otro.size;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContenidoDigital{");
        sb.append("size=").append(size);
        sb.append(", id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }

    public abstract String getTipo();
    public abstract void reproducir();


}
