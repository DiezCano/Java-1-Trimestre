package Trimestre2.Examen2.app;

import Trimestre2.Examen2.Entidades.AnimalExotico;
import Trimestre2.Examen2.Entidades.Animales;
import Trimestre2.Examen2.Servicios.Propietario;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        Propietario proprietary1 = new Propietario("Antonio", "Requena", "1", "32125432", "antonio@gmail.com", "C/Reliquia1", "Perro");
        Propietario proprietary2 = new Propietario("Juan", "Soler", "2", "3217632", "JSER@gmail.com", "C/Lanube21", "Gato");
        Propietario proprietary3 = new Propietario("Ivan", "Casquet", "3", "34981214", "IvanCasq@gmail.com", "C/Novelas", "Viuda Negra");
        Propietario propietary4 = new Propietario("Felix", "Rodriguex", "4", "87653221", "felirs@gmail.com", "C/Elramo", "Pantera Negra");

        do {
            IO.println("Dime una opcion 1 - 7");
            IO.println("1.Listar animales registrados");
            IO.println("2.Buscar propietario por DNI");
            IO.println("3.Registrar Consulta");
            IO.println("4.Ver consultas de un animal");
            IO.println("5.Ver consultas de hoy");
            IO.println("6.Calcular ingresos totales");
            IO.println("7.Salir");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> {
                    IO.println();
                }
                case 2 -> {
                    IO.println();
                }
                case 3 -> {

                }
                case 4 -> {


                }
                case 5 -> {

                }
                case 6 -> {

                }
                case 7 -> {

                }
            }break;

        }while (opcion != 1) ;
        opcion = 0;
    }
}

