package Trimestre2.tema4;

public class regalo {


        //Propiedades o atributos
        private String nombre;
        private Categoria categoria;
        private Double precio;

        //Constructor
        public regalo(String nombre, Categoria categroia, Double precio) {
            this.nombre = nombre;
            this.categoria = categroia;
            this.precio = precio;
        }

        //Getters

    public Categoria getCategoria() {
        return categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("regalo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
