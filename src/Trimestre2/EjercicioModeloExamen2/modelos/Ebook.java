package Trimestre2.EjercicioModeloExamen2.modelos;

public class Ebook extends ContenidoDigital {

    private Integer numPages;
    private String ebookType;

    public Ebook(String title, String author, Integer year, Integer size, String ebookType, Integer numPages) {
        super(title, author, year, size);
        this.ebookType = ebookType;
        this.numPages = numPages;
    }

    public Ebook(Ebook otro) {
        super(otro);
        this.ebookType = otro.ebookType;
        this.numPages = otro.numPages;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    public String getEbookType() {
        return ebookType;
    }

    public void setEbookType(String ebookType) {
        this.ebookType = ebookType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ebook{");
        sb.append("numPages=").append(numPages);
        sb.append(", ebookType='").append(ebookType).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", year=").append(year);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getTipo() {
        return "Ebook";
    }

    @Override
    public void reproducir() {
        IO.println("Playing ebook ..." + this.title + "whit" + this.numPages);
    }
}
