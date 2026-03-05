package Trimestre2.Tema6.RepasoTienda.app;

import Trimestre2.Tema6.RepasoTienda.Entidades.Equipamiento;
import Trimestre2.Tema6.RepasoTienda.Entidades.RopaDeportiva;
import Trimestre2.Tema6.RepasoTienda.servicios.Tiendas;

public class Aplicacion {
    static void main(String[] args) {

           //

            //Menú
            int opcion = 0;
            do {
                IO.println("--- TIENDA ---");
                IO.println("1. Mostrar inventario");
                IO.println("2. Mostrar historial compras");
                IO.println("3. Realizar compra");
                IO.println("4. Salir");
                IO.println("Introduce opción");

                try {
                    opcion = Integer.parseInt(IO.readln());
                    switch (opcion) {
                        //case 1 -> Tiendas.mostrarInventario();
                        //case 2 -> Tiendas.mostrarHistorialCompras();
                        case 3 -> {
                            IO.println("Introduce código del producto");
                            String codigo = IO.readln();
                            IO.println("Introduce cantidad");
                            int cantidad = Integer.parseInt(IO.readln());
                            //Tiendas.realizarCompra(codigo, cantidad);
                        }
                        case 4 -> IO.println("Hasta pronto");
                    }
                } catch (Exception e) {
                    IO.println("ERROR: " + e.getMessage());
                }

            } while (opcion != 4);

        }

    }

