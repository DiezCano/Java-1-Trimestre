package Trimestre2.Tema6.RepasoTienda.servicios;

public class StockInsuficienteException extends Exception {

    public StockInsuficienteException(String codigo) {
        super("Stock insuficiente para el producto " + codigo);
    }

}
