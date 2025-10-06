package tema1;

import java.util.Scanner;

public class EjerciciosClaseJesus5 {
    public static void main() {

    Double total;
    Double preciofinal;
    double PRECIO;
    Scanner sc = new Scanner(System.in);
    System.out.println("Temperatura total es :");
    total = sc.nextDouble();

    PRECIO = total * 0.85;
    System.out.println("Preciofinal es : " + PRECIO);

    }
}
