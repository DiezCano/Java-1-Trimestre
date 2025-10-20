package tema2;

import java.util.Scanner;

public class Ejercicio3Acumuladores {
    public static void main(String[] args) {

        //Pide 5 precio de un producto y la cantidad de cada uno de ellos
        //Precio - Cantidad
        //Precio - Cantidad
        //Precio - Cantidad
        //Precio - Cantidad
        //Precio - Cantidad

        //Muestra el total de la compra

        Scanner sc = new Scanner(System.in);
        double precio;
        int cantidad;
        double acumulador=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Dime precio");
            precio = sc.nextDouble();
            System.out.println("Dime cantidad");
            cantidad = sc.nextInt();

            acumulador = acumulador + (precio * cantidad);
        }
        System.out.println("El resultado es: " + acumulador);
    }
}
