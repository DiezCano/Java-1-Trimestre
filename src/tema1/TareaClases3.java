package tema1;

import java.util.Scanner;

public class TareaClases3 {
    public static void main(String[] args) {

    //Lee de teclado dos valores de tipo double
    //Intercambia el valor de las variables y pintalo por pantalla
        double numero1, numero2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Un numero aleatorio: ");
        numero1 = sc.nextDouble();
        System.out.println("Un numero aleatorio: ");
        numero2 = sc.nextDouble();

        numero2 = numero1;
        numero1 = numero2;

        System.out.println((numero1 + numero2)  + ("La suma es = "));











    }
}
