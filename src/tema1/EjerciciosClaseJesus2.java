package tema1;

import java.util.Scanner;

public class EjerciciosClaseJesus2 {
    public static void main() {

        double base,altura;
        double perimetro,area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base: ");
        base = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        altura = sc.nextDouble();

        perimetro = 2 * base + 2 * altura;
        area = base*altura;

        System.out.println("El valor de la perimetro es: " + perimetro);
        System.out.println("El valor de la area es: " + area);





    }
}
