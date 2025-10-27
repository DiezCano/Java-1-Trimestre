package Funciones;

import java.util.Scanner;


public class Funciones3 {

    public static void pintarMenu () {
        System.out.println("1. Bitcoin");
        System.out.println("2. Ethereum");
        System.out.println("3. Dogecoin");
        System.out.println("4. XRP");
        System.out.println("5. Salir");
    }

    public static void main(String[] args) {
        public static double area(double valor1, double dinero ) {
            switch (dinero) {
                case "Bitcoin":
                    return PrecioBitcion(valor1);
                case "Ethereum":
                    return PrecioEthereum(valor1);
                case "Dogecoin":
                    return PrecioDogecoin(valor1);
                case "XRP":
                    return PrecioXRP(valor1);
                default:
                    return 0;
            }
        }

    }
    public static double PrecioBitcoin(double precio) {
        return 115375 * 0,86;
    }

















    public static void main(String[] args) {
        //Menú para decir qué tipo de forma para calcular el área quieres

        Scanner sc = new Scanner(System.in);
        int opcion=-1;
        double Bitcoin,
}