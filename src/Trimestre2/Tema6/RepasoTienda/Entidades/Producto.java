package Trimestre2.Tema6.RepasoTienda.Entidades;

public interface Producto {

    String getCodigo();
    String getNombre();
    Double getPrecio();
    Integer getStock();
    void descontarStock(int cantidad);
    String getInfo();

}
