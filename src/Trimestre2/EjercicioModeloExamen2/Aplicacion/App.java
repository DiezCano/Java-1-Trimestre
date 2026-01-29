package Trimestre2.EjercicioModeloExamen2.Aplicacion;

import Trimestre2.EjercicioModeloExamen2.modelos.AudioLibro;
import Trimestre2.EjercicioModeloExamen2.modelos.ContenidoDigital;
import Trimestre2.EjercicioModeloExamen2.modelos.Ebook;
import Trimestre2.EjercicioModeloExamen2.modelos.Libro;
import Trimestre2.EjercicioModeloExamen2.servicio.Biblioteca;

public class App {
    static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Howarts");



        AudioLibro cd1 = new AudioLibro("El Dios","Patricio Estrella",2028,8,160,"Manolo Lama");
        Ebook cd2 = new Ebook("Aida La Vuelta" , "Maldini",2012,5,"Eso",500);
        Libro lb1 = new Libro("Felix en el Paraiso","KingMono",2005);

        IO.println(cd1);
        IO.println(cd1.getTipo());
        cd1.reproducir();



        IO.println(cd2);
        IO.println(cd2.getTipo());
        cd2.reproducir();

        biblioteca.addContenido(cd1);
        biblioteca.addContenido(cd2);

        IO.println(lb1);



    }
}
